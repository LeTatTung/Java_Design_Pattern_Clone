/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.domain;

public class LotteryTicketCheckResult {

	public enum CheckResult { WIN_PRIZE, NO_PRIZE, TICKET_NOT_SUBMITTED }

	private final CheckResult checkResult;
	private final int prizeAmount;
	
	public LotteryTicketCheckResult(CheckResult checkResult) {
		this.checkResult = checkResult;
		prizeAmount = 0;
	}
	
	public LotteryTicketCheckResult(CheckResult result, int amount){
		this.checkResult = result;
		this.prizeAmount = amount;
	}
	
	public CheckResult getResult(){
		return checkResult;
	}
	
	public int getAmount(){
		return prizeAmount;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((checkResult == null) ? 0 : checkResult.hashCode());
		result = prime * result + prizeAmount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		LotteryTicketCheckResult other = (LotteryTicketCheckResult) obj;
		
		return checkResult == other.checkResult && prizeAmount == other.prizeAmount;
	}
}
