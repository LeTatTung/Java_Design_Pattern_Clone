// hoc theo java desin pattern tutorial

package com.letattung.facadepattern;

public class ShapeMaker {

	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	
	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
}
