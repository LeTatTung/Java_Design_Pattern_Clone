/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

public interface Task {

	void submit(Message message);
}
