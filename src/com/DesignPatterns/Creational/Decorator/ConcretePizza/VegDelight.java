package com.DesignPatterns.Creational.Decorator.ConcretePizza;

import com.DesignPatterns.Creational.Decorator.BasePizza;

public class VegDelight implements BasePizza {
    @Override
    public String getDescription() {
        return "Veg Delight";
    }

    @Override
    public double getPrice() {
        return 120;
    }
}
