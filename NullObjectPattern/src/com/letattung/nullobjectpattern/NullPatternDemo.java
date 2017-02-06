// hoc theo java design pattern tutorial

package com.letattung.nullobjectpattern;

public class NullPatternDemo {

	public static void main(String [] args){
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("tung");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("minh");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("hai");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("tien");
		
		System.out.println("Customers: ");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
