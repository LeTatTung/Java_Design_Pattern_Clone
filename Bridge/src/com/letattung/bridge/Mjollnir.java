/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.bridge;

public class Mjollnir extends FlyingMagicWeaponImpl{

	@Override
	public void flyImp() {
		// TODO Auto-generated method stub
		System.out.println("Mjollnir danh ke thu trong khong trung va tra lai vao tay chu nhan");
	}

	@Override
	public void wieldImp() {
		// TODO Auto-generated method stub
		System.out.println("wielding Mjollnir");
	}

	@Override
	public void swingImp() {
		// TODO Auto-generated method stub
		System.out.println("swinging Mjollnir");
	}

	@Override
	public void unwieldImp() {
		// TODO Auto-generated method stub
		System.out.println("swinging Mjollnir");
	}

}
