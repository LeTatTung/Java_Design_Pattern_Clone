/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.selector;

import java.util.function.Predicate;

import com.letattung.specification.creature.Creature;
import com.letattung.specification.property.Size;

public class SizeSelector implements Predicate<Creature>{

	private final Size s;
	
	public SizeSelector(Size s) {
		this.s = s;
	}
	
	@Override
	public boolean test(Creature t) {
		return t.getSize().equals(s);
	}

}
