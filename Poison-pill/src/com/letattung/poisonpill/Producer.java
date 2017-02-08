/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/poison-pill
 */
package com.letattung.poisonpill;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
	
	private final MqPublishPoint queue;
	private final String name;
	private boolean isStopped;
	
	public Producer(String name, MqPublishPoint queue) {
		this.name = name;
		this.queue = queue;
		this.isStopped = false;
	}
	
	public void send(String body){
		if (isStopped){
			throw new IllegalStateException(String.format
					("Producer %s was stopped and fail to deliver requested message [%s].", body, name));
		}
		Message message = new SimpleMessage();
		message.addHeader(Headers.DATE, new Date().toString());
		message.addHeader(Headers.SENDER, name);
		message.setBody(body);
		
		try{
			queue.put(message);
		}catch(InterruptedException e){
			LOGGER.error("Exception caught.", e);
		}
	}
	
	public void stop(){
		isStopped = true;
		try{
			queue.put(Message.POISON_PILL);
		}catch(InterruptedException e){
			LOGGER.error("Exception caught.", e);
		}
	}
}
