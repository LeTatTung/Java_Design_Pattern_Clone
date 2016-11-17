/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.builder;

public enum HairColor {

	GREEN,WHITE, BLOND, RED, BROWN, BLACK;
	
	@Override
	public String toString(){
		return name().toLowerCase();
	}
}
