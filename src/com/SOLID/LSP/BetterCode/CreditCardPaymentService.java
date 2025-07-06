package com.SOLID.LSP.BetterCode;

public class CreditCardPaymentService {


    public void processOnlinePayement(OnlinePaymentCompatibleCreditCard creditCard) {
        creditCard.onlinePayment();
    }

    public void processTapAndPay(TapAndPayCompatibleCreditCard creditCard) {
        creditCard.tapAndPay();
    }
    public void processSwipeAndPay(SwipeAndPayCompatibleCreditCard creditCard) {
        creditCard.swipeAndPay();
    }
    public void processMandatePayment(MandatePaymentCompatibleCreditCard creditCard) {
        creditCard.mandatePayment();
    }
    public void processUpiPayment(UpiCompatibleCreditCard creditCard) {
        creditCard.upiPayment();
    }
    public void processRupayPayment(InternationPaymentCompatibleCreditCard creditCard) {
        creditCard.internationPayment();
    }

}
