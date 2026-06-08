package com.DesignPatterns.Creational.Decorator.ConcretePizza;

import com.DesignPatterns.Creational.Decorator.BasePizza;

public class FarmHouse implements BasePizza {
    @Override
    public String getDescription() {
        return "Farmhouse";
    }

    @Override
    public double getPrice() {
        return 357;
    }
}
