/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.action;

public class ContentAction extends Action{

	private Content content;
	
	public ContentAction(Content content) {
		super(ActionType.CONTENT_CHANGED);
		this.content = content;
	}
	
	public Content getContent(){
		return content;
	}

}
