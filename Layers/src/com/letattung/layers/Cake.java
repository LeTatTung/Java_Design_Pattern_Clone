/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/layers
 */
package com.letattung.layers;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cake {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	private CakeTopping topping;
	
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private Set<CakeLayer> layers;
	
	public Cake() {
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public CakeTopping getTopping(){
		return topping;
	}
	
	public void setTopping(CakeTopping topping){
		this.topping = topping;
	}
	
	public Set<CakeLayer> getLayers(){
		return layers;
	}
	
	public final void setLayers(Set<CakeLayer> layers){
		this.layers = layers;
	}
	
	public void addLayer(CakeLayer layer){
		this.layers.add(layer);
	}
	
	@Override
	public String toString(){
		return String.format("id=%s topping=%s layers=%s", id, topping, layers.toString());
	}
}
