package com.SOLID.DIP.BetterCode;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("CreditCard payment of " + amount);
    }
}
