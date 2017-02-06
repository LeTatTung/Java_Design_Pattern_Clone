// hoc theo java design pattern tutorial

package com.letattung.compositeentitypattern;

public class CompositeEntityPatternDemo {

	public static void main(String [] args){
		
		Client client = new Client();
		
		client.setData("tha thinh", "mac cau");
		client.printData();
		
		client.setData("di choi", "khong ru");
		client.printData();
	}
}
