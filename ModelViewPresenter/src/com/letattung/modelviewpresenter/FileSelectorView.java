/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/model-view-presenter
 */
package com.letattung.modelviewpresenter;

public interface FileSelectorView {

	void open();
	
	void close();
	
	boolean isOpened();
	
	void setPresenter(FileSelectorPresenter presenter);
	
	FileSelectorPresenter getPresenter();
	
	void setFileName(String name);
	
	String getFileName();
	
	void showMessage(String message);
	
	void displayData(String data);
}
