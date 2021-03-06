/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/poison-pill
 */
package com.letattung.poisonpill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
	
	private final String name;
	private final MqSubscribePoint queue;
	
	public Consumer(String name, MqSubscribePoint queue) {
		this.name = name;
		this.queue = queue;
	}
	
	public void consume(){
		while(true){
			Message message;
			try{
				message = queue.take();
				if (Message.POISON_PILL.equals(message)){
					LOGGER.info("Consumer {} receive request to terminate.", name);
					break;
				}
			}catch(InterruptedException e){
				LOGGER.error("Exception caught.", e);
				return;
			}
			String sender = message.getHeader(Headers.SENDER);
			String body = message.getBody();
			LOGGER.info("Message [{}] from [{}] received by [{}]", body, sender, name);
		}
	}
}
