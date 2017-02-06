// hoc theo java design pattern tutorial
package com.letattung.singletonpattern;

public class SingleObject {

	// create an object of Single Object
	private static SingleObject instance = new SingleObject();
	//constructor private
	private SingleObject(){}
	// get the only object available
	public static SingleObject getInstance(){
		return instance;
	}
	public void showMessage(){
		System.out.println("Xin chao cac anh em !");
	}
}
