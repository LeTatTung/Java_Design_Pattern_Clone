/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.store;

import java.util.LinkedList;
import java.util.List;

import com.letattung.flux.action.Action;
import com.letattung.flux.view.View;

public abstract class Store {

	private List<View> views = new LinkedList<>();
	
	public abstract void onAction(Action action);
	
	public void registerView(View view){
		views.add(view);
	}
	
	protected void notifyChange(){
		views.stream().forEach(view -> view.storeChanged(this));;
	}
}
