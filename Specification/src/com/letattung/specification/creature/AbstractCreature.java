/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.creature;

import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.property.Size;

public abstract class AbstractCreature implements Creature{

	private String name;
	private Color color;
	private Movement movement;
	private Size size;
	
	public AbstractCreature(String name, Color color, Movement movement, Size size) {
		this.name = name;
		this.color = color;
		this.movement = movement;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public Movement getMovement() {
		return movement;
	}

	@Override
	public Size getSize() {
		return size;
	}
	
	@Override
	public String toString(){
		return String.format("%s [size=%s, movement=%s, color=%s]", name, size, movement, color);
	}
}
