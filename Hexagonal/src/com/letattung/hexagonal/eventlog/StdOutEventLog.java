/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.eventlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.hexagonal.domain.PlayerDetails;

public class StdOutEventLog implements LotteryEventLog{

	private static final Logger LOGGER = LoggerFactory.getLogger(StdOutEventLog.class);
	
	@Override
	public void ticketSubmitted(PlayerDetails details) {
		LOGGER.info("Lottery ticket for {} was submitted. Bank account {} was charged for 3 credits.", 
				details.getEmail(), details.getBankAccount());
	}

	@Override
	public void ticketSubmitError(PlayerDetails details) {
		LOGGER.info("Lottery ticket for {} could not be submitted because the credit transfer of 3 credits failed.", 
				details.getEmail());
	}

	@Override
	public void ticketDidNotWin(PlayerDetails details) {
		LOGGER.info("Lottery ticket for {} was checked and unfortunately did not win this time.", 
				details.getEmail());
	}

	@Override
	public void ticketWon(PlayerDetails details, int prizeAmount) {
		LOGGER.info("Lottery ticket for {} has won! The bank account {} was deposited with {} credits.", 
				details.getEmail(), details.getBankAccount(), prizeAmount);
	}

	@Override
	public void prizeError(PlayerDetails details, int prizeAmount) {
		LOGGER.info("Lottery ticket for {} has won! Unfortunately the bank credit transfer of {} failed.", 
				details.getEmail(), prizeAmount);
	}

}
