/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/private-class-data
 */
package com.letattung.pcd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImmutableStew {

	private static final Logger LOGGER = LoggerFactory.getLogger(ImmutableStew.class);
	
	private StewData data;
	
	public ImmutableStew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		data = new StewData(numPotatoes, numCarrots, numMeat, numPeppers);
	}
	
	public void mix(){
		LOGGER.info("Mixing the immutable stew we find: {} potatoes, {} carrots, {} meat and {} peppers",
		        data.getNumPotatoes(), data.getNumCarrots(), data.getNumMeat(), data.getNumPeppers());
	}
}
