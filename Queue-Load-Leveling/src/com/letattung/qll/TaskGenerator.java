/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskGenerator implements Task, Runnable{

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskGenerator.class);
	
	private final MessageQueue messageQueue;
	private final int messageCount;
	
	public TaskGenerator(MessageQueue messageQueue, int messageCount) {
		this.messageQueue = messageQueue;
		this.messageCount = messageCount;
	}
	
	@Override
	public void run() {
		int count = this.messageCount;
		try{
			while (count > 0){
				String statusMessage = "Message-" + count + " submitted by " + Thread.currentThread().getName();
				this.submit(new Message(statusMessage));
				LOGGER.info(statusMessage);
				count --;
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie){
			LOGGER.error(ie.getMessage());
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public void submit(Message message) {
		try{
			this.messageQueue.submitMessage(message);
		}catch(Exception e){
			LOGGER.error(e.getMessage());
		}
	}

}
