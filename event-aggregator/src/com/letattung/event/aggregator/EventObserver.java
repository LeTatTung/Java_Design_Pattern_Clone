/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public interface EventObserver {

	void onEvent(Event e);
}
