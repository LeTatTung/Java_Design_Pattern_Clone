/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.framework;

import java.nio.channels.SelectionKey;

public interface Dispatcher {

	void onChannelReadEvent(AbstractNioChannel channel, Object readObject, SelectionKey key);
	
	void stop() throws InterruptedException;
}
