/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/resource-acquisition-is-initialization
 */
package com.letattung.rai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreasureChest implements AutoCloseable{

	private static final Logger LOGGER = LoggerFactory.getLogger(TreasureChest.class);
	
	public TreasureChest() {
		LOGGER.info("Treasure Chest opens.");
	}
	
	@Override
	public void close() throws Exception {
		LOGGER.info("Treasure Chest closes.");
	}

}
