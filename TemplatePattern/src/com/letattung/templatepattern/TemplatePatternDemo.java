// hoc theo java dedign pattern tutorial

package com.letattung.templatepattern;

public class TemplatePatternDemo {

	public static void main(String [] args){
		
		Game game = new Cricket();
		game.play();
		System.out.println("\n");
		game = new Football();
		game.play();
	}
}
