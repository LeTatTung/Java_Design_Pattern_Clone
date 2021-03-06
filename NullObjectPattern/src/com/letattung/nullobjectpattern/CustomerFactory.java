// hoc theo java design pattern tutorial

package com.letattung.nullobjectpattern;

public class CustomerFactory {

	public static final String names[] = {"tung", "tien", "hai"};
	
	public static AbstractCustomer getCustomer(String name){
		for (int i =0; i <names.length;i++){
			if (names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
