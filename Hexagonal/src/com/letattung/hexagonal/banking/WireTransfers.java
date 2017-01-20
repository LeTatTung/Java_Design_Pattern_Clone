/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.banking;

public interface WireTransfers {

	void setFunds(String bankAccount, int amount);
	
	int getFunds(String bankAccount);
	
	boolean transferFunds(int amount, String sourceBackAccount, String destinationBankAccount);
}
