/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

public class FlamingAsteroid extends Meteoroid{

	public FlamingAsteroid(int left, int right, int top, int bottom) {
		super(left, right, top, bottom);
		setOnFire(true);
	}
	@Override
	public void collision(GameObject gameObject){
		gameObject.collision(this);
	}
}
