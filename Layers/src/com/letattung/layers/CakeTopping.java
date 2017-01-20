/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CakeTopping {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int calories;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cake cake;
	
	public CakeTopping(){}
	
	public CakeTopping(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String toString(){
		return String.format("id=%s name=%s calories=%d", id, name, calories);
	}
}
