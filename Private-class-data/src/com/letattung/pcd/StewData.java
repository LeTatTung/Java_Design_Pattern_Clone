/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/private-class-data
 */
package com.letattung.pcd;

public class StewData {

	private int numPotatoes;
	private int numCarrots;
	private int numMeat;
	private int numPeppers;
	
	public StewData(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		this.numPotatoes = numPotatoes;
		this.numCarrots = numCarrots;
		this.numMeat = numMeat;
		this.numPeppers = numPeppers;
	}

	public int getNumPotatoes() {
		return numPotatoes;
	}

	public int getNumCarrots() {
		return numCarrots;
	}

	public int getNumMeat() {
		return numMeat;
	}

	public int getNumPeppers() {
		return numPeppers;
	}
}
