package com.xzit.entity;

/*
* 收货方
* */
public class Receivingparty {
    private Integer receivingpartyid;

    private String province;

    private String city;

    private String county;

    private String street;

    private String detailedaddress;

    private String postalcode;

    private String receiptname;

    private String phonenumber;

    private String telephone;

    public Integer getReceivingpartyid() {
        return receivingpartyid;
    }

    public void setReceivingpartyid(Integer receivingpartyid) {
        this.receivingpartyid = receivingpartyid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress == null ? null : detailedaddress.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getReceiptname() {
        return receiptname;
    }

    public void setReceiptname(String receiptname) {
        this.receiptname = receiptname == null ? null : receiptname.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}