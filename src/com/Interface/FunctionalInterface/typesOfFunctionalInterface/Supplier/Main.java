package com.Interface.FunctionalInterface.typesOfFunctionalInterface.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> supplyingFood = ()->{
            return "It's Dossa!!";
        };

        supplyingFood.getFood();
    }
}
