package com.SOLID.LSP.problematicCode;

public abstract class CreditCard {

    String cardName;
    int cardNumber;

    public String getCardName() {
        return cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public abstract void onlinePayment();

    public abstract void tapAndPay();

    public abstract void swipeAndPay();
    public abstract void  mandatePayment();

    public abstract void UpiPayment() throws NoSuchMethodException;


    // now later on we need to add one more method
    // international Payment
    // but our rupay card does not support international payment
}
