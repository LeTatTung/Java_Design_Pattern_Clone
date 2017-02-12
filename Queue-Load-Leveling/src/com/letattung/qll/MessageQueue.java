/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageQueue {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageQueue.class);
	
	private BlockingQueue<Message> blkQueue;
	
	public MessageQueue() {
		this.blkQueue = new ArrayBlockingQueue<Message>(1024);
	}
	
	public void submitMessage(Message message){
		try{
			if (null != message){
				blkQueue.add(message);
			}
		}catch(Exception e){
			LOGGER.error(e.getMessage());
		}
	}
	
	public Message retrieveMessage(){
		Message retrieveMessage = null;
		try{
			retrieveMessage = blkQueue.poll();
		}catch(Exception e){
			LOGGER.error(e.getMessage());
		}
		return retrieveMessage;
	}
}
