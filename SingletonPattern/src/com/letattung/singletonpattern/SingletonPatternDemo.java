// hoc theo java design pattern tutorial
package com.letattung.singletonpattern;

public class SingletonPatternDemo {

	public static void main(String [] args){
		
		// khong the khoi tao object theo cach thong thuong
		// kieu nhu SingleObject object = new SingleObject();
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
