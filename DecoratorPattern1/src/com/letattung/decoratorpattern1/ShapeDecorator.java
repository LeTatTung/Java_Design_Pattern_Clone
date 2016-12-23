// hoc theo java design pattern tutorial

package com.letattung.decoratorpattern1;

public abstract class ShapeDecorator {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		// TODO Auto-generated constructor stub
		this.decoratedShape = decoratedShape;
	}
	
	public void draw(){
		decoratedShape.draw();
	}
}
