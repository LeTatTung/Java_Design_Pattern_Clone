/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.creature;

import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.property.Size;

public class KillerBee extends AbstractCreature{

	public KillerBee(){
		super("KillerBee", Color.LIGHT, Movement.FLYING, Size.SMALL);
	}
}
