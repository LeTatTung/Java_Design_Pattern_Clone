// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public class PCFactory extends Factory{

	public PCFactory() {
		prototype = new PCPhrase();
	}
	@Override
	public Expression makeCompromise() {
		return new Expression("lam theo cach cua ban, bat ki cach nao, hoac khong cach nao");
	}

	@Override
	public Expression makeGrade() {
		return new Expression("ban da vuot qua");
	}

}
