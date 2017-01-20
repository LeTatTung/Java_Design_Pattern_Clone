/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/model-view-presenter
 */
package com.letattung.modelviewpresenter;

public class App {

	public static void main(String [] args){
		
		FileLoader loader = new FileLoader();
		FileSelectorJFrame jFrame = new FileSelectorJFrame();
		FileSelectorPresenter presenter = new FileSelectorPresenter(jFrame);
		presenter.setLoader(loader);
		presenter.start();
	}
}
