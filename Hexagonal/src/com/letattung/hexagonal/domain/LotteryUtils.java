/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.domain;

import java.util.Optional;

import com.letattung.hexagonal.database.LotteryTicketRepository;

public class LotteryUtils {

	private LotteryUtils() {}
	
	public static LotteryTicketCheckResult checkTicketForPrize(LotteryTicketRepository repository, LotteryTicketId id,
            LotteryNumbers winningNumbers){
		
		Optional<LotteryTicket> optional = repository.findById(id);
		if (optional.isPresent()){
			if (optional.get().getNumbers().equals(winningNumbers)){
				return new LotteryTicketCheckResult(LotteryTicketCheckResult.CheckResult.WIN_PRIZE, 1000);
			}else{
				return new LotteryTicketCheckResult(LotteryTicketCheckResult.CheckResult.NO_PRIZE);
			}
		}else{
			return new LotteryTicketCheckResult(LotteryTicketCheckResult.CheckResult.TICKET_NOT_SUBMITTED);
		}
	}
}
