/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.action;

public abstract class Action {

	private ActionType type;
	
	public Action(ActionType type) {
		this.type = type;
	}
	
	public ActionType getType(){
		return type;
	}
}
