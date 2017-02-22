/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/twin
 */
package com.letattung.twin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BallThread extends Thread{

	private static final Logger LOGGER = LoggerFactory.getLogger(BallThread.class);
	private BallItem twin;
	private volatile boolean isSuspended;
	private volatile boolean isRunning = true;
	
	public void setTwin(BallItem twin){
		this.twin = twin;
	}
	
	public void run(){
		while(isRunning){
			if (!isSuspended){
				twin.draw();
				twin.move();
			}
			try{
				Thread.sleep(250);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
			}
		}
	}
	
	public void suspendMe(){
		isSuspended = true;
		LOGGER.info("Begin to suspend BallThread");
	}
	
	public void resumeMe(){
		isSuspended = false;
		LOGGER.info("Begin to resume BallThread");
	}
	
	public void stopMe(){
		isRunning = false;
		isSuspended = true;
	}
}
