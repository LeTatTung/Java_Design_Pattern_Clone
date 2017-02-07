/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/object-mother
 */
package com.letattung.objectmother;

public class Queen implements Royalty{

	boolean isDrunk = false;
	boolean isHappy = false;
	private boolean isFlirty = false;
	
	@Override
	public void makeDrunk() {
		isDrunk = true;
	}

	@Override
	public void makeSober() {
		isDrunk = false;
	}

	@Override
	public void makeHappy() {
		isHappy = true;
	}

	@Override
	public void makeUnhappy() {
		isHappy = false;
	}

	public boolean isFlirty(){
		return isFlirty;
	}
	
	public void setFlirtiness(boolean flirtiness){
		this.isFlirty = flirtiness;
	}
	
	public boolean getFlirted(King king){
		if (this.isFlirty && king.isHappy && !king.isDrunk){
			return true;
		}
		return false;
	}
}
