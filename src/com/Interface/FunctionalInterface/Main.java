package com.Interface.FunctionalInterface;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Sparrow();
        bird.fly();
        bird.sing();

        // we can also anonymously implement the interface
        // this is called anonymous class
        // this gives the birth of lambda expression
        Bird bird1 = new Bird() {
            @Override
            public void fly() {
                System.out.println("Sparrow is flying");
            }
        };

        bird1.fly();
    }
}
