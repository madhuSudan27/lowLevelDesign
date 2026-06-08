package com.DesignPatterns.Creational.Decorator;

public class CheeseTopping extends ToppingDecorator {

    CheeseTopping(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + 30;
    }
}
