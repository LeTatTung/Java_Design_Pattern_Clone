/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.business.delegate;

public class BusinessDelegate {

	private BusinessService businessService;
	private BusinessLookup businessLookup;
	private ServiceType serviceType;
	
	public void setBusinessLookup(BusinessLookup businessLookup) {
		this.businessLookup = businessLookup;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	
	public void doTask(){
		businessService = businessLookup.getBusinessService(serviceType);
		businessService.doProcessing();
	}
	
}
