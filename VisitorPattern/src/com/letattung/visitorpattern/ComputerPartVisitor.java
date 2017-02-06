// hoc theo java design pattern tutorial

package com.letattung.visitorpattern;

public interface ComputerPartVisitor {

	public void visit(Computer computer);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	public void visit(Mouse mouse);
}
