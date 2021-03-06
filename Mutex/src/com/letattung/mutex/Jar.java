/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mutex
 */
package com.letattung.mutex;

public class Jar {

	private final Lock lock;
	private int beans;
	
	public Jar(Lock lock, int beans) {
		this.lock = lock;
		this.beans = beans;
	}
	
	public boolean takeBean(){
		boolean success = false;
		try{
			lock.acquire();
			success = beans > 0;
			if (success){
				beans = beans - 1;
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			lock.release();
		}
		return success;
	}
}
