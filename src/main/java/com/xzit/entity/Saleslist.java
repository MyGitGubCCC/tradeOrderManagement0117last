package com.xzit.entity;

/*
销售清单
* */
public class Saleslist {
    private Integer saleslistid;

    private Integer employeeid;

    private Integer purchaseunitid;

    private Integer commodityid;

    private Integer receivingpartyid;

    private Integer creditlimitid;

    private Integer distributionmodeid;

    private Integer paymentmethodid;

    private Integer applytransferformid;

    private String due;

    private String expressfee;

    private String ordertime;

    private String orderstatus1;

    private String buyerno;

    private String consigneeno;

    private String deliverymethodno;

    private String paymentmethodno;

    private String expectdeliverydate;

    private String actualpayment;

    private String actualpaymentcapital;

    private String paymenttime;

    private String formtime;

    private String orderstatus2;

    private String notes;

    private Employee employee;
    private Purchaseunit purchaseunit;//购买单位
    private Commodity commodity;//商品
    private Receivingparty receivingparty;//收货方
    private Distributionmode distributionmode;//配送方式
    private Paymentmethod paymentmethod;//付款方式
    private Applytransferform applytransferform;//调拨申请单


    public Applytransferform getApplytransferform() {
        return applytransferform;
    }

    public void setApplytransferform(Applytransferform applytransferform) {
        this.applytransferform = applytransferform;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Purchaseunit getPurchaseunit() {
        return purchaseunit;
    }

    public void setPurchaseunit(Purchaseunit purchaseunit) {
        this.purchaseunit = purchaseunit;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Receivingparty getReceivingparty() {
        return receivingparty;
    }

    public void setReceivingparty(Receivingparty receivingparty) {
        this.receivingparty = receivingparty;
    }

    public Distributionmode getDistributionmode() {
        return distributionmode;
    }

    public void setDistributionmode(Distributionmode distributionmode) {
        this.distributionmode = distributionmode;
    }

    public Paymentmethod getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(Paymentmethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Integer getSaleslistid() {
        return saleslistid;
    }

    public void setSaleslistid(Integer saleslistid) {
        this.saleslistid = saleslistid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getPurchaseunitid() {
        return purchaseunitid;
    }

    public void setPurchaseunitid(Integer purchaseunitid) {
        this.purchaseunitid = purchaseunitid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getReceivingpartyid() {
        return receivingpartyid;
    }

    public void setReceivingpartyid(Integer receivingpartyid) {
        this.receivingpartyid = receivingpartyid;
    }

    public Integer getCreditlimitid() {
        return creditlimitid;
    }

    public void setCreditlimitid(Integer creditlimitid) {
        this.creditlimitid = creditlimitid;
    }

    public Integer getDistributionmodeid() {
        return distributionmodeid;
    }

    public void setDistributionmodeid(Integer distributionmodeid) {
        this.distributionmodeid = distributionmodeid;
    }

    public Integer getPaymentmethodid() {
        return paymentmethodid;
    }

    public void setPaymentmethodid(Integer paymentmethodid) {
        this.paymentmethodid = paymentmethodid;
    }

    public Integer getApplytransferformid() {
        return applytransferformid;
    }

    public void setApplytransferformid(Integer applytransferformid) {
        this.applytransferformid = applytransferformid;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due == null ? null : due.trim();
    }

    public String getExpressfee() {
        return expressfee;
    }

    public void setExpressfee(String expressfee) {
        this.expressfee = expressfee == null ? null : expressfee.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getOrderstatus1() {
        return orderstatus1;
    }

    public void setOrderstatus1(String orderstatus1) {
        this.orderstatus1 = orderstatus1 == null ? null : orderstatus1.trim();
    }

    public String getBuyerno() {
        return buyerno;
    }

    public void setBuyerno(String buyerno) {
        this.buyerno = buyerno == null ? null : buyerno.trim();
    }

    public String getConsigneeno() {
        return consigneeno;
    }

    public void setConsigneeno(String consigneeno) {
        this.consigneeno = consigneeno == null ? null : consigneeno.trim();
    }

    public String getDeliverymethodno() {
        return deliverymethodno;
    }

    public void setDeliverymethodno(String deliverymethodno) {
        this.deliverymethodno = deliverymethodno == null ? null : deliverymethodno.trim();
    }

    public String getPaymentmethodno() {
        return paymentmethodno;
    }

    public void setPaymentmethodno(String paymentmethodno) {
        this.paymentmethodno = paymentmethodno == null ? null : paymentmethodno.trim();
    }

    public String getExpectdeliverydate() {
        return expectdeliverydate;
    }

    public void setExpectdeliverydate(String expectdeliverydate) {
        this.expectdeliverydate = expectdeliverydate == null ? null : expectdeliverydate.trim();
    }

    public String getActualpayment() {
        return actualpayment;
    }

    public void setActualpayment(String actualpayment) {
        this.actualpayment = actualpayment == null ? null : actualpayment.trim();
    }

    public String getActualpaymentcapital() {
        return actualpaymentcapital;
    }

    public void setActualpaymentcapital(String actualpaymentcapital) {
        this.actualpaymentcapital = actualpaymentcapital == null ? null : actualpaymentcapital.trim();
    }

    public String getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(String paymenttime) {
        this.paymenttime = paymenttime == null ? null : paymenttime.trim();
    }

    public String getFormtime() {
        return formtime;
    }

    public void setFormtime(String formtime) {
        this.formtime = formtime == null ? null : formtime.trim();
    }

    public String getOrderstatus2() {
        return orderstatus2;
    }

    public void setOrderstatus2(String orderstatus2) {
        this.orderstatus2 = orderstatus2 == null ? null : orderstatus2.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}