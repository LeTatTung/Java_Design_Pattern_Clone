package com.letattung.hexagonal.banking;

public interface WireTransfers {

	void setFunds(String bankAccount, int amount);
	
	int getFunds(String bankAccount);
	
	boolean transferFunds(int amount, String sourceBackAccount, String destinationBankAccount);
}
