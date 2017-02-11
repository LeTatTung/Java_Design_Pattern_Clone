/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/private-class-data
 */
package com.letattung.pcd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stew {

	private static final Logger LOGGER = LoggerFactory.getLogger(Stew.class);
	
	private int numPotatoes;
	private int numCarrots;
	private int numMeat;
	private int numPeppers;
	
	public Stew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		this.numPotatoes = numPotatoes;
		this.numCarrots = numCarrots;
		this.numMeat = numMeat;
		this.numPeppers = numPeppers;
	}
	
	public void mix(){
		LOGGER.info("Mixing the stew we find: {} potatoes, {} carrots, {} meat and {} peppers",
        numPotatoes, numCarrots, numMeat, numPeppers);
	}
	
	public void taste(){
		LOGGER.info("Tasting the stew");
		if(numPotatoes > 0){
			numPotatoes --;
		}
		if (numCarrots > 0){
			numCarrots --;
		}
		if (numMeat > 0){
			numMeat --;
		}
		if (numPeppers > 0){
			numPeppers --;
		}
	}
}
