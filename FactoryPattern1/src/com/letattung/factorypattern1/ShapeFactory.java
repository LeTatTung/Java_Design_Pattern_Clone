package com.letattung.factorypattern1;
//hoc theo java design pattern tutorial

public class ShapeFactory {

	// su dung method getShape de return object theo dung type truyen vao
	public Shape getShape(String shapeType){
		if (shapeType == null){
			return null;
		}else if (shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
}
