/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

public class CakeBakingException extends Exception{

	private static final long serialVersionID = 1L;
	
	public CakeBakingException(){}
	
	public CakeBakingException(String message){
		super(message);
	}
}
