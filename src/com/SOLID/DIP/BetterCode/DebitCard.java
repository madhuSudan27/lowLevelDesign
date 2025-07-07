package com.SOLID.DIP.BetterCode;

public class DebitCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("DebitCard payment of " + amount + " is successful.");
    }
}
