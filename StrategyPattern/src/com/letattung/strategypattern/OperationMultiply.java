// hoc theo java design pattern tutorial

package com.letattung.strategypattern;

public class OperationMultiply implements Strategy{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
