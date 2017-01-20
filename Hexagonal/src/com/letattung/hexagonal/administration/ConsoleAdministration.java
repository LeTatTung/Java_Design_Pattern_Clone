/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.administration;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.letattung.hexagonal.domain.LotteryAdministration;
import com.letattung.hexagonal.domain.LotteryNumbers;
import com.letattung.hexagonal.domain.LotteryService;
import com.letattung.hexagonal.module.LotteryModule;
import com.letattung.hexagonal.mongo.MongoConnectionPropertiesLoader;
import com.letattung.hexagonal.sampledata.SampleData;

public class ConsoleAdministration {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleAdministration.class);
	
	public static void main(String [] args){
		
		MongoConnectionPropertiesLoader.load();
		Injector injector = Guice.createInjector(new LotteryModule());
		LotteryAdministration administration = injector.getInstance(LotteryAdministration.class);
		LotteryService service = injector.getInstance(LotteryService.class);
		SampleData.submitTickets(service, 20);
		try(Scanner scanner = new Scanner(System.in)){
			boolean exit = false;
			while (!exit){
				printMainMenu();
				String cmd = readString(scanner);
				if ("1".equals(cmd)){
					administration.getAllSubmittedTickets().forEach((k, v) -> LOGGER.info("Key: {}, Value: {}", k, v));
				}else if ("2".equals(cmd)){
					LotteryNumbers numbers = administration.performLottery();
					LOGGER.info("The winning numbers: {}", numbers.getNumbersAsString());
			        LOGGER.info("Time to reset the database for next round, eh?");
				}else if ("3".equals(cmd)){
					administration.resetLottery();
					LOGGER.info("The lottery ticket database was cleared.");
				}else if ("4".equals(cmd)){
					exit = true;
				}else {
					LOGGER.info("Unknown command: {}", cmd);
				}
			}
		}
	}
	
	private static void printMainMenu(){
		
		LOGGER.info("");
		LOGGER.info("### Lottery Administration Console ###");
	    LOGGER.info("(1) Show all submitted tickets");
	    LOGGER.info("(2) Perform lottery draw");
	    LOGGER.info("(3) Reset lottery ticket database");
	    LOGGER.info("(4) Exit");
	}
	
	private static String readString(Scanner scanner){
		System.out.println("> ");
		return scanner.next();
	}
}
