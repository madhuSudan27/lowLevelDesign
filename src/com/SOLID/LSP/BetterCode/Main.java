package com.SOLID.LSP.BetterCode;

public class Main {
    public static void main(String[] args) {

        CreditCardPaymentService creditCardPaymentService = new CreditCardPaymentService();

        MasterCard masterCard = new MasterCard("MasterCard", 1234);

        creditCardPaymentService.processOnlinePayement(masterCard);
        // since master card does not provide upi payment  we will face an error
//        creditCardPaymentService.processUpiPayment(masterCard);

        creditCardPaymentService.processSwipeAndPay(masterCard);


        RupayCard rupayCard = new RupayCard("RupayCard", 1234);
        creditCardPaymentService.processOnlinePayement(rupayCard);
        creditCardPaymentService.processUpiPayment(rupayCard);
        creditCardPaymentService.processSwipeAndPay(rupayCard);


    }
}
