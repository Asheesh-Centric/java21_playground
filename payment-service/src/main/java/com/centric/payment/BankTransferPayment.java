package com.centric.payment;

import java.math.BigDecimal;

public record BankTransferPayment(String name, BigDecimal amount) implements PaymentMethod {
    public BankTransferPayment {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is not valid");
        }

        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount is not valid");
        }
    }
}
