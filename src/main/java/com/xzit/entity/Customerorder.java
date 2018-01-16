package com.xzit.entity;

/*
* 客户订单
* */
public class Customerorder {
    private Integer customerorderid;

    private String money;

    private String time;

    private String people;

    public Integer getCustomerorderid() {
        return customerorderid;
    }

    public void setCustomerorderid(Integer customerorderid) {
        this.customerorderid = customerorderid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }
}