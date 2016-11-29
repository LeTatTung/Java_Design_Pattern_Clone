/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTask extends Task{

	
	public static final Logger LOGGER = LoggerFactory.getLogger(SimpleTask.class); 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		LOGGER.info("Thuc hien mot so hoat dong quan trong va sau khi goi callback !");
	}

}
