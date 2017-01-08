/*
 * hoc theo java design pattern cua iluwatar
 * tai https://github.com/iluwatar/java-design-patterns/tree/master/delegation
 */
package com.letattung.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CanonPrinter implements Printer{

	private static final Logger LOGGER = LoggerFactory.getLogger(CanonPrinter.class);

	@Override
	public void print(String message) {
		LOGGER.info("Canon Printer: {}", message);
	}
	
}
