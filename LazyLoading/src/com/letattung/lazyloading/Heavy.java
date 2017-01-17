/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/lazy-loading
 */
package com.letattung.lazyloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Heavy {

	private static final Logger LOGGER = LoggerFactory.getLogger(Heavy.class);
	
	public Heavy() {
		
		LOGGER.info("Creating Heavy ...");
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			LOGGER.error("Exception caught.", e);
		}
		LOGGER.info("... Heavy created");
	}
}
