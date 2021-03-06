/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public class KingsHand extends EventEmitter implements EventObserver{

	public KingsHand() {
		super();
	}
	
	public KingsHand(EventObserver observer){
		super(observer);
	}
	
	@Override
	public void onEvent(Event e) {
		notifyObservers(e);
	}

	@Override
	public void timePasses(Weekday weekday) {
		//NOP
	}

}
