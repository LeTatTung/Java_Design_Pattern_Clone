/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.business.delegate;

public class BusinessLookup {

	private EjbService ejbService;
	private JmsService jmsService;
	
	public BusinessService getBusinessService(ServiceType serviceType){
		if(serviceType.equals(ServiceType.EJB)){
			return ejbService;
		}
		else 
			return jmsService;
	}
	public void setEjbService(EjbService ejbService){
		this.ejbService = ejbService;
	}
	public void setJmsService(JmsService jmsService){
		this.jmsService = jmsService;
	}
}
