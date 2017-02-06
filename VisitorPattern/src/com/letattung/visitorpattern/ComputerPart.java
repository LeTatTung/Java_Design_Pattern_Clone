// hoc theo java design pattern tutorial

package com.letattung.visitorpattern;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
