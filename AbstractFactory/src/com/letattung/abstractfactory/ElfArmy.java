/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractfactory;

public class ElfArmy implements Army{

	static final String DESCRIPTION = "This is the Elven Army!";

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return DESCRIPTION;
	}
}
