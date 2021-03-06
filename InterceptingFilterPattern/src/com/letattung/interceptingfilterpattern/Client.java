// hoc theo java design pattern tutorial

package com.letattung.interceptingfilterpattern;

public class Client {

	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request){
		filterManager.filterRequest(request);
	}
}
