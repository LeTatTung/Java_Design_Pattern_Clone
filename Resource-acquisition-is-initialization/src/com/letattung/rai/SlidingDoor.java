/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/resource-acquisition-is-initialization
 */
package com.letattung.rai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlidingDoor implements AutoCloseable{

	private static final Logger LOGGER = LoggerFactory.getLogger(SlidingDoor.class);
	
	public SlidingDoor() {
		LOGGER.info("Sliding door opens.");
	}
	
	@Override
	public void close() throws Exception {
		LOGGER.info("Sliding door closes");
	}

}
