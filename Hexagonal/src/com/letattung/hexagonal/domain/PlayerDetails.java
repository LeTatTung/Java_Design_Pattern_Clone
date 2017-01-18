package com.letattung.hexagonal.domain;

public class PlayerDetails {

	private final String emailAddress;
	private final String bankAccountNumber;
	private final String phoneNumber;
	
	public PlayerDetails(String email, String bankAccount, String phone) {
		this.emailAddress = email;
		this.bankAccountNumber = bankAccount;
		this.phoneNumber = phone;
	}
	
	public String getEmail(){
		return emailAddress;
	}
	
	public String getBankAccount(){
		return bankAccountNumber;
	}
	
	public String getPhone(){
		return phoneNumber;
	}
	
	@Override 
	public String toString(){
		return "PlayerDetails{" + "emailAddress='" + emailAddress + '\''
		        + ", bankAccountNumber='" + bankAccountNumber + '\''
		        + ", phoneNumber='" + phoneNumber + '\'' + '}';
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((bankAccountNumber == null) ? 0 : bankAccountNumber.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		
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
		PlayerDetails other = (PlayerDetails) obj;
		if (emailAddress == null){
			if (other.emailAddress != null){
				return false;
			}
		}else if (!emailAddress.equals(other.emailAddress)){
			return false;
		}
		if (bankAccountNumber == null){
			if (other.bankAccountNumber != null){
				return false;
			}
		}else if (!bankAccountNumber.equals(other.bankAccountNumber)){
			return false;
		}
		if (phoneNumber == null){
			if (other.phoneNumber != null){
				return false;
			}
		}else if (!phoneNumber.equals(other.phoneNumber)){
			return false;
		}
		return true;
	}
		
}
