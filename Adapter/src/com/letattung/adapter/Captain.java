/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.adapter;

public class Captain implements Battleship{

	private Battleship battleship;
	public Captain(Battleship battleship) {
		// TODO Auto-generated constructor stub
		this.battleship = battleship;
	}
	
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		battleship.fire();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		battleship.move();
	}

}
