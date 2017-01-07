// hoc theo sourcemaking.com 

package com.letattung.builderpattern2;

public class BuilderExample {

	public static void main(String [] args){
		
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();
		waiter.printInfoPizza();
		
		System.out.println("\n");
		
		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();
		waiter.printInfoPizza();
	}
}
