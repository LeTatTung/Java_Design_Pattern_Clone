// hoc theo java design pattern tutorial

package com.letattung.observerpattern;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
