// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public class NotPCPhrase extends Expression{

	static String list[] = {"hehhe", "hahah", "hihih"};
	private static int next = 0;
	
	public NotPCPhrase() {
		super(list[next]);
		next = (next+1)%(list.length);
	}
	
	public Expression cloan(){
		return new NotPCPhrase();
	}
}
