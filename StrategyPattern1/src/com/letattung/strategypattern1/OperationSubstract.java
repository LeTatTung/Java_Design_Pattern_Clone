// hoc theo java design pattern tutorial

package com.letattung.strategypattern1;

public class OperationSubstract implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
