/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.property;

public enum Movement {

	WALKING("walking"), SWIMMING("swimming"), FLYING("flying");
	
	private String title;
	
	Movement(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
