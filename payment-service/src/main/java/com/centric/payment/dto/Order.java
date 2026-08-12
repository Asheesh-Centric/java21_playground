package com.centric.payment.dto;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Long id;
    private String orderNumber;

    private Long customerId;

    private List<OrderItem> items;

    private BigDecimal totalAmount;

    private String status;

    public Order(Long id, String orderNumber, Long customerId, List<OrderItem> items, BigDecimal totalAmount, String status) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Order(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Order other)) {
            return false;
        }

        return orderNumber != null &&
                orderNumber.equals(other.orderNumber);
    }


    // hashCode

    @Override
    public int hashCode() {
        return orderNumber != null
                ? orderNumber.hashCode()
                : 0;
    }


    // toString


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", customerId=" + customerId +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
