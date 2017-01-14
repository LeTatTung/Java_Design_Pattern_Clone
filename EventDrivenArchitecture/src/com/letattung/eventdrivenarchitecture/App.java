/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture;

import com.letattung.eventdrivenarchitecture.event.UserCreatedEvent;
import com.letattung.eventdrivenarchitecture.event.UserUpdatedEvent;
import com.letattung.eventdrivenarchitecture.framework.EventDispatcher;
import com.letattung.eventdrivenarchitecture.handler.UserCreatedEventHandler;
import com.letattung.eventdrivenarchitecture.handler.UserUpdatedEventHandler;
import com.letattung.eventdrivenarchitecture.model.User;

public class App {

	public static void main(String [] args){
		EventDispatcher dispatcher = new EventDispatcher();
		dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
		dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());
		
		User user = new User("Le Tat Tung");
		dispatcher.dispatch(new UserCreatedEvent(user));
		dispatcher.dispatch(new UserUpdatedEvent(user));
	}
}
