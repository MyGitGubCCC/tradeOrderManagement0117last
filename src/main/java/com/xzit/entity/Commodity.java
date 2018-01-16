package com.xzit.entity;

public class Commodity {
    private Integer commodityid;

    private String commodityno;

    private String commodityname;

    private String specification;

    private String commodityprice;

    private String description;

    private String ammount;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityno() {
        return commodityno;
    }

    public void setCommodityno(String commodityno) {
        this.commodityno = commodityno == null ? null : commodityno.trim();
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(String commodityprice) {
        this.commodityprice = commodityprice == null ? null : commodityprice.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount == null ? null : ammount.trim();
    }
}