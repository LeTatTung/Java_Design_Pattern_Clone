/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public abstract class MagicWeapon {

	protected MagicWeaponImpl imp;
	
	public MagicWeapon(MagicWeaponImpl imp) {
		// TODO Auto-generated constructor stub
		this.imp = imp;
	}
	public MagicWeaponImpl getImp(){
		return imp;
	}
	public abstract void wield();
	
	public abstract void swing();
	
	public abstract void unwield();
}
