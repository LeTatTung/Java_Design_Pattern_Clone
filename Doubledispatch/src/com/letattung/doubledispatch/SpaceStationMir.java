/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpaceStationMir extends GameObject{

	private static final Logger LOGGER = LoggerFactory.getLogger(SpaceStationMir.class);
	
	public SpaceStationMir(int left, int right, int top, int bottom) {
		super(left, right, top, bottom);
	}

	@Override
	public void collision(GameObject gameObject) {
		gameObject.collisionResolve(this);
	}

	@Override
	public void collisionResolve(FlamingAsteroid flamingAsteroid) {
		LOGGER.info("{} hits {}. {} is damaged! {} is set on fire!", flamingAsteroid.getClass().getSimpleName(),
				 this.getClass().getSimpleName());
		setDamaged(true);
		setOnFire(true);
	}

	@Override
	public void collisionResolve(Meteoroid meteoroid) {
		LOGGER.info("{} hits {}. {} is damaged!", meteoroid.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}

	@Override
	public void collisionResolve(SpaceStationMir spaceStationMir) {
		LOGGER.info("{} hits {}. {} is damaged!", spaceStationMir.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}

	@Override
	public void collisionResolve(SpaceStationIss spaceStationIss) {
		LOGGER.info("{} hits {}. {} is damaged!", spaceStationIss.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}

}
