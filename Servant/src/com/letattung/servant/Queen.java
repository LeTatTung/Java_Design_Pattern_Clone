/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/servant
 */
package com.letattung.servant;

public class Queen implements Royalty{

	private boolean isDrunk = true;
	private boolean isHungry;
	private boolean isHappy;
	private boolean isFlirty = true;
	private boolean complimentReceived;
	
	@Override
	public void getFed() {
		isHungry = false;
	}

	@Override
	public void getDrink() {
		isDrunk = true;
	}

	@Override
	public void changeMood() {
		if (complimentReceived && isFlirty && isDrunk && !isHungry){
			isHappy = true;
		}
	}

	@Override
	public void receiveCompliments() {
		complimentReceived = true;
	}

	@Override
	public boolean getMood() {
		return isHappy;
	}

}
