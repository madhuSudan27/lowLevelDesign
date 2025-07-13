package com.DesignPatterns.Creational.Builder.BetterCode.v3;

import javax.management.RuntimeMBeanException;
import java.util.List;

public class ProductBuilder {
    private String name;
    private double price;
    private String description;
    private String category;
    private String brand;
    private String color;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) throw new RuntimeException("name cannot be null");
        if(name.length() <= 2) throw  new RuntimeException("name should be at least 3 characters long");
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
