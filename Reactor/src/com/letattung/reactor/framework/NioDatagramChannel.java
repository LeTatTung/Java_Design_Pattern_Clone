/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.framework;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NioDatagramChannel extends AbstractNioChannel{

	private static final Logger LOGGER = LoggerFactory.getLogger(NioDatagramChannel.class);
	private final int port;
	
	public NioDatagramChannel(int port, ChannelHandler handler) throws IOException {
		super(DatagramChannel.open(), handler);
		this.port = port;
	}
	
	@Override
	public int getInterestedOps() {
		return SelectionKey.OP_READ;
	}

	@Override
	public DatagramChannel getJavaChannel(){
		return (DatagramChannel)super.getJavaChannel();
	}
	
	@Override
	public void bind() throws IOException {
		getJavaChannel().socket().bind(new InetSocketAddress(InetAddress.getLocalHost(), port));
		getJavaChannel().configureBlocking(false);
	    LOGGER.info("Bound UDP socket at port: {}", port);
	}

	@Override
	public DatagramPacket read(SelectionKey key) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		SocketAddress sender = ((DatagramChannel) key.channel()).receive(buffer);
		
		buffer.flip();
		DatagramPacket packet = new DatagramPacket(buffer);
		packet.setSender(sender);
		
		return packet;
	}

	@Override
	protected void doWrite(Object pendingWrite, SelectionKey key) throws IOException {
		DatagramPacket pendingPacket = (DatagramPacket) pendingWrite;
		getJavaChannel().send(pendingPacket.getData(), pendingPacket.getReceiver());
	}
	
	@Override
	public void write(SelectionKey key, Object data){
		super.write(key, data);
	}
}
