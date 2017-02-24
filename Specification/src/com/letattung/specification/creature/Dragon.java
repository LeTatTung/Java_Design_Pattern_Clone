package com.letattung.specification.creature;

import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.property.Size;

public class Dragon extends AbstractCreature{

	public Dragon(){
		super("Dragon", Color.RED, Movement.FLYING, Size.LARGE);
	}
}
