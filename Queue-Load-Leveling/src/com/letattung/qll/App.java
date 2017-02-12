/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	private static final int SHUTDOWN_TIME = 15;
	
	public static void main(String [] args){
		
		ExecutorService executor = null;
		try{
			MessageQueue msgQueue = new MessageQueue();
			LOGGER.info("Submitting TaskGenerators and ServiceExecutor threads.");
		      
		      // Create three TaskGenerator threads. Each of them will submit different number of jobs.
		      Runnable taskRunnable1 = new TaskGenerator(msgQueue, 5);
		      Runnable taskRunnable2 = new TaskGenerator(msgQueue, 1);
		      Runnable taskRunnable3 = new TaskGenerator(msgQueue, 2);
		      
		      // Create e service which should process the submitted jobs.
		      Runnable srvRunnable = new ServiceExecutor(msgQueue);

		      // Create a ThreadPool of 2 threads and
		      // submit all Runnable task for execution to executor..
		      executor = Executors.newFixedThreadPool(2);
		      executor.submit(taskRunnable1);
		      executor.submit(taskRunnable2);
		      executor.submit(taskRunnable3);
		      
		      // submitting serviceExecutor thread to the Executor service.
		      executor.submit(srvRunnable);
		      
		      // Initiates an orderly shutdown.
		      LOGGER.info("Intiating shutdown. Executor will shutdown only after all the Threads are completed.");
		      executor.shutdown();
		      
		      // Wait for SHUTDOWN_TIME seconds for all the threads to complete 
		      // their tasks and then shut down the executor and then exit. 
		      if ( !executor.awaitTermination(SHUTDOWN_TIME, TimeUnit.SECONDS) ) {
		        LOGGER.info("Executor was shut down and Exiting.");
		        executor.shutdownNow();
		      }
		}catch (InterruptedException ie){
			LOGGER.error(ie.getMessage());
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}
	}
}
