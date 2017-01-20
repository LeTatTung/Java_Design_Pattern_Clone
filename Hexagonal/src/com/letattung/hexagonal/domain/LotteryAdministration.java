/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.domain;

import java.util.Map;

import com.google.inject.Inject;
import com.letattung.hexagonal.banking.WireTransfers;
import com.letattung.hexagonal.database.LotteryTicketRepository;
import com.letattung.hexagonal.eventlog.LotteryEventLog;

public class LotteryAdministration {

	private final LotteryTicketRepository repository;
	private final LotteryEventLog notifications;
	private final WireTransfers wireTransfers;
	
	@Inject
	public LotteryAdministration(LotteryTicketRepository repository, LotteryEventLog notifications, 
			WireTransfers wireTransfers) {
		this.repository = repository;
		this.notifications = notifications;
		this.wireTransfers = wireTransfers;
	}
	
	public Map<LotteryTicketId, LotteryTicket> getAllSubmittedTickets(){
		return repository.findAll();
	}
	
	public LotteryNumbers performLottery(){
		
		LotteryNumbers numbers = LotteryNumbers.createRandom();
		Map<LotteryTicketId, LotteryTicket> tickets = getAllSubmittedTickets();
		for (LotteryTicketId id : tickets.keySet()){
			LotteryTicketCheckResult result = LotteryUtils.checkTicketForPrize(repository, id, numbers);
			if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.WIN_PRIZE)){
				boolean transferred = wireTransfers.transferFunds(LotteryConstants.PRIZE_AMOUNT, 
						LotteryConstants.SERVICE_BANK_ACCOUNT, tickets.get(id).getPlayerDetails().getBankAccount());
				if (transferred){
					notifications.ticketWon(tickets.get(id).getPlayerDetails(), LotteryConstants.PRIZE_AMOUNT);
				}else{
					notifications.prizeError(tickets.get(id).getPlayerDetails(), LotteryConstants.PRIZE_AMOUNT);
				}
			}else if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.NO_PRIZE)){
				notifications.ticketDidNotWin(tickets.get(id).getPlayerDetails());
			}
		}
		return numbers;
	}
	
	public void resetLottery(){
		repository.deleteAll();
	}
}
