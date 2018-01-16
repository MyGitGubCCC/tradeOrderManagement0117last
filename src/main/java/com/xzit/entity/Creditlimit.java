package com.xzit.entity;

/*
* 客户信用
* */
public class Creditlimit {
    private Integer creditlimitid;

    private String finalreviewdate;

    private String auditaccountingname;

    private String customername;

    private String creditsituationdescription;

    private String customeraddressdescription;

    private Integer customerid;

    private String intercoursetime;

    private String descriptionpaymentipast;

    private String customercapital;

    private String marketingdepartmentaccountid;

    public Integer getCreditlimitid() {
        return creditlimitid;
    }

    public void setCreditlimitid(Integer creditlimitid) {
        this.creditlimitid = creditlimitid;
    }

    public String getFinalreviewdate() {
        return finalreviewdate;
    }

    public void setFinalreviewdate(String finalreviewdate) {
        this.finalreviewdate = finalreviewdate == null ? null : finalreviewdate.trim();
    }

    public String getAuditaccountingname() {
        return auditaccountingname;
    }

    public void setAuditaccountingname(String auditaccountingname) {
        this.auditaccountingname = auditaccountingname == null ? null : auditaccountingname.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCreditsituationdescription() {
        return creditsituationdescription;
    }

    public void setCreditsituationdescription(String creditsituationdescription) {
        this.creditsituationdescription = creditsituationdescription == null ? null : creditsituationdescription.trim();
    }

    public String getCustomeraddressdescription() {
        return customeraddressdescription;
    }

    public void setCustomeraddressdescription(String customeraddressdescription) {
        this.customeraddressdescription = customeraddressdescription == null ? null : customeraddressdescription.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getIntercoursetime() {
        return intercoursetime;
    }

    public void setIntercoursetime(String intercoursetime) {
        this.intercoursetime = intercoursetime == null ? null : intercoursetime.trim();
    }

    public String getDescriptionpaymentipast() {
        return descriptionpaymentipast;
    }

    public void setDescriptionpaymentipast(String descriptionpaymentipast) {
        this.descriptionpaymentipast = descriptionpaymentipast == null ? null : descriptionpaymentipast.trim();
    }

    public String getCustomercapital() {
        return customercapital;
    }

    public void setCustomercapital(String customercapital) {
        this.customercapital = customercapital == null ? null : customercapital.trim();
    }

    public String getMarketingdepartmentaccountid() {
        return marketingdepartmentaccountid;
    }

    public void setMarketingdepartmentaccountid(String marketingdepartmentaccountid) {
        this.marketingdepartmentaccountid = marketingdepartmentaccountid == null ? null : marketingdepartmentaccountid.trim();
    }
}