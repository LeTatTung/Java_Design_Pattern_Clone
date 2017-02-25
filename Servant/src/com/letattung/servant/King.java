/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/servant
 */
package com.letattung.servant;

public class King implements Royalty{

	public boolean isDrunk;
	private boolean isHungry = true;
	private boolean isHappy;
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
		if (!isHungry && isDrunk){
			isHappy = true;
		}
		if (complimentReceived){
			isHappy = false;
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
