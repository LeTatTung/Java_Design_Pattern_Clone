/*
 * Copyright (c) 2014 Ilkka Seppälä
 * link github clone : https://github.com/iluwatar/java-design-patterns
 * Le Tat Tung chi la thang hoc hoi cong nghe
 */

package com.letattung.abstractdocument.domain;

import java.util.Map;

import com.letattung.abstractdocument.AbstractDocument;

public class Car extends AbstractDocument implements HasModel, HasParts, HasPrice{

	public Car(Map<String, Object> properties){
		super(properties);
	}
}
