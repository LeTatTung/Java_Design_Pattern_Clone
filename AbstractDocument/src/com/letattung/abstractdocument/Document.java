/*
 * Copyright (c) 2014 Ilkka Seppälä
 * link github clone : https://github.com/iluwatar/java-design-patterns
 * Le Tat Tung chi la thang hoc hoi cong nghe
 */
package com.letattung.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {
 
	// ham dua cac gia tri lien quan toi key
	void put(String key, Object value);
	
	// ham lay gia tri value khi co khoa
	Object get(String key);
	/**
	   * Gets the stream of child documents
	   *
	   * @param key         element key
	   * @param constructor constructor of child class
	   * @return child documents
	   */
	<T>Stream<T> children(String key,Function<Map<String, Object>, T> constructor);
}
