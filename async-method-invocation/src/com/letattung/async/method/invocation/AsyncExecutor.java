/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.async.method.invocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public interface AsyncExecutor {

	<T> AsyncResult<T> startProcess(Callable<T> task);
	
	<T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback);
	
	<T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;
}
