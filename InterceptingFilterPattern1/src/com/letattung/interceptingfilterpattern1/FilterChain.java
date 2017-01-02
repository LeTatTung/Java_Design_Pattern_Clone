// hoc theo java design pattern tutorial

package com.letattung.interceptingfilterpattern1;

import java.util.ArrayList;

public class FilterChain {

	private ArrayList<Filter> filters = new ArrayList<>();
	private Target target;
	
	public void addFilter(Filter filter){
		filters.add(filter);
	}
	
	public void setTarget(Target target){
		this.target = target;
	}
	
	public void execute(String request){
		for (Filter filter : filters){
			filter.execute(request);
		}
		target.execute(request);
	}
}
