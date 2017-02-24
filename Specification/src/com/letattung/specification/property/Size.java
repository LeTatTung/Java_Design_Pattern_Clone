/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.property;

public enum Size {

	SMALL("small"), NORMAL("normal"), LARGE("large");
	
	private String title;
	
	Size(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
