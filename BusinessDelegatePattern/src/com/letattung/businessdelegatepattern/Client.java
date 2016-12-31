// hoc theo java design pattern tutorial 

package com.letattung.businessdelegatepattern;

public class Client {

	public BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask(){
		businessService.doTask();
	}
}
