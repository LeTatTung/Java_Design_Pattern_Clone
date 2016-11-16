/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public class Stormbringer extends SoulEatingMagicWeaponImpl{

	@Override
	public void eatSoulImp() {
		// TODO Auto-generated method stub
		System.out.println("Stormbringer nuot chung linh hon cua doi phuong");
	}

	@Override
	public void wieldImp() {
		// TODO Auto-generated method stub
		System.out.println("wielding Stormbringer");
	}

	@Override
	public void swingImp() {
		// TODO Auto-generated method stub
		System.out.println("swinging Stormbringer");
	}

	@Override
	public void unwieldImp() {
		// TODO Auto-generated method stub
		System.out.println("unwielding Stormbringer");
	}

}
