package com.xzit.entity;

public class Allocationlist {
    private Integer allocationlistid;

    private String allocationlistno;

    private Integer employeeid;

    private Integer saleslistid;

    private String employeename;

    private String allocationtime;

    private String allocationstatue;

    private Integer checkemployeeid;

    private String checkname;

    private String checktime;

    private String commodityname;

    private String commodityprice;

    private String ammount;

    private String description;

    private String allocationopinion;

    public Integer getAllocationlistid() {
        return allocationlistid;
    }

    public void setAllocationlistid(Integer allocationlistid) {
        this.allocationlistid = allocationlistid;
    }

    public String getAllocationlistno() {
        return allocationlistno;
    }

    public void setAllocationlistno(String allocationlistno) {
        this.allocationlistno = allocationlistno == null ? null : allocationlistno.trim();
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getSaleslistid() {
        return saleslistid;
    }

    public void setSaleslistid(Integer saleslistid) {
        this.saleslistid = saleslistid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getAllocationtime() {
        return allocationtime;
    }

    public void setAllocationtime(String allocationtime) {
        this.allocationtime = allocationtime == null ? null : allocationtime.trim();
    }

    public String getAllocationstatue() {
        return allocationstatue;
    }

    public void setAllocationstatue(String allocationstatue) {
        this.allocationstatue = allocationstatue == null ? null : allocationstatue.trim();
    }

    public Integer getCheckemployeeid() {
        return checkemployeeid;
    }

    public void setCheckemployeeid(Integer checkemployeeid) {
        this.checkemployeeid = checkemployeeid;
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname == null ? null : checkname.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(String commodityprice) {
        this.commodityprice = commodityprice == null ? null : commodityprice.trim();
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount == null ? null : ammount.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAllocationopinion() {
        return allocationopinion;
    }

    public void setAllocationopinion(String allocationopinion) {
        this.allocationopinion = allocationopinion == null ? null : allocationopinion.trim();
    }
}