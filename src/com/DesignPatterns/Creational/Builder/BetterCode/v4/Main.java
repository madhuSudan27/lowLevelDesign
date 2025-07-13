package com.DesignPatterns.Creational.Builder.BetterCode.v4;

public class Main {
    public static void main(String[] args) {

        Product iPhone = Product.getBuilder()
                .setName("iPhone 12 Pro Max")
                .setCategory("Electronics")
                .setPrice(0)
                .build();
    }
}
