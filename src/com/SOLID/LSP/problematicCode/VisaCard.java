package com.SOLID.LSP.problematicCode;

public class VisaCard extends CreditCard{
    @Override
    public void onlinePayment() {
        System.out.println("Visa online payment");
    }
    @Override
    public void tapAndPay() {
        System.out.println("Visa tap and pay");
    }
    @Override
    public void swipeAndPay() {
        System.out.println("Visa swipe and pay");
    }
    @Override
    public void mandatePayment() {
        System.out.println("Visa mandate payment");
    }

    /*
    Visa card does not supports UPI payment but still we have to implement
    */

    public void upiPayment() {
        System.out.println("Visa does not supports upi payment");
    }

}
