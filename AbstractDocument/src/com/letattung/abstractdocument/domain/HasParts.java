/*
 * Copyright (c) 2014 Ilkka Seppälä
 * link github clone : https://github.com/iluwatar/java-design-patterns
 * Le Tat Tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractdocument.domain;

import java.util.stream.Stream;

import com.letattung.abstractdocument.Document;

public interface HasParts extends Document{

	String PROPERTY = "parts";
	default Stream<Part> getParts(){
		return children(PROPERTY, Part::new);
	}
}
