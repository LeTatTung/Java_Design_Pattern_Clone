/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/value-object
 */
package com.letattung.valueobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		HeroStat heroStat1 = HeroStat.valueOf(10, 10, 10);
		HeroStat heroStat2 = HeroStat.valueOf(10, 10, 10);
		HeroStat heroStat3 = HeroStat.valueOf(1, 10, 10);
		
		LOGGER.info(heroStat1.toString());

	    LOGGER.info("Is statA and statB equal : {}", heroStat1.equals(heroStat2));
	    LOGGER.info("Is statA and statC equal : {}", heroStat1.equals(heroStat3));
	}
}
