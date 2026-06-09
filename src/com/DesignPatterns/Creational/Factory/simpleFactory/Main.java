package com.DesignPatterns.Creational.Factory.simpleFactory;

public class Main {
    public static void main(String[] args) {

        Shape shape = ShapeFactory.CreateShape(ShapeType.RECTANGLE);
        shape.computeArea();
        shape.draw();
    }
}
