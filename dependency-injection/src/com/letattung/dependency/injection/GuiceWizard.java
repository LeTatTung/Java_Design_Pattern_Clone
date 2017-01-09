/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/dependency-injection 
 */
package com.letattung.dependency.injection;

import javax.inject.Inject;

public class GuiceWizard implements Wizard{

	private Tobacco tobacco;
	
	@Inject
	public GuiceWizard(Tobacco tobacco) {
		this.tobacco = tobacco;
	}

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}
}
