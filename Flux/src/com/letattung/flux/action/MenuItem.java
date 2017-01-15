/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.action;

public enum MenuItem {
	
	HOME("Home"), PRODUCTS("Products"), COMPANY("Company");
	private String title;
	
	private MenuItem(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
