package com.letattung.hexagonal.domain;

import java.util.Optional;

import com.google.inject.Inject;
import com.letattung.hexagonal.banking.WireTransfers;
import com.letattung.hexagonal.database.LotteryTicketRepository;
import com.letattung.hexagonal.eventlog.LotteryEventLog;

public class LotteryService {

	private final LotteryTicketRepository repository;
	private final LotteryEventLog notifications;
	private final WireTransfers wireTransfers;
	
	@Inject
	public LotteryService(LotteryTicketRepository repository, LotteryEventLog notifications, WireTransfers wireTransfers){
		this.repository = repository;
		this.notifications = notifications;
		this.wireTransfers = wireTransfers;
	}
	
	public Optional<LotteryTicketId> submitTicket(LotteryTicket ticket){
		
		boolean result = wireTransfers.transferFunds(LotteryConstants.TICKET_PRIZE, 
				ticket.getPlayerDetails().getBankAccount(), LotteryConstants.SERVICE_BANK_ACCOUNT);
		if (!result){
			notifications.ticketSubmitError(ticket.getPlayerDetails());
			return Optional.empty();
		}
		Optional<LotteryTicketId> optional = repository.save(ticket);
		if (optional.isPresent()){
			notifications.ticketSubmitted(ticket.getPlayerDetails());
		}
		return optional;
	}
	
	public LotteryTicketCheckResult checkTicketForPrize(LotteryTicketId id, LotteryNumbers winningNumbers){
		return LotteryUtils.checkTicketForPrize(repository, id, winningNumbers);
	}
}
