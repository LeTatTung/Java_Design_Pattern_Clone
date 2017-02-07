/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mutex
 */
package com.letattung.mutex;

public interface Lock {

	void acquire () throws InterruptedException;
	
	void release();
}
