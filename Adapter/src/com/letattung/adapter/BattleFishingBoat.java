/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.adapter;

public class BattleFishingBoat implements Battleship{

	private FishingBoat boat;
	
	public BattleFishingBoat() {
		// TODO Auto-generated constructor stub
		boat = new FishingBoat();
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		 System.out.println("fire!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		boat.sail();
	}

}
