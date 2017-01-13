/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public enum Event {
	STARK_SIGHTED("Stark sighted"), WARSHIPS_APPROACHING("Warships approaching"), TRAITOR_DETECTED("Traito0r detected");
	
	private String description;
	
	private Event(String description) {
		this.description = description;
	}
	
	public String toSring(){
		return description;
	}
}
