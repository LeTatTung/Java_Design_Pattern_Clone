/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.module;

import com.google.inject.AbstractModule;
import com.letattung.hexagonal.banking.MongoBank;
import com.letattung.hexagonal.banking.WireTransfers;
import com.letattung.hexagonal.database.LotteryTicketRepository;
import com.letattung.hexagonal.database.MongoTicketRepository;
import com.letattung.hexagonal.eventlog.LotteryEventLog;
import com.letattung.hexagonal.eventlog.MongoEventLog;

public class LotteryModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(LotteryTicketRepository.class).to(MongoTicketRepository.class);
		bind(LotteryEventLog.class).to(MongoEventLog.class);
		bind(WireTransfers.class).to(MongoBank.class);
	}

}
