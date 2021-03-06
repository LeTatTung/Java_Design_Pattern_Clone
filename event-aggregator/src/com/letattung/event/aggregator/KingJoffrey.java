/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KingJoffrey implements EventObserver{

	private static final Logger LOGGER = LoggerFactory.getLogger(KingJoffrey.class);
	
	@Override
	public void onEvent(Event e) {
		LOGGER.info("Received event from the King's Hand: {}", e.toString());
	}

}
