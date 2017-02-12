/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/property
 */
package com.letattung.property;

public interface Prototype {

	Integer get(Stats stat);
	
	boolean has(Stats stat);
	
	void set(Stats stat, Integer val);
	
	void remove(Stats stat);
}
