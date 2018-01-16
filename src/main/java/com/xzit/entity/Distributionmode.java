package com.xzit.entity;


/*
* 配送方式*/
public class Distributionmode {
    private Integer distributionmodeid;

    private String name;

    private String description;

    public Integer getDistributionmodeid() {
        return distributionmodeid;
    }

    public void setDistributionmodeid(Integer distributionmodeid) {
        this.distributionmodeid = distributionmodeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}