package com.SOLID.LSP.BetterCode;

public class VisaCard extends CreditCard implements OnlinePaymentCompatibleCreditCard, MandatePaymentCompatibleCreditCard,
        TapAndPayCompatibleCreditCard, InternationPaymentCompatibleCreditCard, SwipeAndPayCompatibleCreditCard
{

    VisaCard(String cardName, int cardNumber) {
        super(cardName, cardNumber);
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa Card processing online payment");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Visa Card processing mandate payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa Card processing tap and pay");
    }

    @Override
    public void internationPayment() {
        System.out.println("Visa card processing internation payment");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa Card processing swipe and pay");
    }
}
