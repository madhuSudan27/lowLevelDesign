package com.DesignPatterns.Creational.Decorator;

public class PaneerTopping extends ToppingDecorator{
    PaneerTopping(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + " + Paneer";
    }

    @Override
    public double getPrice() {
        return basePizza.getPrice() + 40;
    }
}
