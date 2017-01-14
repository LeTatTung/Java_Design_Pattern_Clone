/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-asynchronous
 */
package com.letattung.event.asynchronous;

public class InvalidOperationException extends Exception{

	private static final long serialVersionUID = -6191545255213410803L;

	public InvalidOperationException(String message) {
		super(message);
	}
}
