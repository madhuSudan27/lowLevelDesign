package com.DesignPatterns.Creational.Decorator;

public abstract class ToppingDecorator implements BasePizza{

    BasePizza basePizza;
    protected ToppingDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
}
