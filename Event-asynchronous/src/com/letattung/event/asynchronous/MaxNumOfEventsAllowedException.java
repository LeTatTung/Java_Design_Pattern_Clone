/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-asynchronous
 */
package com.letattung.event.asynchronous;

public class MaxNumOfEventsAllowedException extends Exception{

	private static final long serialVersionUID = -8430876973516292695L;

	public MaxNumOfEventsAllowedException(String message) {
		super(message);
	}
}
