/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.framework;

import java.nio.channels.SelectionKey;

public class ChangeKeyOpsCommand implements Runnable{

	private final SelectionKey key;
	private final int interestedOps;
	
	public ChangeKeyOpsCommand(SelectionKey key, int interestedOps) {
		this.key = key;
		this.interestedOps = interestedOps;
	}
	
	public void run(){
		key.interestOps(interestedOps);
	}
	
	@Override
	public String toString(){
		return "Change of ops to: " + interestedOps;
	}
}
