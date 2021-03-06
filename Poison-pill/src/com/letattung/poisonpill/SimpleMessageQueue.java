/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/poison-pill
 */
package com.letattung.poisonpill;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SimpleMessageQueue implements MessageQueue{

	private final BlockingQueue<Message> queue;
	
	public SimpleMessageQueue(int bound) {
		queue = new ArrayBlockingQueue<>(bound);
	}
	@Override
	public void put(Message msg) throws InterruptedException {
		queue.put(msg);
	}

	@Override
	public Message take() throws InterruptedException {
		return queue.take();
	}

}
