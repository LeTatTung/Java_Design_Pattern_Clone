/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

import java.util.ArrayList;

public class App {

	public static void main(String [] args){
		
		KingJoffrey kingJoffrey = new KingJoffrey();
		KingsHand kingsHand = new KingsHand(kingJoffrey);
		
		ArrayList<EventEmitter> emitters = new ArrayList<>();
		emitters.add(kingsHand);
		emitters.add(new LordBaelish(kingsHand));
		emitters.add(new LordVarys(kingsHand));
		emitters.add(new Scout(kingsHand));
		
		for (Weekday weekday : Weekday.values()){
			for (EventEmitter emitter : emitters){
				emitter.timePasses(weekday);
			}
		}
	}
}
