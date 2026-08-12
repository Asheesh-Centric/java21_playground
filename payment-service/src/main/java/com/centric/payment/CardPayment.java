package com.centric.payment;

import java.math.BigDecimal;

public record CardPayment(String cardNumber, BigDecimal amount ) implements PaymentMethod {

    public CardPayment{
        if(cardNumber == null || cardNumber.length() != 16) {
            throw new IllegalArgumentException("Card number is not valid");
        }

        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

}
