package com.centric.payment.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderRecord(
        Long id,
        String orderNumber,
        Long customerId,
        List<OrderItem> items,
        BigDecimal totalAmount

) {
}
