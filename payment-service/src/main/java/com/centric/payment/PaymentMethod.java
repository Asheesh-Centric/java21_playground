package com.centric.payment;

sealed public interface PaymentMethod permits CardPayment, BankTransferPayment, WalletPayment {

}
