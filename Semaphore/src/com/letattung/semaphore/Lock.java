/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

public interface Lock {

	void acquire() throws InterruptedException;
	
	void release();
}
