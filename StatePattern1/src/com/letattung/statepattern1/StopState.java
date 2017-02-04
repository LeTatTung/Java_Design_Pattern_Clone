// hoc theo java design pattern tutorial 

package com.letattung.statepattern1;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString(){
		return "Stop State";
	}
}
