/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.property;

public enum Color {

	DARK("dark"), LIGHT("light"), GREEN("green"), RED("red");
	
	private String title;
	
	Color(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
