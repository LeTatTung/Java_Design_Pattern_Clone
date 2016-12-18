// hoc theo java design pattern tutorial
package com.letattung.builderpattern1;

public abstract class Burger implements Item{

	@Override
	public Packing packing(){
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
