package com.xzit.entity;

/*
* 购买单位
* */
public class Purchaseunit {
    private Integer purchaseunitid;

    private String name;

    private String place;

    private Integer membershipid;

    private Integer creditlimitid;

    private String contactInformation;

    private Integer customerorderid;

    private Member member;

    private Creditlimit creditlimit;

    public Creditlimit getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(Creditlimit creditlimit) {
        this.creditlimit = creditlimit;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getPurchaseunitid() {
        return purchaseunitid;
    }

    public void setPurchaseunitid(Integer purchaseunitid) {
        this.purchaseunitid = purchaseunitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getMembershipid() {
        return membershipid;
    }

    public void setMembershipid(Integer membershipid) {
        this.membershipid = membershipid;
    }

    public Integer getCreditlimitid() {
        return creditlimitid;
    }

    public void setCreditlimitid(Integer creditlimitid) {
        this.creditlimitid = creditlimitid;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation == null ? null : contactInformation.trim();
    }

    public Integer getCustomerorderid() {
        return customerorderid;
    }

    public void setCustomerorderid(Integer customerorderid) {
        this.customerorderid = customerorderid;
    }
}