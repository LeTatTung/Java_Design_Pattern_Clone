// hoc theo java design pattern
package com.letattung.prototypepattern;

public class Square extends Shape{

	public Square() {
		// TODO Auto-generated constructor stub
		type = "Square";
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
