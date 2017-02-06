// hoc theo java design pattern tutorial

package com.letattung.visitorpattern;

public class VisitorPatternDemo {

	public static void main(String [] args){
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
