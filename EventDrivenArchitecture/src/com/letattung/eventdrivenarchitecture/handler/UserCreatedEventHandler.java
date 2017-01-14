/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.eventdrivenarchitecture.event.UserCreatedEvent;
import com.letattung.eventdrivenarchitecture.framework.Handler;

public class UserCreatedEventHandler implements Handler<UserCreatedEvent>{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);
	
	@Override
	public void onEvent(UserCreatedEvent event) {
		LOGGER.info("User '{}' has been Created!", event.getUser().getUserName());
	}

}
