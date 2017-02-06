// hoc theo java design pattern tutorial

package com.letattung.frontcontrollerpattern1;

public class Dispatcher {

	private HomeView homeView;
	private StudentView studentView;
	
	public Dispatcher() {
		homeView = new HomeView();
		studentView = new StudentView();
	}
	
	public void dispatch(String request){
		if (request.equalsIgnoreCase("HOME")){
			homeView.show();
		}else{
			studentView.show();
		}
	}
}
