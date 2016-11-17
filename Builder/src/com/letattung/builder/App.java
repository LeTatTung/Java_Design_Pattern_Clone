/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.builder;

public class App {

	public static void main(String [] args){
	    Hero mage = new Hero.Builder(Profession.MAGE, "Le Tat Tung").withHairColor(HairColor.BLACK)
	                .withWeapon(Weapon.DAGGER).build();
	    System.out.println(mage);

	    Hero warrior = new Hero.Builder(Profession.WARRIOR, "Nguyen Huu Tien").withHairColor(HairColor.GREEN)
	                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD).build();
	    System.out.println(warrior);

	    Hero thief = new Hero.Builder(Profession.THIEF, "Cao Van Minh").withHairType(HairType.BALD)
	                .withWeapon(Weapon.BOW).build();
	    System.out.println(thief);
	}
}
