package com.DesignPatterns.Creational.Decorator.ConcretePizza;

import com.DesignPatterns.Creational.Decorator.BasePizza;

public class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getPrice() {
        return 90;
    }


}
