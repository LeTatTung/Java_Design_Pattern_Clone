// hoc theo sourcemaking.com 

package com.letattung.builderpattern2;

public class Waiter {

	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza(){
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
	
	public void printInfoPizza(){
		System.out.println(pizzaBuilder.getNamePizza() + ": ");
		System.out.println(getPizza().getDough());
		System.out.println(getPizza().getSauce());
		System.out.println(getPizza().getTopping());
	}
}
