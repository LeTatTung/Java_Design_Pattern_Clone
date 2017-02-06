// hoc theo java design pattern tutorial

package com.letattung.interpreterpattern1;

public class InterpreterPatternDemo {

	public static Expression getMarriedWomanExpression(){
		
		Expression expr1 = new TerminalExpression("Tien");
		Expression expr2 = new TerminalExpression("Hai");
		
		return new AndExpression(expr1, expr2);
	}
	
	public static Expression getMaleExpression(){
		
		Expression expr3 = new TerminalExpression("Le Tat Tung");
		Expression expr4 = new TerminalExpression("X Factor");
		
		return new OrExpression(expr3, expr4);
	}
	
	public static void main(String [] args){
		
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println("X Factor is male? " + isMale.interpret("X Factor"));
		System.out.println("Nguyen Huu Tien is a married women? " + isMarriedWoman.interpret("Tien Hai"));
	}
}
