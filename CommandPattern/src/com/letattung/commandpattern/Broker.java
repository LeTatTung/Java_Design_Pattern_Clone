// hoc theo java design pattern tutorial

package com.letattung.commandpattern;

import java.util.ArrayList;

public class Broker {

	private ArrayList<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order){
		orders.add(order);
	}
	
	public void placeOrders(){
		for (Order order: orders){
			order.execute();
		}
		orders.clear();
	}
}
