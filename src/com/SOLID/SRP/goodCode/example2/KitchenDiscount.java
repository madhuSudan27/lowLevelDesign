package com.SOLID.SRP.goodCode.example2;

public class KitchenDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20 % discount
    }
}
