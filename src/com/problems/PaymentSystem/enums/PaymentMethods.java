package com.problems.PaymentSystem.enums;

public enum PaymentMethods {
    UPI("UPI"),
    CREDIT_CARD("Credit Card"),
    DEBIT_CARD("Debit Card"),
    NET_BANKING("Net Banking"),
    PAYPAL("Pay pal");

    private final String displayName;


    PaymentMethods(String displayName) {
        this.displayName = displayName;
    }
    public  String getDisplayName(){
        return displayName;
    }
}
