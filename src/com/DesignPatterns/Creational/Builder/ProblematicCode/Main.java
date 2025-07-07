package com.DesignPatterns.Creational.Builder.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setCategory("Clothing");
        shirt.setPrice(19.99);

        Product iphon = new Product();
        iphon.setName("Iphone");
        iphon.setCategory("Electronics");
        iphon.setPrice(999.99);
        iphon.setBrand("Apple");
        iphon.setDescription("Smartphone");

        Product shoes = new Product();
        shoes.setName("Shoes");
        shoes.setCategory("Footwear");
        shoes.setPrice(49.99);

        Product bag = new Product();
        bag.setName("Bag");
        bag.setCategory("Accessories");
        bag.setPrice(29.99);

    }
}
