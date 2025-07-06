package com.SOLID.SRP.goodCode.example2;

public class Main {
    public static void main(String[] args) {
        double price = 1000;

        ClothingDiscount clothingproductDiscount = new ClothingDiscount();
        DiscountCalculator clothingCalculator = new DiscountCalculator(clothingproductDiscount);
        System.out.println(clothingCalculator.calculateDiscount(price));


        DiscountCalculator kitchenCalculator = new DiscountCalculator(new KitchenDiscount());
        System.out.println(kitchenCalculator.calculateDiscount(price));

        DiscountCalculator electronicCalculator = new DiscountCalculator(new ElectronicDiscount());
        System.out.println(electronicCalculator.calculateDiscount(price));
    }
}
