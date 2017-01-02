// hoc theo java design pattern tutorial

package com.letattung.interceptingfilterpattern1;

public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}

}
