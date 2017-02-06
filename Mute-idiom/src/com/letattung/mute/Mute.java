/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mute-idiom
 */
package com.letattung.mute;

public final class Mute {

	private Mute(){}
	
	public static void mute(CheckedRunnable runnable){
		try{
			runnable.run();
		}catch(Exception e){
			throw new AssertionError(e);
		}
	}
	
	public static void loggedMute(CheckedRunnable runnable){
		try{
			runnable.run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
