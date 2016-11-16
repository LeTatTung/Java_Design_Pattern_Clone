/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.async.method.invocation;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAsyncExecutor implements AsyncExecutor{

	private final AtomicInteger idx = new AtomicInteger(0);
	
	
	@Override
	public <T> AsyncResult<T> startProcess(Callable<T> task) {
		// TODO Auto-generated method stub
		return startProcess(task,null);
	}

	@Override
	public <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback) {
		// TODO Auto-generated method stub
		CompletableResult<T> result = new CompletableResult<>(callback);
		   new Thread(() -> {
		      try {
		        result.setValue(task.call());
		      } catch (Exception ex) {
		        result.setException(ex);
		      }
		    } , "executor-" + idx.incrementAndGet()).start();
		    return result;
	}

	@Override
	public <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException {
		// TODO Auto-generated method stub
		if (!asyncResult.isCompleted()) {
		      asyncResult.await();
		    }
		return asyncResult.getValue();
	}
	private static class CompletableResult<T> implements AsyncResult<T> {

	    static final int RUNNING = 1;
	    static final int FAILED = 2;
	    static final int COMPLETED = 3;

	    final Object lock;
	    final Optional<AsyncCallback<T>> callback;

	    volatile int state = RUNNING;
	    T value;
	    Exception exception;

	    CompletableResult(AsyncCallback<T> callback) {
	      this.lock = new Object();
	      this.callback = Optional.ofNullable(callback);
	    }
	    void setValue(T value) {
	        this.value = value;
	        this.state = COMPLETED;
	        this.callback.ifPresent(ac -> ac.onComplete(value, Optional.<Exception>empty()));
	        synchronized (lock) {
	          lock.notifyAll();
	        }
	      }
	    void setException(Exception exception) {
	        this.exception = exception;
	        this.state = FAILED;
	        this.callback.ifPresent(ac -> ac.onComplete(null, Optional.of(exception)));
	        synchronized (lock) {
	          lock.notifyAll();
	        }
	      }

	      @Override
	      public boolean isCompleted() {
	        return state > RUNNING;
	      }

	      @Override
	      public T getValue() throws ExecutionException {
	        if (state == COMPLETED) {
	          return value;
	        } else if (state == FAILED) {
	          throw new ExecutionException(exception);
	        } else {
	          throw new IllegalStateException("Execution not completed yet");
	        }
	      }

	      @Override
	      public void await() throws InterruptedException {
	        synchronized (lock) {
	          if (!isCompleted()) {
	            lock.wait();
	          }
	        }
	      }
	    }
	}
