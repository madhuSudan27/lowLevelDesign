package com.SOLID.SRP.goodCode.example2;

public class ClothingDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.7; // 30 % discount
    }
}
