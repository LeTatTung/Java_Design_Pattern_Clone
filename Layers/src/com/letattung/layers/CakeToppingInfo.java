/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

import java.util.Optional;

public class CakeToppingInfo {

	private final Optional<Long> id;
	private final String name;
	private final int calories;
	
	public CakeToppingInfo(Long id, String name, int calories) {
		
		this.id = Optional.of(id);
		this.name = name;
		this.calories = calories;
	}
	
	public CakeToppingInfo(String name, int calories){
		
		this.id = Optional.empty();
		this.name = name;
		this.calories = calories;
	}
	
	@Override
	public String toString(){
		return String.format("CakeToppingInfo id=%d name=%s calories=%d", id.orElse(-1L), name, calories);
	}
}
