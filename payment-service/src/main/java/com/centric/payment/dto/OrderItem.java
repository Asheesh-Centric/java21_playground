package com.centric.payment.dto;

import java.math.BigDecimal;

public record OrderItem(String name, Integer quantity, BigDecimal price) {
    public OrderItem {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is not valid");
        }

        if(quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }

        if(price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
    }
}
