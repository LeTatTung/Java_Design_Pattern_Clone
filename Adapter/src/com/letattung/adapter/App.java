/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.adapter;

public class App {

	public static void main(String [] args){
		Captain captain = new Captain(new BattleFishingBoat());
		captain.fire();
		captain.move();
	}
}
