/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/producer-consumer
 */
package com.letattung.producerconsumer;

public class Item {

	private String producer;
	private int id;
	
	public Item(String producer, int id) {
		this.producer = producer;
		this.id = id;
	}
	
	public String getProducer(){
		return producer;
	}
	
	public int getId(){
		return id;
	}
}
