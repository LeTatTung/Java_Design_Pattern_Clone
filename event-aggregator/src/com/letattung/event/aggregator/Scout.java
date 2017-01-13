/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public class Scout extends EventEmitter{

	public Scout() {
		super();
	}
	
	public Scout(EventObserver observer){
		super(observer);
	}
	
	@Override
	public void timePasses(Weekday weekday) {
		if (weekday.equals(Weekday.TUESDAY)){
			notifyObservers(Event.WARSHIPS_APPROACHING);
		}
	}

}
