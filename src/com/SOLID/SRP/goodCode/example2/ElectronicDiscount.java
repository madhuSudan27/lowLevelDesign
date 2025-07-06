package com.SOLID.SRP.goodCode.example2;

public class ElectronicDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10 % discount
    }
}
