// hoc theo java design pattern tutorial 

package com.letattung.businessdelegatepattern;

public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
