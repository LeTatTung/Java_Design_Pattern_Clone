/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reader-writer-lock
 */
package com.letattung.rwl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] arsg){
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		ReaderWriterLock lock = new ReaderWriterLock();
		IntStream.range(0, 5)
        .forEach(i -> executorService.submit(new Reader("Reader " + i, lock.readLock())));
		IntStream.range(0, 5)
        .forEach(i -> executorService.submit(new Writer("Writer " + i, lock.writeLock())));
		executorService.shutdown();
		try{
			executorService.awaitTermination(5, TimeUnit.SECONDS);
		}catch (InterruptedException e){
			LOGGER.info("Error waiting for ExecutorService shutdown");
		}
	}
}
