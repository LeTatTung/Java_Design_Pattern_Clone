/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public class Excalibur extends BlindingMagicWeaponImpl{

	@Override
	public void blindImp() {
		// TODO Auto-generated method stub
		System.out.println("Dong anh sang phat ra tu Excalibur lam choi mat ke thu");
	}

	@Override
	public void wieldImp() {
		// TODO Auto-generated method stub
		System.out.println("wielding Excalibur");
	}

	@Override
	public void swingImp() {
		// TODO Auto-generated method stub
		System.out.println("swinging Excalibur");
	}

	@Override
	public void unwieldImp() {
		// TODO Auto-generated method stub
		System.out.println("unwielding Excalibur");
	}

}
