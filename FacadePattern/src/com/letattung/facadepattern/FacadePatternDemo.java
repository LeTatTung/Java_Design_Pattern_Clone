// hoc theo java desin pattern tutorial

package com.letattung.facadepattern;

public class FacadePatternDemo {

	public static void main(String [] args){
		
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
