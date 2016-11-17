/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.business.delegate;

public class App {

	public static void main(String [] args){
		
		BusinessDelegate businessDelegate = new BusinessDelegate();
		BusinessLookup businessLookup = new BusinessLookup();
		businessLookup.setEjbService(new EjbService());
		businessLookup.setJmsService(new JmsService());
		
		businessDelegate.setBusinessLookup(businessLookup);
		businessDelegate.setServiceType(ServiceType.EJB);
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType(ServiceType.JMS);
		client.doTask();
	}
}
