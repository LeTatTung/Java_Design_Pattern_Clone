// hoc theo java design pattern tutorial

package com.letattung.bridgepattern1;

public abstract class Shape {

	protected DrawAPI drawAPI;
	
	protected Shape (DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}