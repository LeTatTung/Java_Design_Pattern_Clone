// hoc theo java design pattern
package com.letattung.prototypepattern1;

public class Rectangle extends Shape{

	public Rectangle() {
		// TODO Auto-generated constructor stub
		type = "Rectangle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}
}
