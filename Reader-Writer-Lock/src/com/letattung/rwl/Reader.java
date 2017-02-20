/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reader-writer-lock
 */
package com.letattung.rwl;

import java.util.concurrent.locks.Lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reader implements Runnable{

	private static final Logger LOGGER = LoggerFactory.getLogger(Reader.class);
	private Lock readLock;
	private String name;
	
	public Reader(String name, Lock readLock) {
		this.name = name;
		this.readLock = readLock;
	}

	@Override
	public void run() {
		readLock.lock();
		try{
			read();
		}catch (InterruptedException e){
			e.printStackTrace();
		}finally{
			readLock.unlock();
		}
	}
	
	public void read() throws InterruptedException{
		LOGGER.info("{} begin", name);
		Thread.sleep(250);
	    LOGGER.info("{} finish", name);
	}
}
