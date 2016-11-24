/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public final class DbManager {

	private static MongoClient mongoClient;
	private static MongoDatabase db;
	private static boolean useMongoDB;
	
	private static Map<String, UserAccount> vitualDB;
	private DbManager(){
		
	}
	
	// create DB
	public static void createVitualDb(){
		useMongoDB = false;
		vitualDB = new HashMap<>();
	}
	// connect to DB
	public static void connect() throws ParseException{
		useMongoDB = true;
		mongoClient = new MongoClient();
		db = mongoClient.getDatabase("test");
	}
	// read user account from DB
	public static UserAccount readFromDb(String userId){
		if(!useMongoDB){
			if(vitualDB.containsKey(userId)){
				return vitualDB.get(userId);
			}
			return null;
		}
		if(db == null){
			try{
				connect();
				}catch(ParseException e){
					e.printStackTrace();
				}
		}
		FindIterable<Document> iterable = db.getCollection("user_accounts").find(new Document("userID", userId));
		if(iterable == null){
			return null;
		}
		Document doc = iterable.first();
		return new UserAccount(userId, doc.getString("userName"), doc.getString("additionalInfo"));
	}
	// write user account to DB
	public static void writeToDb(UserAccount userAccount){
		if(!useMongoDB){
			vitualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if(db == null){
			try{
			connect();	
			}catch(ParseException e){
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").insertOne(
		        new Document("userID", userAccount.getUserId()).append("userName",
		            userAccount.getUserName()).append("additionalInfo", userAccount.getAdditionalInfo()));
	}
	//update DB
	public static void updateDb(UserAccount userAccount){
		if(!useMongoDB){
			vitualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if(db == null){
			try{
				connect();
			}catch(ParseException e){
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(
		        new Document("userID", userAccount.getUserId()),
		        new Document("$set", new Document("userName", userAccount.getUserName()).append(
		            "additionalInfo", userAccount.getAdditionalInfo())));
	}
	public static void upsertDb(UserAccount userAccount){
		if(!useMongoDB){
			vitualDB.put(userAccount.getUserId(), userAccount);
			return;
		}
		if(db == null){
			try{
				connect();
			}catch(ParseException e){
				e.printStackTrace();
			}
		}
		db.getCollection("user_accounts").updateOne(
		        new Document("userID", userAccount.getUserId()),
		        new Document("$set", new Document("userName", userAccount.getUserName()).append(
		            "additionalInfo", userAccount.getAdditionalInfo())));
	}
}
