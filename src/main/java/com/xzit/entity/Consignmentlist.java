package com.xzit.entity;


/*
*
* 托运单*/
public class Consignmentlist {
    private Integer consignmentlistid;

    private String consignmentlistno;

    private Integer employeeid;

    private String weight;

    private String size;

    private String number;

    private String waybillnumber;

    private String unit;

    private Integer receivingpartyid;

    //自己加的
    private Employee employee;

    private Receivingparty receivingparty;

    public Receivingparty getReceivingparty() {
        return receivingparty;
    }

    public void setReceivingparty(Receivingparty receivingparty) {
        this.receivingparty = receivingparty;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getConsignmentlistid() {
        return consignmentlistid;
    }

    public void setConsignmentlistid(Integer consignmentlistid) {
        this.consignmentlistid = consignmentlistid;
    }

    public String getConsignmentlistno() {
        return consignmentlistno;
    }

    public void setConsignmentlistno(String consignmentlistno) {
        this.consignmentlistno = consignmentlistno == null ? null : consignmentlistno.trim();
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getWaybillnumber() {
        return waybillnumber;
    }

    public void setWaybillnumber(String waybillnumber) {
        this.waybillnumber = waybillnumber == null ? null : waybillnumber.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getReceivingpartyid() {
        return receivingpartyid;
    }

    public void setReceivingpartyid(Integer receivingpartyid) {
        this.receivingpartyid = receivingpartyid;
    }
}