// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public class NotPCFactory extends Factory{

	public NotPCFactory() {
		prototype = new NotPCPhrase();
	}
	@Override
	public Expression makeCompromise() {
		return new Expression("lam theo cach cua toi");
	}

	@Override
	public Expression makeGrade() {
		return new Expression("");
	}

}
