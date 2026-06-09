package com.DesignPatterns.Creational.Factory.factoryMethod;

import com.DesignPatterns.Creational.Factory.simpleFactory.Circle;
import com.DesignPatterns.Creational.Factory.simpleFactory.Shape;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
