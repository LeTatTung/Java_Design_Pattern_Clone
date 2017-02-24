package com.letattung.specification.creature;

import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.property.Size;

public class Shark extends AbstractCreature{

	public Shark(){
		super("Shark", Color.LIGHT, Movement.SWIMMING, Size.NORMAL);
	}
}
