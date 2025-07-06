package com.SOLID.LSP.BetterCode;

public class RupayCard extends CreditCard implements MandatePaymentCompatibleCreditCard
, UpiCompatibleCreditCard, OnlinePaymentCompatibleCreditCard, SwipeAndPayCompatibleCreditCard

{

    RupayCard(String cardName, int cardNumber) {
        super(cardName, cardNumber);
    }

    @Override
    public void mandatePayment() {
        System.out.println("RupayCard mandate payment");
    }

    @Override
    public void upiPayment() {
        System.out.println("RupayCard upi payment");
    }

    @Override
    public void onlinePayment() {
        System.out.println("RupayCard online payment");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("RupayCard swipe and pay");
    }
}
