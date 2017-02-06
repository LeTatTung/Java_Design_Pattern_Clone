// hoc theo java design pattern tutorial

package com.letattung.nullobjectpattern;

public class NullCustomer extends AbstractCustomer{

	
	@Override
	public boolean isNill() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
