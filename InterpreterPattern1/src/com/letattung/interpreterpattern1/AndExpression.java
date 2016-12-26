// hoc theo java design pattern tutorial

package com.letattung.interpreterpattern1;

public class AndExpression implements Expression{

	private Expression expr1;
	private Expression expr2;
	
	public AndExpression(Expression expr1, Expression expr2) {
		// TODO Auto-generated constructor stub
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
