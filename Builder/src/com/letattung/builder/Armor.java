/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.builder;

public enum Armor {

	CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");
	
	private String title;
	
	Armor(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	@Override
	public String toString(){
		return title;
	}
}
