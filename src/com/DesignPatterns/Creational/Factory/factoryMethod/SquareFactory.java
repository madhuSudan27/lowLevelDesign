package com.DesignPatterns.Creational.Factory.factoryMethod;

import com.DesignPatterns.Creational.Factory.simpleFactory.Shape;
import com.DesignPatterns.Creational.Factory.simpleFactory.Square;

public class SquareFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
