// hoc theo java design pattern tutorial

package com.letattung.nullobjectpattern1;

public class NullCustomer extends AbstractCustomer{

	
	@Override
	public boolean isNill() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}

}
