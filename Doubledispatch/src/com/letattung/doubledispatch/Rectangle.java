/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

public class Rectangle {

	private int left;
	private int right;
	private int top;
	private int bottom;
	
	public Rectangle(int left, int right, int top, int bottom) {
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
	}
	
	public int getLeft(){
		return left;
	}
	
	public int getRight(){
		return right;
	}
	
	public int getTop(){
		return top;
	}
	
	public int getBottom(){
		return bottom;
	}
	
	public boolean intersectsWith(Rectangle rectangle){
		return !(rectangle.getLeft() > getRight() || rectangle.getRight() < getLeft() 
				|| rectangle.getTop() > getBottom() || rectangle.getBottom() < getTop());
	}
}
