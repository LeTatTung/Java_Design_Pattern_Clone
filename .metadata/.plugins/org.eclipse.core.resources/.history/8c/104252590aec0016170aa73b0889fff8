// hoc theo java design pattern tutorial

package com.letattung.decoratorpattern1;

public class DecoratorPatternDemo {

	public static void main(String [] args){
		
		Shape Circle = new Circle();
		Shape rectangle = new Rectangle();
		
		RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		Circle.draw();
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nRectangle with normal border");
		rectangle.draw();
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
