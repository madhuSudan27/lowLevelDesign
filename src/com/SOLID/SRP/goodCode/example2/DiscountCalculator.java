package com.SOLID.SRP.goodCode.example2;

public class DiscountCalculator {


    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy stategy) {
        this.strategy = stategy;
    }

    public double calculateDiscount(double price) {
        return strategy.applyDiscount(price); // 30 % discount
    }
}
