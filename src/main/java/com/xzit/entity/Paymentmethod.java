package com.xzit.entity;

/*
* 支付方式
* */
public class Paymentmethod {
    private Integer paymentmethodid;

    private String name;

    private String description;

    public Integer getPaymentmethodid() {
        return paymentmethodid;
    }

    public void setPaymentmethodid(Integer paymentmethodid) {
        this.paymentmethodid = paymentmethodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}