/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/model-view-presenter
 */
package com.letattung.modelviewpresenter;

public class FileSelectorPresenter {

	private FileSelectorView view;
	
	private FileLoader loader;
	
	public FileSelectorPresenter(FileSelectorView view) {
		this.view = view;
	}
	
	public void setLoader(FileLoader loader){
		this.loader = loader;
	}
	
	public void start(){
		view.setPresenter(this);
		view.open();
	}
	
	public void fileNameChanged(){
		loader.setFileName(view.getFileName());
	}
	
	public void confirmed(){
		
		if (loader.getFileName() == null || loader.getFileName().equals("")){
			view.showMessage("Please give the name of the file first!");
			return;
		}
		if (loader.fileExists()){
			String data = loader.loadData();
			view.displayData(data);
		}else{
			view.showMessage("The file specified does not exist.");
		}
	}
	
	public void cancelled(){
		view.close();
	}
}
