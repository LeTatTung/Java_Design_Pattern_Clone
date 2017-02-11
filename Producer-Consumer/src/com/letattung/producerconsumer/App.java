/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/producer-consumer
 */
package com.letattung.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		ItemQueue queue = new ItemQueue();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 2;i++){
			final Producer producer = new Producer(queue, "Producer_" +i);
			executorService.submit(() -> {
		        while (true) {
		          producer.produce();
		        }
		      });
		}
		for (int i = 0; i < 3; i++) {
		      final Consumer consumer = new Consumer(queue, "Consumer_" + i);
		      executorService.submit(() -> {
		        while (true) {
		          consumer.consume();
		        }
		      });
		    }
		executorService.shutdown();
		try{
			executorService.awaitTermination(10, TimeUnit.SECONDS);
			executorService.shutdownNow();
		}catch(InterruptedException e){
			LOGGER.error("Error waiting for ExecutorService shutdown");
		}
	}
}
