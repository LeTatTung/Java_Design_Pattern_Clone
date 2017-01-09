/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/dependency-injection 
 */
package com.letattung.dependency.injection;

public class SimpleWizard implements Wizard{

	private OldTobyTobacco tobacco = new OldTobyTobacco();
	
	@Override
	public void smoke() {
		tobacco.smoke(this);
	}

}
