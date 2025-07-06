package com.SOLID.LSP.problematicCode;

public class RepayCard extends CreditCard {
    @Override
    public void onlinePayment() {
        System.out.println("RepayCard online payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("RupayCard tap and pay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("RupayCard swipe and pay");
    }

    @Override
    public void mandatePayment() {
        System.out.println("RepayCard mandate payment");
    }

    @Override
    public void UpiPayment() {
        System.out.println("RepayCard Upi payment");
    }
}
