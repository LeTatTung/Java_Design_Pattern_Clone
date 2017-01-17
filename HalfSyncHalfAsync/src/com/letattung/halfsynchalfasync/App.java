/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/half-sync-half-async
 */
package com.letattung.halfsynchalfasync;

import java.util.concurrent.LinkedBlockingDeque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		AsynchronousService service = new AsynchronousService(new LinkedBlockingDeque<>());
		service.execute(new ArithmeticSumTask(1000));
	}
	
	static class ArithmeticSumTask implements AsyncTask<Long>{
		private long n;
		
		public ArithmeticSumTask(long n) {
			this.n = n;
		}
		
		@Override
		public Long call() throws Exception{
			return ap(n);
		}

		@Override
		public void onPreCall() {
			if (n < 0){
				throw new IllegalArgumentException("n is less than 0");
			}
			
		}

		@Override
		public void onPostCall(Long result) {
			LOGGER.info(result.toString());
		}

		@Override
		public void onError(Throwable throwable) {
			throw new IllegalStateException("Should not occur");
		}
	}
	
	private static long ap(long i){
		try{
			Thread.sleep(i);
		}catch (InterruptedException e){
			LOGGER.error("Exception caught.", e);
		}
		return i * (i + 1)/2;
	}
}
