//hoc theo java design pattern tutorial
package com.letattung.abstractfactorypattern1;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType == null){
			return null;
		}else if (shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

}
