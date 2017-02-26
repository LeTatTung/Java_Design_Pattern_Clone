/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

	private List<Fruit> fruits = new ArrayList<>();
	
	public int countFruit(){
		return fruits.size();
	}
	
	public void put(Fruit f){
		fruits.add(f);
	}
	
	public Fruit take(){
		if (fruits.isEmpty()){
			return null;
		}else {
			return fruits.remove(0);
		}
	}
	
	public String toString(){
		int apples = 0;
		int lemons = 0;
		int oranges = 0;
		
		for (Fruit f : fruits){
			switch (f.getType()) {
			case ORANGE:
				oranges ++;
				break;
			case LEMON:
				lemons ++;
				break;
			case APPLE:
				apples ++;
				break;
			default:
				break;
			}
		}
		return apples + " Apples, " + oranges + " Oranges, and " + lemons + " Lemons";
	}
}
