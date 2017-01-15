/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux;

import com.letattung.flux.action.MenuItem;
import com.letattung.flux.dispatcher.Dispatcher;
import com.letattung.flux.store.ContentStore;
import com.letattung.flux.store.MenuStore;
import com.letattung.flux.view.ContentView;
import com.letattung.flux.view.MenuView;

public class App {

	public static void main(String [] args){
		MenuStore menuStore = new MenuStore();
		Dispatcher.getInstance().registerStore(menuStore);
		
		ContentStore contentStore = new ContentStore();
		Dispatcher.getInstance().registerStore(contentStore);
		
		MenuView menuView = new MenuView();
		menuStore.registerView(menuView);
		
		ContentView contentView = new ContentView();
		contentStore.registerView(contentView);
		
		menuView.render();
		contentView.render();
		
		menuView.itemClicked(MenuItem.COMPANY);
	}
}
