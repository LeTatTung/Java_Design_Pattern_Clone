/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.domain;

public class LotteryTicketId {

	private static volatile int numAllocated;
	private final int id;
	
	public LotteryTicketId() {
		this.id = numAllocated + 1;
		numAllocated ++;
	}
	
	public LotteryTicketId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	@Override
	public String toString(){
		return String.format("%d", id);
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (obj == null || getClass() != obj.getClass()){
			return false;
		}
		LotteryTicketId other = (LotteryTicketId) obj;
		return id == other.id;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
}
