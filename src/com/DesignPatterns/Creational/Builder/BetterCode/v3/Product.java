package com.DesignPatterns.Creational.Builder.BetterCode.v3;

import java.util.List;

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


    Product(ProductBuilder productBuilder){

        if(productBuilder.getName() != null){
            this.name = productBuilder.getName();
        }
        if(productBuilder.getPrice() > 0){
            this.price = productBuilder.getPrice();
        }
        if(productBuilder.getDescription() != null){
            this.description = productBuilder.getDescription();
        }
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
    public List<String> getImages() {
        return images;
    }
}
