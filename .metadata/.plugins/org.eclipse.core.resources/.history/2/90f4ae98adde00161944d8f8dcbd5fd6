package com.letattung.hexagonal.database;

import java.util.Map;
import java.util.Optional;

import com.letattung.hexagonal.domain.LotteryTicket;
import com.letattung.hexagonal.domain.LotteryTicketId;

public interface LotteryTicketRepository {
	
	Optional<LotteryTicket> findById(LotteryTicketId id);
	
	Optional<LotteryTicketId> save(LotteryTicket ticket);
	
	Map<LotteryTicketId, LotteryTicket> findAll();
	
	void deleteAll();
}
