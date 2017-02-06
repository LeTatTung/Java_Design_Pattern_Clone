// hoc theo java design pattern tutorial

package com.letattung.mediatorpattern;

public class User {

	private String name;
	
	public String getName(){
		return name;
	}

	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
}
