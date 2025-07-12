package com.DesignPatterns.Creational.Builder.BetterCode.v1;

public class Main {

    public static void main(String[] args) {

        Product iPhone = new Product();
        iPhone.setName("iPhone 12 Pro Max");
        iPhone.setCategory("Electronics");
        iPhone.setPrice(999.99);
        iPhone.setBrand("Apple");
        iPhone.setDescription("Smartphone");
        iPhone.setColor("Space Gray");

        /*
            Problem :- we are not validating the object before creation
             we have to also validate the attributes before creation

         */

    }
}
