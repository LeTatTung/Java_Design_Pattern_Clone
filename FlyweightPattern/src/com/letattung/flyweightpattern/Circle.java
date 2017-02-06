// hoc theo java design pattern tutorial

package com.letattung.flyweightpattern;

public class Circle implements Shape{

	private int x;
	private int y;
	private int radius;
	private String color;
	
	public Circle(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);	
	}

}
