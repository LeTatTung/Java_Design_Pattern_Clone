/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.eventdrivenarchitecture.event.UserUpdatedEvent;
import com.letattung.eventdrivenarchitecture.framework.Handler;

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent>{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);
	
	@Override
	public void onEvent(UserUpdatedEvent event) {
		LOGGER.info("User '{}' has been Updated!", event.getUser().getUserName());
	}

}
