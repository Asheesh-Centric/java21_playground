package com.centric.payment;

import java.math.BigDecimal;

public record WalletPayment(String walletName, BigDecimal amount) implements PaymentMethod {
    public WalletPayment {
        if(walletName == null || walletName.isBlank()) {
            throw new IllegalArgumentException("Wallet name is not valid");
        }

        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount is not valid");
        }
    }
}
