/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

public class App {

	public static void main(String [] args){
		FruitShop shop = new FruitShop();
		new Customer("Le Tat Tung", shop).start();
		new Customer("Tran Minh Hai", shop).start();
		new Customer("Nguyen Huu Tien", shop).start();
		new Customer("Cao Van Minh", shop).start();
		new Customer("Nguyen Van Minh", shop).start();
	}
}
