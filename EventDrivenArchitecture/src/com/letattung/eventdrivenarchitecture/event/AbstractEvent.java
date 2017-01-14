/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-driven-architecture
 */
package com.letattung.eventdrivenarchitecture.event;

import com.letattung.eventdrivenarchitecture.framework.Event;

public abstract class AbstractEvent implements Event{

	public Class<? extends Event> getType(){
		return getClass();
	}
}
