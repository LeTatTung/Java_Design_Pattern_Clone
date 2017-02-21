/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/resource-acquisition-is-initialization
 */
package com.letattung.rai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args) throws Exception{
		try(SlidingDoor slidingDoor = new SlidingDoor()){
			LOGGER.info("Walking in.");
		}
		try(TreasureChest treasureChest = new TreasureChest()){
			LOGGER.info("Looting contents.");
		}
	}
}
