/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.flux.action.MenuItem;
import com.letattung.flux.dispatcher.Dispatcher;
import com.letattung.flux.store.MenuStore;
import com.letattung.flux.store.Store;

public class MenuView implements View{

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuView.class);
	private MenuItem selected = MenuItem.HOME;
	
	@Override
	public void storeChanged(Store store) {
		MenuStore menuStore = (MenuStore) store;
		selected = menuStore.getSelected();
		render();
	}

	@Override
	public void render() {
		for (MenuItem item : MenuItem.values()){
			if (selected.equals(item)){
				LOGGER.info("* {}", item);
			}else{
				LOGGER.info(item.toString());
			}
		}
	}

	public void itemClicked(MenuItem item){
		Dispatcher.getInstance().menuItemSelected(item);
	}
}
