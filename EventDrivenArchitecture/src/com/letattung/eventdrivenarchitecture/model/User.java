/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture.model;

public class User {

	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public String getUserName(){
		return userName;
	}
}
