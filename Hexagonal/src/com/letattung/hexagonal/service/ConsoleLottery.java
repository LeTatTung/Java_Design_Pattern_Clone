/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.letattung.hexagonal.banking.WireTransfers;
import com.letattung.hexagonal.domain.LotteryNumbers;
import com.letattung.hexagonal.domain.LotteryService;
import com.letattung.hexagonal.domain.LotteryTicket;
import com.letattung.hexagonal.domain.LotteryTicketCheckResult;
import com.letattung.hexagonal.domain.LotteryTicketId;
import com.letattung.hexagonal.domain.PlayerDetails;
import com.letattung.hexagonal.module.LotteryModule;
import com.letattung.hexagonal.mongo.MongoConnectionPropertiesLoader;

public class ConsoleLottery {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleLottery.class);
	
	public static void main(String [] args){
		
		MongoConnectionPropertiesLoader.load();
		Injector injector = Guice.createInjector(new LotteryModule());
		LotteryService service = injector.getInstance(LotteryService.class);
		WireTransfers bank = injector.getInstance(WireTransfers.class);
		try(final Scanner scanner = new Scanner(System.in)){
			boolean exit = false;
			while (!exit){
				printMainMenu();
				String cmd = readString(scanner);
				if ("1".equals(cmd)){
					queryLotteryAccountFunds(bank, scanner);
				}else if ("2".equals(cmd)){
					addFundsLotteryAccount(bank, scanner);
				}else if ("3".equals(cmd)){
					submitTicket(service, scanner);
				}else if ("4".equals(cmd)){
					checkTicket(service, scanner);
				}else if ("5".equals(cmd)){
					exit = true;
				}else {
					LOGGER.info("Unknown command");
				}
			}
		}
	}
	
	private static void checkTicket(LotteryService service, Scanner scanner){
		
		LOGGER.info("What is the ID of the lottery ticket?");
		String id = readString(scanner);
		LOGGER.info("Give the 4 comma separated winning numbers?");
		String numbers = readString(scanner);
		try{
			String [] parts = numbers.split(",");
			Set<Integer> winningNumbers = new HashSet<>();
			for (int i = 0; i < 4; i++){
				winningNumbers.add(Integer.parseInt(parts[i]));
			}
			LotteryTicketCheckResult result = service.checkTicketForPrize(new LotteryTicketId(Integer.parseInt(id)), 
					LotteryNumbers.create(winningNumbers));
			if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.WIN_PRIZE)){
				LOGGER.info("Congratulations ! The lottery ticket has won");
			}else if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.NO_PRIZE)){
				LOGGER.info("Unfortunately the lottery ticket did not win");
			}else {
				LOGGER.info("Such lottery ticket has not been submitted");
			}
		}catch(Exception e){
			LOGGER.info("Failed checking the lottery ticket - please try agian");
		}
	}
	
	private static void submitTicket(LotteryService service, Scanner scanner){
		
		LOGGER.info("What is your email address?");
		String email = readString(scanner);
		LOGGER.info("What is your bank account number?");
		String account = readString(scanner);
		LOGGER.info("What is your phone number?");
		String phone = readString(scanner);
		PlayerDetails details = new PlayerDetails(email, account, phone);
		LOGGER.info("Give 4 comma separated lottery numbers?");
		String numbers = readString(scanner);
		try{
			String [] parts = numbers.split(",");
			Set<Integer> chosen = new HashSet<>();
			for (int i = 0; i < 4; i++){
				chosen.add(Integer.parseInt(parts[i]));
				LotteryNumbers lotteryNumbers = LotteryNumbers.create(chosen);
				LotteryTicket lotteryTicket = new LotteryTicket(new LotteryTicketId(), details, lotteryNumbers);
				Optional<LotteryTicketId> id = service.submitTicket(lotteryTicket);
				if (id.isPresent()){
					LOGGER.info("Submitted lottery ticket with id: {}", id.get());
				}else{
					LOGGER.info("Failed submitting lottery ticket - please try again.");
				}
			}
		}catch(Exception e){
			LOGGER.info("Failed submitting lottery ticket - please try again.");
		}
	}
	
	private static void addFundsLotteryAccount(WireTransfers bank, Scanner scanner){
		
		LOGGER.info("What is the account number?");
		String account = readString(scanner);
		LOGGER.info("How many credits do you want to deposit?");
		String amount = readString(scanner);
		bank.setFunds(account, Integer.parseInt(amount));
		LOGGER.info("The account {} now has {} credits.", account, bank.getFunds(account));
	}
	
	private static void queryLotteryAccountFunds(WireTransfers bank, Scanner scanner){
		
		LOGGER.info("What is the account number?");
		String account = readString(scanner);
		LOGGER.info("The account {} has {} credits.", account, bank.getFunds(account));
	}
	
	private static void printMainMenu(){
		
		LOGGER.info("");
		LOGGER.info("### Lottery Service Console ###");
	    LOGGER.info("(1) Query lottery account funds");
	    LOGGER.info("(2) Add funds to lottery account");
	    LOGGER.info("(3) Submit ticket");
	    LOGGER.info("(4) Check ticket");
	    LOGGER.info("(5) Exit");
	}
	
	private static String readString(Scanner scanner){
		System.out.println("> ");
		return scanner.next();
	}
}
