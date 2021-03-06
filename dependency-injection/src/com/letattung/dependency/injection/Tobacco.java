/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/dependency-injection 
 */
package com.letattung.dependency.injection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public abstract class Tobacco {

	private static final Logger LOGGER = LoggerFactory.getLogger(Tobacco.class);
	
	public void smoke(Wizard wizard){
		LOGGER.info("{} smoking {}",wizard.getClass().getSimpleName(), this.getClass().getSimpleName());
	}
}
