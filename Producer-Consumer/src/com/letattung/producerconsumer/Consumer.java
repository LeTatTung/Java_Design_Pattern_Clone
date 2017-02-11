/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/producer-consumer
 */
package com.letattung.producerconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
	
	private final ItemQueue queue;
	private final String name;
	
	public Consumer(ItemQueue queue, String name) {
		this.queue = queue;
		this.name = name;
	}
	
	public void consume()throws InterruptedException{
		Item item = queue.take();
		LOGGER.info("Consumer [{}] consume item [{}] produced by [{}]",name, item.getId(), item.getProducer());
	}
}
