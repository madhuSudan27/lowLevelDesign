package com.DesignPatterns.Creational.Builder.ProblematicCode;

public class Product {

    private String name;
    private double price;
    private String description;
    private String category;
    private String brand;
    private String color;

    Product() {

    }

    public Product(String name, double price, String description, String category, String brand, String color) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
