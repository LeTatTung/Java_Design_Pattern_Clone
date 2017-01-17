/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/lazy-loading
 */
package com.letattung.lazyloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolderThreadSafe {

	private static final Logger LOGGER = LoggerFactory.getLogger(HolderThreadSafe.class);
	private Heavy heavy;
	
	public HolderThreadSafe() {
		LOGGER.info("HolderThreadSafe created");
	}
	
	public Heavy getHeavy(){
		if (heavy == null){
			heavy = new Heavy();
		}
		return heavy;
	}
}
