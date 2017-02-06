// hoc theo java design pattern tutorial

package com.letattung.visitorpattern1;

public class Computer implements ComputerPart{

	ComputerPart parts[];
	
	public Computer() {
		parts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i =0; i < parts.length; i++){
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
