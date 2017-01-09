/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/dependency-injection 
 */

package com.letattung.dependency.injection;

public class AdvancedWizard implements Wizard{

	private Tobacco tobacco;
	
	public AdvancedWizard(Tobacco tobacco) {
		this.tobacco = tobacco;
	}

	@Override
	public void smoke() {
		tobacco.smoke(this);
	}
}
