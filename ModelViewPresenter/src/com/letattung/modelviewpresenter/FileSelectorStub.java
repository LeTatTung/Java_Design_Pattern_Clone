/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/model-view-presenter
 */
package com.letattung.modelviewpresenter;

public class FileSelectorStub implements FileSelectorView{

	private boolean opened;
	private FileSelectorPresenter presenter;
	private String name;
	private int numOfMessageSent;
	private boolean dataDisplayed;
	
	public FileSelectorStub() {
		this.opened = false;
		this.presenter = null;
		this.name = "";
		this.numOfMessageSent = 0;
		this.dataDisplayed = false;
	}
	
	@Override
	public void open() {
		this.opened = true;
	}

	@Override
	public void close() {
		this.opened = false;
	}

	@Override
	public boolean isOpened() {
		return this.opened;
	}

	@Override
	public void setPresenter(FileSelectorPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public FileSelectorPresenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setFileName(String name) {
		this.name = name;
	}

	@Override
	public String getFileName() {
		return this.name;
	}

	@Override
	public void showMessage(String message) {
		this.numOfMessageSent ++;
	}

	@Override
	public void displayData(String data) {
		this.dataDisplayed = true;
	}

	public int getMessageSent(){
		return this.numOfMessageSent;
	}
	
	public boolean dataDisplayed(){
		return this.dataDisplayed;
	}
}
