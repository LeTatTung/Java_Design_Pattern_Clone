// hoc theo java design pattern
package com.letattung.prototypepattern1;

public class Circle extends Shape{

	public Circle() {
		// TODO Auto-generated constructor stub
		type = "Circle";
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

}
