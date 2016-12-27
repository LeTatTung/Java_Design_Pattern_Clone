// hoc theo java design pattern tutorial

package com.letattung.observerpattern1;

public class ObserverPatternDemo {

	public static void main(String [] args){
		
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		
		System.out.println("Second state change: 9");
		subject.setState(9);
	}
}
