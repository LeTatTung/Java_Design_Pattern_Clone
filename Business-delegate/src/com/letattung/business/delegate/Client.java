/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.business.delegate;

public class Client {

	private BusinessDelegate businessDelegate;
	
	public Client(BusinessDelegate businessDelegate) {
		// TODO Auto-generated constructor stub
		this.businessDelegate = businessDelegate;
	}
	public void doTask(){
		businessDelegate.doTask();
	}
}
