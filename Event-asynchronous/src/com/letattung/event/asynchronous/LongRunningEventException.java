/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-asynchronous
 */
package com.letattung.event.asynchronous;

public class LongRunningEventException extends Exception{

	private static final long serialVersionUID = -483423544320148809L;

	public LongRunningEventException(String message) {
		super(message);
	}
}
