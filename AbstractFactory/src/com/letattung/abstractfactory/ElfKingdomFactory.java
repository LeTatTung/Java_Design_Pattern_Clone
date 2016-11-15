/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory{

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ElfArmy();
	}

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new ElfKing();
	}

}
