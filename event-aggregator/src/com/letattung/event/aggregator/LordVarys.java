/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public class LordVarys extends EventEmitter{

	public LordVarys() {
		super();
	}
	
	public LordVarys(EventObserver observer){
		super(observer);
	}
	
	@Override
	public void timePasses(Weekday weekday) {
		if (weekday.equals(Weekday.SATURDAY)){
			notifyObservers(Event.TRAITOR_DETECTED);
		} 
	}

}
