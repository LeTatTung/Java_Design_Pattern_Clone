/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/poison-pill
 */
package com.letattung.poisonpill;

public class App {

	public static void main(String [] args){
		MessageQueue queue = new SimpleMessageQueue(1000);
		
		final Producer producer = new Producer("PRODUCER", queue);
		final Consumer consumer = new Consumer("CONSUMER", queue);
		
		new Thread() {
			@Override
			public void run(){
				consumer.consume();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run(){
				producer.send("hand shake");
				producer.send("some very important information");
		        producer.send("bye!");
		        producer.stop();
			}
		}.start();
	}
}
