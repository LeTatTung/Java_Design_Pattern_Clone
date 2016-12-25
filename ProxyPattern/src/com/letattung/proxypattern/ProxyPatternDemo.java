// hoc theo java design pattern tutorial

package com.letattung.proxypattern;

public class ProxyPatternDemo {

	public static void main(String [] args){
		Image image = new ProxyImage("test_png");
		
		//image will be loaded from disk
		image.display();
		
		//image will not be loaded from disk
		image.display();
	}
}
