/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.eventlog;

import com.letattung.hexagonal.domain.PlayerDetails;

public interface LotteryEventLog {

	void ticketSubmitted(PlayerDetails details);
	
	void ticketSubmitError(PlayerDetails details);
	
	void ticketDidNotWin(PlayerDetails details);
	
	void ticketWon(PlayerDetails details, int prizeAmount);
	
	void prizeError(PlayerDetails details, int prizeAmount);
}
