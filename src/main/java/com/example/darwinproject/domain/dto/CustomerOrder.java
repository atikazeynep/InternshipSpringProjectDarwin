package com.example.darwinproject.domain.dto;

public class CustomerOrder extends Base{
    private long customerOrderId;
    private long productOfferId;
    private long userId;
    private long orderId;

    public long getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(long customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public long getProductOfferId() {
        return productOfferId;
    }

    public void setProductOfferId(long productOfferId) {
        this.productOfferId = productOfferId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

}
