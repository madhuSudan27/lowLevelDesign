package com.Interface.FunctionalInterface.typesOfFunctionalInterface.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumingFood = (String food)->{

            System.out.println("Its Yummy!!");
        };

        consumingFood.eat("Sweet");
    }
}
