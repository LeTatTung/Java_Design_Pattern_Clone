// hoc theo sourcemaking.com 

package com.letattung.builderpattern2;

public class HawaiianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
	}

	@Override
	public String getNamePizza() {
		return "Hawaiian Pizza";
	}

}
