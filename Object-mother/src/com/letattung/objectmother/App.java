/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/object-mother
 */
package com.letattung.objectmother;

public class App {

	public static void main(String [] args){
		//test
		King soberUnhappyKing = RoyaltyObjectMother.createSoberUnhappyKing();
		Queen flirtyQueen = RoyaltyObjectMother.createFlirtyQueen();
	    soberUnhappyKing.flirt(flirtyQueen);
	}
}
