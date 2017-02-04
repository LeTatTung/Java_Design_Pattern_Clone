// hoc theo java design pattern tutorial

package com.letattung.observerpattern1;

public class OctalObserver extends Observer{

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Otal String: " + Integer.toOctalString(subject.getState()));
	}

}
