/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.flux.action.Content;
import com.letattung.flux.store.ContentStore;
import com.letattung.flux.store.Store;

public class ContentView implements View{

	private static final Logger LOGGER = LoggerFactory.getLogger(ContentView.class);
	private Content content = Content.PRODUCTS;
	
	@Override
	public void storeChanged(Store store) {
		ContentStore contentStore = (ContentStore) store;
		content = contentStore.getContent();
		render();
	}

	@Override
	public void render() {
		LOGGER.info(content.toString());
	}

}
