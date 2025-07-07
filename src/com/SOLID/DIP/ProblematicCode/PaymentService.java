package com.SOLID.DIP.ProblematicCode;

import java.sql.Struct;

public class PaymentService {

    public void makePayment(String type) {

        if(type.equals("CreditCard")) {
            // creditCard payment logic
        }
        if(type.equals("DebitCard")) {
            // debitCard payment logic
        }
        if(type.equals("NetBanking")) {
            // netBanking payment logic
        }
        if(type.equals("UPI")) {
            // upi payment logic
        }

        /*
            High-level PaymentService depends directly on low-level implementations.
            Adding a new method (like Crypto) requires modifying PaymentService.
         */
    }
}
