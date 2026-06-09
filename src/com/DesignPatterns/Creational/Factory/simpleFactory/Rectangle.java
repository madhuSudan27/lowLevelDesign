package com.DesignPatterns.Creational.Factory.simpleFactory;

public class Rectangle implements Shape{
    @Override
    public void computeArea() {
        System.out.println("Rectangle Area");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
