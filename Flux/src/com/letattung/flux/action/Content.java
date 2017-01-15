/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.action;

public enum Content {
	
	PRODUCTS("Products - This page lists the company's products."), COMPANY(
		      "Company - This page displays information about the company.");
	private String title;
	
	private Content(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
