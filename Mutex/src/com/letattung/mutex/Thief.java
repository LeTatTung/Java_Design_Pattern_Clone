/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mutex
 */
package com.letattung.mutex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thief extends Thread{

	private static final Logger LOGGER = LoggerFactory.getLogger(Thief.class);
	private final String name;
	private final Jar jar;
	
	public Thief(String name, Jar jar) {
		this.name = name;
		this.jar = jar;
	}
	
	@Override
	public void run(){
		int beans = 0;
		
		while(jar.takeBean()){
			beans = beans + 1;
			LOGGER.info("{} took a bean.", name);
		}
		LOGGER.info("{} took {} beans.", name, beans);
	}
}
