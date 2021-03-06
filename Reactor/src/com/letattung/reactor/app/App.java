/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.letattung.reactor.framework.AbstractNioChannel;
import com.letattung.reactor.framework.ChannelHandler;
import com.letattung.reactor.framework.Dispatcher;
import com.letattung.reactor.framework.NioDatagramChannel;
import com.letattung.reactor.framework.NioReactor;
import com.letattung.reactor.framework.NioServerSocketChannel;
import com.letattung.reactor.framework.ThreadPoolDispatcher;

public class App {

	private NioReactor reactor;
	private List<AbstractNioChannel> channels = new ArrayList<>();
	private Dispatcher dispatcher;
	
	public App(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}
	
	public static void main(String [] args) throws IOException{
		new App(new ThreadPoolDispatcher(2)).start();
	}
	
	public void start() throws IOException{
		reactor = new NioReactor(dispatcher);
		LoggingHandler loggingHandler = new LoggingHandler();
		reactor.registerChannel(tcpChannel(6666, loggingHandler))
        .registerChannel(tcpChannel(6667, loggingHandler))
        .registerChannel(udpChannel(6668, loggingHandler)).start();
	}
	
	public void stop() throws IOException, InterruptedException{
		reactor.stop();
		dispatcher.stop();
		for (AbstractNioChannel channel : channels){
			channel.getJavaChannel().close();
		}
	}
	
	private AbstractNioChannel tcpChannel(int port, ChannelHandler handler) throws IOException{
		NioServerSocketChannel channel = new NioServerSocketChannel(port, handler);
		channel.bind();
		channels.add(channel);
		
		return channel;
	}
	
	private AbstractNioChannel udpChannel(int port, ChannelHandler handler) throws IOException{
		NioDatagramChannel channel = new NioDatagramChannel(port, handler);
		channel.bind();
		channels.add(channel);
		
		return channel;
	}
}
