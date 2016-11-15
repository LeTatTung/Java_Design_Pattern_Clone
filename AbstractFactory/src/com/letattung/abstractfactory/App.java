/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractfactory;

public class App {

	private King king;
	private Castle castle;
	private Army army;
	
	King getKing(final KingdomFactory factory){
		return factory.createKing();
	}
	public King getKing() {
		return king;
	}
	public void setKing(final King king) {
		this.king = king;
	}
	Castle getCastle(final KingdomFactory factory){
		return factory.createCastle();
	}
	public Castle getCastle() {
		return castle;
	}
	public void setCastle(final Castle castle) {
		this.castle = castle;
	}
	Army getArmy(final KingdomFactory factory){
		return factory.createArmy();
	}
	public Army getArmy() {
		return army;
	}
	public void setArmy(final Army army) {
		this.army = army;
	}
	
	public void createKingdom(final KingdomFactory factory){
		setKing(factory.createKing());
		setCastle(factory.createCastle());
		setArmy(factory.createArmy());
	}
	
	public static void main(String [] args){
		App app = new App();
		
		System.out.println("Elf Kingdom");
		app.createKingdom(new ElfKingdomFactory());
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
		
		System.out.println("\n\nOrc Kingdom");
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
		
	}
}
