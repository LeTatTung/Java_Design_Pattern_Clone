package com.letattung.flux.dispatcher;

import java.util.LinkedList;
import java.util.List;

import com.letattung.flux.action.Action;
import com.letattung.flux.action.Content;
import com.letattung.flux.action.ContentAction;
import com.letattung.flux.action.MenuAction;
/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
import com.letattung.flux.action.MenuItem;
import com.letattung.flux.store.Store;

public class Dispatcher {

	private static Dispatcher instance = new Dispatcher();
	private List<Store> stores = new LinkedList<>();
	
	private Dispatcher(){}
	
	public static Dispatcher getInstance(){
		return instance;
	}
	
	public void registerStore(Store store){
		stores.add(store);
	}
	
	public void menuItemSelected(MenuItem menuItem){
		dispatchAction(new MenuAction(menuItem));
		switch (menuItem){
		case HOME:
		case PRODUCTS:
			default:
				dispatchAction(new ContentAction(Content.PRODUCTS));
				break;
			case COMPANY:
				dispatchAction(new ContentAction(Content.COMPANY));
				break;
		}
	}
	
	private void dispatchAction(Action action){
		stores.stream().forEach(store -> store.onAction(action));
	}
}
