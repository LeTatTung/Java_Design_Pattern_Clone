/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.selector;

import java.util.function.Predicate;

import com.letattung.specification.creature.Creature;
import com.letattung.specification.property.Movement;

public class MovementSelector implements Predicate<Creature>{

	private final Movement m;
	
	public MovementSelector(Movement m) {
		this.m = m;
	}
	
	@Override
	public boolean test(Creature t) {
		return t.getMovement().equals(m);
	}

}
