package com.DesignPatterns.Creational.Decorator;

public class MushroomTopping extends ToppingDecorator {


    protected MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " + Mushroom";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + 23;
    }
}
