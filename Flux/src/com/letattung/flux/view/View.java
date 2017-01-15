/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.view;

import com.letattung.flux.store.Store;

public interface View {

	void storeChanged(Store store);
	void render();
}
