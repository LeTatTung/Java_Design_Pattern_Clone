// hoc theo java design pattern tutorial

package com.letattung.mementopattern1;

public class MementoPatternDem {

	public static void main(String [] args){
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State 1");
		originator.setState("State 2");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State 3");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State 4");
		System.out.println("Current state: " +originator.getState());
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " +originator.getState());
		
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: "+originator.getState());
	}
}
