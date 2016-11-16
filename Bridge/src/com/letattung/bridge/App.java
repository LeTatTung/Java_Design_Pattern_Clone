/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public class App {

	public static void main(String[] args){
		
		BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
		blindingMagicWeapon.blind();
		blindingMagicWeapon.wield();
		blindingMagicWeapon.unwield();
		blindingMagicWeapon.swing();
	
		FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
		flyingMagicWeapon.fly();
		flyingMagicWeapon.wield();
		flyingMagicWeapon.unwield();
		flyingMagicWeapon.swing();
		
		SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Stormbringer());
		soulEatingMagicWeapon.eatSoul();
		soulEatingMagicWeapon.wield();
		soulEatingMagicWeapon.unwield();
		soulEatingMagicWeapon.swing();
	}
}
