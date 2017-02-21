/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/value-object
 */
package com.letattung.valueobject;

public class HeroStat {

	private final int strength;
	private final int intelligence;
	private final int luck;
	
	private HeroStat(int strength, int intelligence, int luck) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.luck = luck;
	}
	
	public static HeroStat valueOf(int strength, int intelligence, int luck){
		return new HeroStat(strength, intelligence, luck);
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getLuck() {
		return luck;
	}
	
	@Override
	public String toString(){
		return "HeroStat [strength=" + strength + ", intelligence=" + intelligence
		        + ", luck=" + luck + "]";
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		
	    result = prime * result + intelligence;
	    result = prime * result + luck;
	    result = prime * result + strength;
	    
	    return result;
	}
	
	@Override
	public boolean equals(Object object){
		if (this == object){
			return true;
		}
		if (object == null){
			return false;
		}
		if (getClass() != object.getClass()){
			return false;
		}
		HeroStat other = (HeroStat) object;
		if (strength != other.strength){
			return false;
		}
		if (intelligence != other.intelligence){
			return false;
		}
		if (luck != other.luck){
			return false;
		}
		return true;
	}
}
