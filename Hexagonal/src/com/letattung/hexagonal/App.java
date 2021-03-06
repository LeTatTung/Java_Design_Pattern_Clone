/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.letattung.hexagonal.domain.LotteryAdministration;
import com.letattung.hexagonal.domain.LotteryService;
import com.letattung.hexagonal.module.LotteryTestingModule;
import com.letattung.hexagonal.sampledata.SampleData;

public class App {

	public static void main(String [] args){
		
		Injector injector = Guice.createInjector(new LotteryTestingModule());
		LotteryAdministration administration = injector.getInstance(LotteryAdministration.class);
		administration.resetLottery();
		
		LotteryService service = injector.getInstance(LotteryService.class);
		SampleData.submitTickets(service, 20);
		
		administration.performLottery();
	}
}
