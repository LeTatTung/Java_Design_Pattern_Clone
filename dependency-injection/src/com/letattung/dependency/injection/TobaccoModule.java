/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/dependency-injection 
 */
package com.letattung.dependency.injection;


import com.google.inject.AbstractModule;

public class TobaccoModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(Tobacco.class).to(RivendellTobacco.class);
	}

}
