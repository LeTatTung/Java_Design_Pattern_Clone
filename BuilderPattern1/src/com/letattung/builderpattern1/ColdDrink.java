// hoc theo java design pattern tutorial
package com.letattung.builderpattern1;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing(){
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
