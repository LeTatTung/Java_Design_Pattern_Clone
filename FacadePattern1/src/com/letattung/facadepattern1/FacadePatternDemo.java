//hoc theo java design pattern tutorial

package com.letattung.facadepattern1;

public class FacadePatternDemo {

	public static void main(String [] args){
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
