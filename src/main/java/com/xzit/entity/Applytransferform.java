package com.xzit.entity;

/*
* 调拨申请
* */
public class Applytransferform {
    private Integer applytransferformid;

    private Integer allocationlistid;

    private Integer saleslistid;

    private String transfertime;

    private Integer transfermanid;

    private String comment;

    private Allocationlist allocationlist;

    public Allocationlist getAllocationlist() {
        return allocationlist;
    }

    public void setAllocationlist(Allocationlist allocationlist) {
        this.allocationlist = allocationlist;
    }

    public Integer getApplytransferformid() {
        return applytransferformid;
    }

    public void setApplytransferformid(Integer applytransferformid) {
        this.applytransferformid = applytransferformid;
    }

    public Integer getAllocationlistid() {
        return allocationlistid;
    }

    public void setAllocationlistid(Integer allocationlistid) {
        this.allocationlistid = allocationlistid;
    }

    public Integer getSaleslistid() {
        return saleslistid;
    }

    public void setSaleslistid(Integer saleslistid) {
        this.saleslistid = saleslistid;
    }

    public String getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(String transfertime) {
        this.transfertime = transfertime == null ? null : transfertime.trim();
    }

    public Integer getTransfermanid() {
        return transfermanid;
    }

    public void setTransfermanid(Integer transfermanid) {
        this.transfermanid = transfermanid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}