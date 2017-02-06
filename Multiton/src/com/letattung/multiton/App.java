/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/multiton
 */
package com.letattung.multiton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args ){
		LOGGER.info("KHAMUL={}", Nazgul.getInstance(NazgulName.KHAMUL));
		LOGGER.info("MURAZOR={}", Nazgul.getInstance(NazgulName.MURAZOR));
	    LOGGER.info("DWAR={}", Nazgul.getInstance(NazgulName.DWAR));
	    LOGGER.info("JI_INDUR={}", Nazgul.getInstance(NazgulName.JI_INDUR));
	    LOGGER.info("AKHORAHIL={}", Nazgul.getInstance(NazgulName.AKHORAHIL));
	    LOGGER.info("HOARMURATH={}", Nazgul.getInstance(NazgulName.HOARMURATH));
	    LOGGER.info("ADUNAPHEL={}", Nazgul.getInstance(NazgulName.ADUNAPHEL));
	    LOGGER.info("REN={}", Nazgul.getInstance(NazgulName.REN));
	    LOGGER.info("UVATHA={}", Nazgul.getInstance(NazgulName.UVATHA));
	}
}
