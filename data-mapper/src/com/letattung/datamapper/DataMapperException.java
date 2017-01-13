/*
 * hoc theo design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/data-mapper
 */
package com.letattung.datamapper;

public final class DataMapperException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataMapperException(String message) {
		super(message);
	}
}
