package com.DesignPatterns.Creational.Factory.factoryMethod;

import com.DesignPatterns.Creational.Factory.simpleFactory.Shape;
import com.DesignPatterns.Creational.Factory.simpleFactory.ShapeType;

public class ShapeFactoryMethod {

    public static Shape getShapeInstance(ShapeType shapeType){
        if(shapeType.equals(ShapeType.CIRCLE)) return new CircleFactory().createShape();
        else if(shapeType.equals(ShapeType.SQUARE)) return new SquareFactory().createShape();
        else return  null;

    }
}
