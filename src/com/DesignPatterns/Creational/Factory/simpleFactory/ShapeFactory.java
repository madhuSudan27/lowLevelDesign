package com.DesignPatterns.Creational.Factory.simpleFactory;

public abstract class ShapeFactory {

    public static Shape CreateShape(ShapeType shapeType){
        if(shapeType.equals(ShapeType.CIRCLE)){
            return new Circle();
        }
        else if(shapeType.equals(ShapeType.SQUARE)){
            return new Square();
        }
        else if(shapeType.equals(ShapeType.RECTANGLE)){
            return  new Rectangle();
        }
        else return  null;
    }
}
