// hoc theo java design pattern tutorial

package com.letattung.commandpattern;

public class SellStock implements Order{

	private Stock stock;
	
	public SellStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell();
	}

}
