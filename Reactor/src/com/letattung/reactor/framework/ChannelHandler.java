/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.framework;

import java.nio.channels.SelectionKey;

public interface ChannelHandler {

	void handleChannelRead(AbstractNioChannel channel, Object readObject, SelectionKey key);
}
