package com.DesignPatterns.Creational.Factory.simpleFactory;

public class Circle implements Shape{
    @Override
    public void computeArea() {
        System.out.println("Circle Area");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
