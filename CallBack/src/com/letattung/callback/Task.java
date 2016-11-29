/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.callback;

public abstract class Task {

	public final void executeWith(Callback callback){
		execute();
		if(callback != null){
			callback.call();
		}
	}
	public abstract void execute();
}
