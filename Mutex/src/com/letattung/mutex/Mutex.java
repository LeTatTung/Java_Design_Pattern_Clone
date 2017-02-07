/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mutex
 */
package com.letattung.mutex;

public class Mutex implements Lock{

	private Object owner;
	
	public Object getOwner(){
		return owner;
	}
	
	@Override
	public synchronized void acquire() throws InterruptedException {
		while (owner != null){
			wait();
		}
		owner = Thread.currentThread();
	}

	@Override
	public synchronized void release() {
		if (Thread.currentThread() == owner){
			owner = null;
			notify();
		}
	}

}
