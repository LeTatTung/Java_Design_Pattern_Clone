// hoc theo java design pattern tutorial

package com.letattung.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw(){
		decoratedShape.draw();
		setBorder();
	}
	
	private void setBorder(){
		System.out.println("Border Color: Red");
	}
}
