/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

import org.bson.Document;

import com.letattung.hexagonal.domain.LotteryNumbers;
import com.letattung.hexagonal.domain.LotteryTicket;
import com.letattung.hexagonal.domain.LotteryTicketId;
import com.letattung.hexagonal.domain.PlayerDetails;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoTicketRepository implements LotteryTicketRepository{

	private static final String DEFAULT_DB = "lotteryDB";
	private static final String DEFAULT_TICKETS_COLLECTION = "lotterytickets";
	private static final String DEFAULT_COUNTERS_COLLECTION = "counters";
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	private MongoCollection<Document> ticketsCollection;
	private MongoCollection<Document> countersCollection;
	
	public MongoTicketRepository(){
		connect();
	}
	
	public MongoTicketRepository(String dbName, String ticketsCollectionName, String countersCollectionName) {
		connect(dbName, ticketsCollectionName, countersCollectionName);
	}
	
	public void connect(){
		connect(DEFAULT_DB, DEFAULT_TICKETS_COLLECTION, DEFAULT_COUNTERS_COLLECTION);
	}
	
	public void connect(String dbName, String ticketsCollectionName, String countersCollectionName){
		
		if (mongoClient != null){
			mongoClient.close();
		}
		mongoClient = new MongoClient(System.getProperty("mongo-host"), 
				Integer.parseInt(System.getProperty("mongo-port")));
		database = mongoClient.getDatabase(dbName);
		ticketsCollection = database.getCollection(ticketsCollectionName);
		countersCollection = database.getCollection(countersCollectionName);
		if (countersCollection.count() < 0){
			initCounters();
		}
	}
	
	private void initCounters(){
		
		Document document = new Document("_id","ticketId").append("seq", 1);
		countersCollection.insertOne(document);
	}
	
	public int getNextId(){
		
		Document find = new Document("_id", "ticketId");
		Document increase = new Document("seq", 1);
		Document update = new Document("$inc", increase);
		Document result = countersCollection.findOneAndUpdate(find, update);
		return result.getInteger("seq");
		
	}
	
	public MongoClient getMongoClient() {
		return mongoClient;
	}

	public MongoDatabase getDatabase() {
		return database;
	}

	public MongoCollection<Document> getTicketsCollection() {
		return ticketsCollection;
	}

	public MongoCollection<Document> getCountersCollection() {
		return countersCollection;
	}

	@Override
	public Optional<LotteryTicket> findById(LotteryTicketId id) {
		
		Document find = new Document("ticketId", id.getId());
		ArrayList<Document> results = ticketsCollection.find(find).limit(1).into(new ArrayList<Document>());
		if (results.size() > 0){
			LotteryTicket lotteryTicket = docToTicket(results.get(0));
			return Optional.of(lotteryTicket);
		}else{
			return Optional.empty();
		}
	}

	@Override
	public Optional<LotteryTicketId> save(LotteryTicket ticket) {
		
		int ticketId = getNextId();
		Document document = new Document("ticketId", ticketId);
		
		document.put("email", ticket.getPlayerDetails().getEmail());
	    document.put("bank", ticket.getPlayerDetails().getBankAccount());
	    document.put("phone", ticket.getPlayerDetails().getPhone());
	    document.put("numbers", ticket.getNumbers().getNumbersAsString());
	    
	    ticketsCollection.insertOne(document);
	    return Optional.of(new LotteryTicketId(ticketId));
	}

	@Override
	public Map<LotteryTicketId, LotteryTicket> findAll() {
		
		Map<LotteryTicketId, LotteryTicket> map = new HashMap<>();
		ArrayList<Document> documents = ticketsCollection.find(new Document()).into(new ArrayList<>());
		for (Document document : documents){
			LotteryTicket lotteryTicket = docToTicket(document);
			map.put(lotteryTicket.getId(), lotteryTicket);
		}
		return map;
	}

	@Override
	public void deleteAll() {
		ticketsCollection.deleteMany(new Document());
	}

	private LotteryTicket docToTicket(Document document){
		
		PlayerDetails playerDetails = new PlayerDetails(document.getString("email"), document.getString("bank"),
				document.getString("phone"));
		int [] numArray = Arrays.asList(document.getString("numbers").split(",")).stream().mapToInt(Integer::parseInt).toArray();
		HashSet<Integer> numbers = new HashSet<>();
		for (int num : numArray){
			numbers.add(num);
		}
		LotteryNumbers lotteryNumbers = LotteryNumbers.create(numbers);
		return new LotteryTicket(new LotteryTicketId(document.getInteger("ticketId")), playerDetails, lotteryNumbers);
	}
}
