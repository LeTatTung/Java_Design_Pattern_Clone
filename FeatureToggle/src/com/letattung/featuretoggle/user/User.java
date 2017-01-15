/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle.user;

public class User {

	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
