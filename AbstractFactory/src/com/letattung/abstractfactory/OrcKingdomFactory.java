/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory{

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new OrcArmy();
	}

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new OrcKing();
	}

}
