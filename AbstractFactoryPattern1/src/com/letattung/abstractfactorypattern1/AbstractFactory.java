//hoc theo java design pattern tutorial
package com.letattung.abstractfactorypattern1;

public abstract class AbstractFactory {

	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorType);
}
