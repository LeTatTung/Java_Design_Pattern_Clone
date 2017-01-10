/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

public class SpaceStationIss extends SpaceStationMir{

	public SpaceStationIss(int left, int right, int top, int bottom) {
		super(left, right, top, bottom);
	}

	@Override
	public void collision(GameObject gameObject){
		gameObject.collision(this);
	}
}
