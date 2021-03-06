/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.action;

public class MenuAction extends Action{

	private MenuItem menuItem;
	
	public MenuAction(MenuItem menuItem) {
		super(ActionType.MENU_ITEM_SELECTED);
		this.menuItem = menuItem;
	}
	
	public MenuItem getMenuItem(){
		return menuItem;
	}

}
