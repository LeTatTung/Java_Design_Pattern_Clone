/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mutex
 */
package com.letattung.mutex;

public class App {

	public static void main(String [] args){
		Mutex mutex = new Mutex();
		Jar jar = new Jar(mutex, 100);
		Thief tung = new Thief("tung", jar);
		Thief tien = new Thief("tien", jar);
		tung.start();
		tien.start();
	}
}
