/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Meteoroid extends GameObject{

	private static final Logger LOGGER = LoggerFactory.getLogger(Meteoroid.class);
	
	public Meteoroid(int left, int right, int top, int bottom) {
		super(left, right, top, bottom);
	}

	@Override
	public void collision(GameObject gameObject) {
		gameObject.collisionResolve(this);
	}

	@Override
	public void collisionResolve(FlamingAsteroid flamingAsteroid) {
		LOGGER.info("{} hits {}.", flamingAsteroid.getClass().getSimpleName(), this.getClass().getSimpleName());
	}

	@Override
	public void collisionResolve(Meteoroid meteoroid) {
		LOGGER.info("{} hits {}.", meteoroid.getClass().getSimpleName(), this.getClass().getSimpleName());
	}

	@Override
	public void collisionResolve(SpaceStationMir spaceStationMir) {
		LOGGER.info("{} hits {}.", spaceStationMir.getClass().getSimpleName(), this.getClass().getSimpleName());
	}

	@Override
	public void collisionResolve(SpaceStationIss spaceStationIss) {
		LOGGER.info("{} hits {}.", spaceStationIss.getClass().getName(), this.getClass().getSimpleName());
	}

}
