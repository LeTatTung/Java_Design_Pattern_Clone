// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public abstract class Factory {

	protected Expression prototype = null;
	
	public Expression makePhrase(){
		return prototype.cloan();
	}
	
	public abstract Expression makeCompromise();
	public abstract Expression makeGrade();
	
}
