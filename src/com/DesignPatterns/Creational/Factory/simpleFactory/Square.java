package com.DesignPatterns.Creational.Factory.simpleFactory;

public class Square implements Shape{
    @Override
    public void computeArea() {
        System.out.println("Square Area");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
