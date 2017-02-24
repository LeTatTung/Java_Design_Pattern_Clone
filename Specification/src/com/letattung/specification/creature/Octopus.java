package com.letattung.specification.creature;

import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.property.Size;

public class Octopus extends AbstractCreature{

	public Octopus(){
		super("Octopus", Color.DARK, Movement.SWIMMING, Size.NORMAL);
	}
}
