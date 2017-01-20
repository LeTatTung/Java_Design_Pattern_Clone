/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.domain;

public class LotteryTicket {

	private LotteryTicketId id;
	private final PlayerDetails playerDetails;
	private final LotteryNumbers lotteryNumbers;
	
	public LotteryTicket(LotteryTicketId id, PlayerDetails details, LotteryNumbers numbers) {
		this.id = id;
		this.playerDetails = details;
		this.lotteryNumbers = numbers;
	}
	
	public LotteryTicketId getId(){
		return id;
	}
	
	public PlayerDetails getPlayerDetails(){
		return playerDetails;
	}
	
	public LotteryNumbers getNumbers(){
		return lotteryNumbers;
	}
	
	public void setId(LotteryTicketId id){
		this.id = id;
	}
	
	@Override
	public String toString(){
		return playerDetails.toString() + " " + lotteryNumbers.toString();
	}
	
	@Override
	public int hashCode(){
		
		final int prime = 31;
		int result  = 1;
		result = prime * result + ((lotteryNumbers == null) ? 0 : lotteryNumbers.hashCode());
		result = prime * result + ((playerDetails == null) ? 0 : playerDetails.hashCode());
		
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
		LotteryTicket other = (LotteryTicket) obj;
		if (lotteryNumbers == null){
			if (other.lotteryNumbers != null){
				return false;
			}
		}else if (!lotteryNumbers.equals(other.lotteryNumbers)){
			return false;
		}
		if (playerDetails == null){
			if (other.playerDetails != null){
				return false;
			}
		}
		return true;
	}
}
