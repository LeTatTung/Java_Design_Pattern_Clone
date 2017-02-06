// hoc theo java design pattern tutorial

package com.letattung.observerpattern;

public class ObserverPatternDemo {

	public static void main(String [] args){
		
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("First state change: 28");
		subject.setState(28);
		System.out.println();
		System.out.println("Second state change: 9");
		subject.setState(9);
	}
}
