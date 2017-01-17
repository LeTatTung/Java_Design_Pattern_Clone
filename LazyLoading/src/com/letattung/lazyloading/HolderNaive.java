/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/lazy-loading
 */
package com.letattung.lazyloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolderNaive {

	private static final Logger LOGGER = LoggerFactory.getLogger(HolderNaive.class);
	private Heavy heavy;
	
	public HolderNaive() {
		LOGGER.info("HolderNaive created");
	}
	
	public Heavy getHeavy(){
		if (heavy == null){
			heavy = new Heavy();
		}
		return heavy;
	}
}
