/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

public class Fruit {

	public static enum FruitType{
		ORANGE, APPLE, LEMON
	}
	
	private FruitType type;
	
	public Fruit(FruitType type) {
		this.type = type;
	}
	
	public FruitType getType(){
		return type;
	}
	
	public String toString(){
		switch (type) {
		case ORANGE:
			return "Orange";
		case APPLE:
			return "Apple";
		case LEMON:
			return "Lemon";
		default:
			return "";
		}
	}
}
