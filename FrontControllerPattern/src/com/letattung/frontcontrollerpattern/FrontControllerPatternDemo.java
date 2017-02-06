// hoc theo java design pattern tutorial

package com.letattung.frontcontrollerpattern;

public class FrontControllerPatternDemo {

	public static void main(String [] args){
		
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
