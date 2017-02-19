package com.letattung.reactor.framework;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

public class DatagramPacket {

	private SocketAddress sender;
	private ByteBuffer data;
	private SocketAddress receiver;
	
	public DatagramPacket(ByteBuffer data) {
		this.data = data;
	}
	
	public SocketAddress getSender() {
		return sender;
	}

	public SocketAddress getReceiver() {
		return receiver;
	}

	public ByteBuffer getData() {
		return data;
	}

	public void setSender(SocketAddress sender){
		this.sender = sender;
	}
	
	public void setReceiver(SocketAddress receiver){
		this.receiver = receiver;
	}
}
