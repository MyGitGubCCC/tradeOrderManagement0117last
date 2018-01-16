package com.xzit.entity;


/*
* 申请取消托运*/
public class Applicationcancelling {
    private Integer applicationcancellingid;

    private Integer consignmentlistid;

    private String date;

    private String reason;

    private String changesequencenumber;

    public Integer getApplicationcancellingid() {
        return applicationcancellingid;
    }

    public void setApplicationcancellingid(Integer applicationcancellingid) {
        this.applicationcancellingid = applicationcancellingid;
    }

    public Integer getConsignmentlistid() {
        return consignmentlistid;
    }

    public void setConsignmentlistid(Integer consignmentlistid) {
        this.consignmentlistid = consignmentlistid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getChangesequencenumber() {
        return changesequencenumber;
    }

    public void setChangesequencenumber(String changesequencenumber) {
        this.changesequencenumber = changesequencenumber == null ? null : changesequencenumber.trim();
    }
}