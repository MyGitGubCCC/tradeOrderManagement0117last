package com.xzit.entity;

/*
* 部门*/
public class Department {
    private Integer departmentid;

    private String departmentno;

    private String departmentname;

    private String description;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}