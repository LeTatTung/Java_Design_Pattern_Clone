/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.selector;

import java.util.function.Predicate;

import com.letattung.specification.creature.Creature;
import com.letattung.specification.property.Color;

public class ColorSelector implements Predicate<Creature>{

	private final Color c;
	
	public ColorSelector(Color c) {
		this.c = c;
	}
	
	@Override
	public boolean test(Creature t) {
		return t.getColor().equals(c);
	}

}
