/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.module;

import com.google.inject.AbstractModule;
import com.letattung.hexagonal.banking.InMemoryBank;
import com.letattung.hexagonal.banking.WireTransfers;
import com.letattung.hexagonal.database.InMemoryTicketRepository;
import com.letattung.hexagonal.database.LotteryTicketRepository;
import com.letattung.hexagonal.eventlog.LotteryEventLog;
import com.letattung.hexagonal.eventlog.StdOutEventLog;

public class LotteryTestingModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(LotteryTicketRepository.class).to(InMemoryTicketRepository.class);
		bind(LotteryEventLog.class).to(StdOutEventLog.class);
		bind(WireTransfers.class).to(InMemoryBank.class);
	}
	
}
