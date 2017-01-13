/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

import java.util.ArrayList;

public abstract class EventEmitter {

	private ArrayList<EventObserver> observers;
	
	public EventEmitter() {
		observers = new ArrayList<>();
	}
	
	public EventEmitter(EventObserver observer){
		this();
		registerObserver(observer);
	}
	
	protected void notifyObservers(Event e){
		for (EventObserver obs : observers){
			obs.onEvent(e);
		}
	}
	public final void registerObserver(EventObserver observer){
		observers.add(observer);
	}
	
	public abstract void timePasses(Weekday weekday);
}
