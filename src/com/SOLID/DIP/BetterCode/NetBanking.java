package com.SOLID.DIP.BetterCode;

public class NetBanking implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("NetBanking payment of " + amount + " is successful");
    }
}
