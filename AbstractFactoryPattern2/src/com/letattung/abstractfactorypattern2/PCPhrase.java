// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public class PCPhrase extends Expression{

	static String list[] = {"con meo", "con ho", "con cao"};
	private static int next = 0;
	public PCPhrase() {
		super(list[next]);
		next = (next + 1)%(list.length);
	}
	
	public Expression cloan(){
		return new PCPhrase();
	}
}
