package com.DesignPatterns.Creational.Builder.BetterCode.v2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String description;
    private String category;
    private String brand;
    private String color;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    // default constructor
    Product(Map<String, Object> hashMap) {
//        this.name = (String) hashMap.get("name");
//        this.price = (double) hashMap.get("price");

        /*

            we solved the existing problem, still we have some new problems

            we need to check if the key exists


            here comes the problem of type casting
            some typo in the key name will cause a runtime exception
            lots of check are needed

         */
    }




}
