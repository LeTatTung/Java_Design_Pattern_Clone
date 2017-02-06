// hoc theo java design pattern tutorial

package com.letattung.visitorpattern;

public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
