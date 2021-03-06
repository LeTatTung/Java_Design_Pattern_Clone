// hoc theo sourcemaking.com 

package com.letattung.builderpattern2;

public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public void createNewPizzaProduct(){
		pizza = new Pizza();
	}
	
	public Pizza getPizza(){
		return pizza;
	}
	public abstract String getNamePizza();
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
