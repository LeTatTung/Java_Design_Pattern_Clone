// hoc theo java design pattern tutorial

package com.letattung.mementopattern1;

import java.util.ArrayList;

public class CareTaker {

	public ArrayList<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento state){
		mementoList.add(state);
	}
	
	public Memento get(int index){
		return mementoList.get(index);
	}
}
