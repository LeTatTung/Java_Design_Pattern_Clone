/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/private-class-data
 */
package com.letattung.pcd;

public class App {

	public static void main(String [] args){
		
		Stew stew = new Stew(1, 2, 3, 4);
		stew.mix();
		stew.taste();
		stew.mix();
		
		ImmutableStew immutableStew = new ImmutableStew(2, 4, 6, 8);
	    immutableStew.mix();
	}
}
