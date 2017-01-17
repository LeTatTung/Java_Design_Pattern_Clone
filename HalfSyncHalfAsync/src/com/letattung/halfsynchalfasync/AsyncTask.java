/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/half-sync-half-async
 */
package com.letattung.halfsynchalfasync;

import java.util.concurrent.Callable;

public interface AsyncTask<V> extends Callable<V>{

	void onPreCall();
	
	void onPostCall(V result);
	
	void onError(Throwable throwable);
	
	@Override
	V call() throws Exception;
}
