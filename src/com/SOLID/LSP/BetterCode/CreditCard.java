package com.SOLID.LSP.BetterCode;

import java.util.Date;

public abstract class CreditCard {

    String cardName;
    int cardNumber;
    int cvv;
    Date expiryDate;

    CreditCard(String cardName, int cardNumber) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    CreditCard(String cardName, int cardNumber, int cvv, Date expiryDate) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

}
