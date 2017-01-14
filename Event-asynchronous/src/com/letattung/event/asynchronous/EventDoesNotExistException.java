/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-asynchronous
 */
package com.letattung.event.asynchronous;

public class EventDoesNotExistException extends Exception{

	private static final long serialVersionUID = -3398463738273811509L;

	public EventDoesNotExistException(String message) {
		super(message);
	}
}
