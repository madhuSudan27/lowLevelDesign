package com.DesignPatterns.Creational.Builder.BetterCode.v3;

public class Main {
    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.setName("iPhone 12 Pro Max");
        productBuilder.setCategory("Electronics");
        productBuilder.setPrice(999.99);
        productBuilder.setBrand("Apple");
        productBuilder.setDescription("Smartphone");
        productBuilder.setColor("Space Gray");

        Product iPhone = new Product(productBuilder);

        System.out.println(iPhone.getName());
    }
}
