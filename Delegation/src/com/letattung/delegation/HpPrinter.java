/*
 * hoc theo java design pattern cua iluwatar
 * tai https://github.com/iluwatar/java-design-patterns/tree/master/delegation
 */
package com.letattung.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpPrinter implements Printer{

	private static final Logger LOGGER = LoggerFactory.getLogger(HpPrinter.class);
	
	@Override
	public void print(String message) {
		LOGGER.info("Hp Printer: {}", message);
	}

}
