/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer extends Thread{

	private static Logger LOGGER = LoggerFactory.getLogger(Customer.class);
	
	private final String name;
	private final FruitShop fruitShop;
	private final FruitBowl fruitBowl;
	
	public Customer(String name, FruitShop fruitShop) {
		this.name = name;
		this.fruitShop = fruitShop;
		this.fruitBowl = new FruitBowl();
	}
	
	public void run(){
		while (fruitShop.countFruit() > 0){
			FruitBowl bowl = fruitShop.takeBowl();
			Fruit fruit;
			
			if (bowl != null && (fruit = bowl.take()) !=null){
				LOGGER.info("{} took an {}", name, fruit);
				fruitBowl.put(fruit);
				fruitShop.returnBowl(bowl);
			}
		}
		LOGGER.info("{} took {}", name, fruitBowl);
	}
}
