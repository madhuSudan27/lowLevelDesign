package com.DesignPatterns.Creational.Builder.BetterCode.v2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Object> iphoneProduct = new HashMap<>();
        iphoneProduct.put("name", "iPhone 12 Pro Max");
        iphoneProduct.put("category", "Electronics");
        iphoneProduct.put("price", 999.99);
        iphoneProduct.put("brand", "Apple");
        iphoneProduct.put("description", "Smartphone");
        iphoneProduct.put("color", "Space Gray");

        Product iPhone = new Product(iphoneProduct);
    }
}
