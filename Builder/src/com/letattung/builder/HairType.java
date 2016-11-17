/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.builder;

public enum HairType {
	
	BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY("long curly");
	
	private String title;
	
	HairType(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	@Override
	public String toString(){
		return title;
	}
}
