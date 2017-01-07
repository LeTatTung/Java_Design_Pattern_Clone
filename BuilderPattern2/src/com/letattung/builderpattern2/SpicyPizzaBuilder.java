// hoc theo sourcemaking.com 

package com.letattung.builderpattern2;

public class SpicyPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}

	@Override
	public String getNamePizza() {
		return "Spicy Pizza";
	}

}
