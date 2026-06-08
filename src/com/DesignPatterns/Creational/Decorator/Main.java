package com.DesignPatterns.Creational.Decorator;

import com.DesignPatterns.Creational.Decorator.ConcretePizza.PlainPizza;

public class Main {
    public static void main(String[] args) {

        BasePizza pizza = new PlainPizza();
        pizza = new MushroomTopping( new PaneerTopping( new CheeseTopping(pizza)));

        System.out.println( pizza.getDescription() + "\n price :- " + pizza.getPrice());
    }
}
