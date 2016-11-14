/*
 * Copyright (c) 2014 Ilkka Seppälä
 * link github clone : https://github.com/iluwatar/java-design-patterns
 * Le Tat Tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractdocument.domain;

import java.util.Optional;

import com.letattung.abstractdocument.Document;

public interface HasType extends Document{

	String PROPERTY = "type";
	
	default Optional<String> getType(){
		return Optional.ofNullable((String)get(PROPERTY));
	}
}
