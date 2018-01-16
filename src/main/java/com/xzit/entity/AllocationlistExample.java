package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class AllocationlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationlistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAllocationlistidIsNull() {
            addCriterion("allocationlistId is null");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidIsNotNull() {
            addCriterion("allocationlistId is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidEqualTo(Integer value) {
            addCriterion("allocationlistId =", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidNotEqualTo(Integer value) {
            addCriterion("allocationlistId <>", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidGreaterThan(Integer value) {
            addCriterion("allocationlistId >", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocationlistId >=", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidLessThan(Integer value) {
            addCriterion("allocationlistId <", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidLessThanOrEqualTo(Integer value) {
            addCriterion("allocationlistId <=", value, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidIn(List<Integer> values) {
            addCriterion("allocationlistId in", values, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidNotIn(List<Integer> values) {
            addCriterion("allocationlistId not in", values, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidBetween(Integer value1, Integer value2) {
            addCriterion("allocationlistId between", value1, value2, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("allocationlistId not between", value1, value2, "allocationlistid");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoIsNull() {
            addCriterion("allocationlistNo is null");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoIsNotNull() {
            addCriterion("allocationlistNo is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoEqualTo(String value) {
            addCriterion("allocationlistNo =", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoNotEqualTo(String value) {
            addCriterion("allocationlistNo <>", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoGreaterThan(String value) {
            addCriterion("allocationlistNo >", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoGreaterThanOrEqualTo(String value) {
            addCriterion("allocationlistNo >=", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoLessThan(String value) {
            addCriterion("allocationlistNo <", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoLessThanOrEqualTo(String value) {
            addCriterion("allocationlistNo <=", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoLike(String value) {
            addCriterion("allocationlistNo like", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoNotLike(String value) {
            addCriterion("allocationlistNo not like", value, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoIn(List<String> values) {
            addCriterion("allocationlistNo in", values, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoNotIn(List<String> values) {
            addCriterion("allocationlistNo not in", values, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoBetween(String value1, String value2) {
            addCriterion("allocationlistNo between", value1, value2, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andAllocationlistnoNotBetween(String value1, String value2) {
            addCriterion("allocationlistNo not between", value1, value2, "allocationlistno");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeid is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("employeeid =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("employeeid <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("employeeid >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeid >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("employeeid <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("employeeid <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("employeeid in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("employeeid not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("employeeid between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeid not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidIsNull() {
            addCriterion("salesListId is null");
            return (Criteria) this;
        }

        public Criteria andSaleslistidIsNotNull() {
            addCriterion("salesListId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleslistidEqualTo(Integer value) {
            addCriterion("salesListId =", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidNotEqualTo(Integer value) {
            addCriterion("salesListId <>", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidGreaterThan(Integer value) {
            addCriterion("salesListId >", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesListId >=", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidLessThan(Integer value) {
            addCriterion("salesListId <", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidLessThanOrEqualTo(Integer value) {
            addCriterion("salesListId <=", value, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidIn(List<Integer> values) {
            addCriterion("salesListId in", values, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidNotIn(List<Integer> values) {
            addCriterion("salesListId not in", values, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidBetween(Integer value1, Integer value2) {
            addCriterion("salesListId between", value1, value2, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andSaleslistidNotBetween(Integer value1, Integer value2) {
            addCriterion("salesListId not between", value1, value2, "saleslistid");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("employeeName is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("employeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("employeeName =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("employeeName <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("employeeName >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeName >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("employeeName <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("employeeName <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("employeeName like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("employeeName not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("employeeName in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("employeeName not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("employeeName between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("employeeName not between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeIsNull() {
            addCriterion("allocationTime is null");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeIsNotNull() {
            addCriterion("allocationTime is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeEqualTo(String value) {
            addCriterion("allocationTime =", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeNotEqualTo(String value) {
            addCriterion("allocationTime <>", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeGreaterThan(String value) {
            addCriterion("allocationTime >", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("allocationTime >=", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeLessThan(String value) {
            addCriterion("allocationTime <", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeLessThanOrEqualTo(String value) {
            addCriterion("allocationTime <=", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeLike(String value) {
            addCriterion("allocationTime like", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeNotLike(String value) {
            addCriterion("allocationTime not like", value, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeIn(List<String> values) {
            addCriterion("allocationTime in", values, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeNotIn(List<String> values) {
            addCriterion("allocationTime not in", values, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeBetween(String value1, String value2) {
            addCriterion("allocationTime between", value1, value2, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationtimeNotBetween(String value1, String value2) {
            addCriterion("allocationTime not between", value1, value2, "allocationtime");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueIsNull() {
            addCriterion("allocationStatue is null");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueIsNotNull() {
            addCriterion("allocationStatue is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueEqualTo(String value) {
            addCriterion("allocationStatue =", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueNotEqualTo(String value) {
            addCriterion("allocationStatue <>", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueGreaterThan(String value) {
            addCriterion("allocationStatue >", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueGreaterThanOrEqualTo(String value) {
            addCriterion("allocationStatue >=", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueLessThan(String value) {
            addCriterion("allocationStatue <", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueLessThanOrEqualTo(String value) {
            addCriterion("allocationStatue <=", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueLike(String value) {
            addCriterion("allocationStatue like", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueNotLike(String value) {
            addCriterion("allocationStatue not like", value, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueIn(List<String> values) {
            addCriterion("allocationStatue in", values, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueNotIn(List<String> values) {
            addCriterion("allocationStatue not in", values, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueBetween(String value1, String value2) {
            addCriterion("allocationStatue between", value1, value2, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andAllocationstatueNotBetween(String value1, String value2) {
            addCriterion("allocationStatue not between", value1, value2, "allocationstatue");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidIsNull() {
            addCriterion("checkemployeeid is null");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidIsNotNull() {
            addCriterion("checkemployeeid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidEqualTo(Integer value) {
            addCriterion("checkemployeeid =", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidNotEqualTo(Integer value) {
            addCriterion("checkemployeeid <>", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidGreaterThan(Integer value) {
            addCriterion("checkemployeeid >", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkemployeeid >=", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidLessThan(Integer value) {
            addCriterion("checkemployeeid <", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("checkemployeeid <=", value, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidIn(List<Integer> values) {
            addCriterion("checkemployeeid in", values, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidNotIn(List<Integer> values) {
            addCriterion("checkemployeeid not in", values, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidBetween(Integer value1, Integer value2) {
            addCriterion("checkemployeeid between", value1, value2, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andCheckemployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkemployeeid not between", value1, value2, "checkemployeeid");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNull() {
            addCriterion("checkName is null");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNotNull() {
            addCriterion("checkName is not null");
            return (Criteria) this;
        }

        public Criteria andChecknameEqualTo(String value) {
            addCriterion("checkName =", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotEqualTo(String value) {
            addCriterion("checkName <>", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThan(String value) {
            addCriterion("checkName >", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThanOrEqualTo(String value) {
            addCriterion("checkName >=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThan(String value) {
            addCriterion("checkName <", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThanOrEqualTo(String value) {
            addCriterion("checkName <=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLike(String value) {
            addCriterion("checkName like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotLike(String value) {
            addCriterion("checkName not like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameIn(List<String> values) {
            addCriterion("checkName in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotIn(List<String> values) {
            addCriterion("checkName not in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameBetween(String value1, String value2) {
            addCriterion("checkName between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotBetween(String value1, String value2) {
            addCriterion("checkName not between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("checkTime like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("checkTime not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityName is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(String value) {
            addCriterion("commodityName =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(String value) {
            addCriterion("commodityName <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(String value) {
            addCriterion("commodityName >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityName >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(String value) {
            addCriterion("commodityName <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("commodityName <=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLike(String value) {
            addCriterion("commodityName like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotLike(String value) {
            addCriterion("commodityName not like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIn(List<String> values) {
            addCriterion("commodityName in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<String> values) {
            addCriterion("commodityName not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(String value1, String value2) {
            addCriterion("commodityName between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(String value1, String value2) {
            addCriterion("commodityName not between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIsNull() {
            addCriterion("commodityPrice is null");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIsNotNull() {
            addCriterion("commodityPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceEqualTo(String value) {
            addCriterion("commodityPrice =", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotEqualTo(String value) {
            addCriterion("commodityPrice <>", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceGreaterThan(String value) {
            addCriterion("commodityPrice >", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceGreaterThanOrEqualTo(String value) {
            addCriterion("commodityPrice >=", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceLessThan(String value) {
            addCriterion("commodityPrice <", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceLessThanOrEqualTo(String value) {
            addCriterion("commodityPrice <=", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceLike(String value) {
            addCriterion("commodityPrice like", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotLike(String value) {
            addCriterion("commodityPrice not like", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIn(List<String> values) {
            addCriterion("commodityPrice in", values, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotIn(List<String> values) {
            addCriterion("commodityPrice not in", values, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceBetween(String value1, String value2) {
            addCriterion("commodityPrice between", value1, value2, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotBetween(String value1, String value2) {
            addCriterion("commodityPrice not between", value1, value2, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNull() {
            addCriterion("ammount is null");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNotNull() {
            addCriterion("ammount is not null");
            return (Criteria) this;
        }

        public Criteria andAmmountEqualTo(String value) {
            addCriterion("ammount =", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotEqualTo(String value) {
            addCriterion("ammount <>", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThan(String value) {
            addCriterion("ammount >", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThanOrEqualTo(String value) {
            addCriterion("ammount >=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThan(String value) {
            addCriterion("ammount <", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThanOrEqualTo(String value) {
            addCriterion("ammount <=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLike(String value) {
            addCriterion("ammount like", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotLike(String value) {
            addCriterion("ammount not like", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountIn(List<String> values) {
            addCriterion("ammount in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotIn(List<String> values) {
            addCriterion("ammount not in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountBetween(String value1, String value2) {
            addCriterion("ammount between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotBetween(String value1, String value2) {
            addCriterion("ammount not between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionIsNull() {
            addCriterion("allocationopinion is null");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionIsNotNull() {
            addCriterion("allocationopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionEqualTo(String value) {
            addCriterion("allocationopinion =", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionNotEqualTo(String value) {
            addCriterion("allocationopinion <>", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionGreaterThan(String value) {
            addCriterion("allocationopinion >", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionGreaterThanOrEqualTo(String value) {
            addCriterion("allocationopinion >=", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionLessThan(String value) {
            addCriterion("allocationopinion <", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionLessThanOrEqualTo(String value) {
            addCriterion("allocationopinion <=", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionLike(String value) {
            addCriterion("allocationopinion like", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionNotLike(String value) {
            addCriterion("allocationopinion not like", value, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionIn(List<String> values) {
            addCriterion("allocationopinion in", values, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionNotIn(List<String> values) {
            addCriterion("allocationopinion not in", values, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionBetween(String value1, String value2) {
            addCriterion("allocationopinion between", value1, value2, "allocationopinion");
            return (Criteria) this;
        }

        public Criteria andAllocationopinionNotBetween(String value1, String value2) {
            addCriterion("allocationopinion not between", value1, value2, "allocationopinion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}