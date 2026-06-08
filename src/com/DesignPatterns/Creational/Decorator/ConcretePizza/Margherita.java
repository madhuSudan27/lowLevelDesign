package com.DesignPatterns.Creational.Decorator.ConcretePizza;

import com.DesignPatterns.Creational.Decorator.BasePizza;

public class Margherita implements BasePizza {
    @Override
    public String getDescription() {
        return "Classic Margherita";
    }

    @Override
    public double getPrice() {
        return 160;
    }
}
