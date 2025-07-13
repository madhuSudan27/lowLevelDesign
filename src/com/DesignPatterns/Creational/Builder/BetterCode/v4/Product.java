package com.DesignPatterns.Creational.Builder.BetterCode.v4;

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


    private Product(Builder builder){

        this.name = builder.getName();
        this.price = builder.getPrice();
        this.description = builder.getDescription();
        this.category = builder.getCategory();
        this.brand = builder.getBrand();
        this.color = builder.getColor();
        this.createdAt = builder.getCreatedAt();
        this.updatedAt = builder.getUpdatedAt();
        this.images = builder.getImages();
    }


    public static Builder getBuilder(){
        return new Builder();
    }

    public static  class Builder{
        private String name;
        private double price;
        private String description;
        private String category;
        private String brand;
        private String color;
        private String createdAt;
        private String updatedAt;
        private List<String> images;


        public Builder setName(String name){
            if(name == null || name.length() <=2){
                throw  new RuntimeException("name should be at least 3 characters long");
            }
            this.name = name;
            return this;
        }

        public String getName(){
            return this.name;
        }

        public Builder setPrice(double price){
            if (price <= 0){
                throw new RuntimeException("price should be greater than 0");
            }
            this.price = price;
            return this;
        }

        public double getPrice(){
            return this.price;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public String getDescription(){
            return this.description;
        }

        public Builder setCategory(String category){
            this.category = category;
            return this;
        }

        public String getCategory(){
            return this.category;
        }

        public Builder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public String getBrand(){
            return this.brand;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public String getColor(){
            return this.color;
        }

        public Builder setCreatedAt(String createdAt){
            this.createdAt = createdAt;
            return this;
        }

        public String getCreatedAt(){
            return this.createdAt;
        }

        public Builder setUpdatedAt(String updatedAt){
            this.updatedAt = updatedAt;
            return this;
        }

        public String getUpdatedAt(){
            return this.updatedAt;
        }

        public Builder setImages(List<String> images){
            this.images = images;
            return this;
        }

        public List<String> getImages(){
            return this.images;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
