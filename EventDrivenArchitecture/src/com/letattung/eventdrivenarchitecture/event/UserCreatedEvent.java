/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture.event;

import com.letattung.eventdrivenarchitecture.model.User;

public class UserCreatedEvent extends AbstractEvent{

	private User user;
	
	public UserCreatedEvent(User user) {
		this.user = user;
	}
	
	public User getUser(){
		return user;
	}
}
