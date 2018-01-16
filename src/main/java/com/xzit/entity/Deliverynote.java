package com.xzit.entity;

/*
* 送货单
* */
public class Deliverynote {
    private Integer deliverynoteid;

    private String deliverynoteno;

    private Integer saleslistid;

    private String pickup;

    private Integer employeeid;

    private Saleslist saleslist;

    private Employee employee;

    public Saleslist getSaleslist() {
        return saleslist;
    }

    public void setSaleslist(Saleslist saleslist) {
        this.saleslist = saleslist;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getDeliverynoteid() {
        return deliverynoteid;
    }

    public void setDeliverynoteid(Integer deliverynoteid) {
        this.deliverynoteid = deliverynoteid;
    }

    public String getDeliverynoteno() {
        return deliverynoteno;
    }

    public void setDeliverynoteno(String deliverynoteno) {
        this.deliverynoteno = deliverynoteno == null ? null : deliverynoteno.trim();
    }

    public Integer getSaleslistid() {
        return saleslistid;
    }

    public void setSaleslistid(Integer saleslistid) {
        this.saleslistid = saleslistid;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup == null ? null : pickup.trim();
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }
}