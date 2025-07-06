package com.SOLID.LSP.BetterCode;

public class MasterCard extends CreditCard implements OnlinePaymentCompatibleCreditCard,

    SwipeAndPayCompatibleCreditCard, TapAndPayCompatibleCreditCard, InternationPaymentCompatibleCreditCard {



    MasterCard(String cardName, int cardNumber) {
        super(cardName, cardNumber);
    }
    @Override
    public void onlinePayment() {
        System.out.println("MasterCard online payment!!");
    }

    @Override
    public void internationPayment() {
        System.out.println("MasterCard internation payment");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("MasterCard swipe and pay");
    }

    @Override
    public void tapAndPay() {
        System.out.println("MasterCard tap and pay");
    }
}
