/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public class SoulEatingMagicWeapon extends MagicWeapon{

	public SoulEatingMagicWeapon(MagicWeaponImpl imp) {
		super(imp);
	}
	@Override
	public SoulEatingMagicWeaponImpl getImp() {
		return (SoulEatingMagicWeaponImpl) imp;
	}
	@Override
	public void wield() {
		// TODO Auto-generated method stub
		getImp().wieldImp();
	}

	@Override
	public void swing() {
		// TODO Auto-generated method stub
		getImp().swingImp();
	}

	@Override
	public void unwield() {
		// TODO Auto-generated method stub
		getImp().unwieldImp();
	}
	public void eatSoul(){
		getImp().eatSoulImp();
	}

}
