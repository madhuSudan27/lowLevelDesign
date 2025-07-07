package com.SOLID.DIP.BetterCode;

public class Upi implements  PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Upi payment of amount "+amount);
    }
}
