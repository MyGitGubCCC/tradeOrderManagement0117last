package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class ConsignmentlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsignmentlistExample() {
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

        public Criteria andConsignmentlistidIsNull() {
            addCriterion("consignmentListId is null");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidIsNotNull() {
            addCriterion("consignmentListId is not null");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidEqualTo(Integer value) {
            addCriterion("consignmentListId =", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidNotEqualTo(Integer value) {
            addCriterion("consignmentListId <>", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidGreaterThan(Integer value) {
            addCriterion("consignmentListId >", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("consignmentListId >=", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidLessThan(Integer value) {
            addCriterion("consignmentListId <", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidLessThanOrEqualTo(Integer value) {
            addCriterion("consignmentListId <=", value, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidIn(List<Integer> values) {
            addCriterion("consignmentListId in", values, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidNotIn(List<Integer> values) {
            addCriterion("consignmentListId not in", values, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidBetween(Integer value1, Integer value2) {
            addCriterion("consignmentListId between", value1, value2, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("consignmentListId not between", value1, value2, "consignmentlistid");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoIsNull() {
            addCriterion("consignmentListNo is null");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoIsNotNull() {
            addCriterion("consignmentListNo is not null");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoEqualTo(String value) {
            addCriterion("consignmentListNo =", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoNotEqualTo(String value) {
            addCriterion("consignmentListNo <>", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoGreaterThan(String value) {
            addCriterion("consignmentListNo >", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoGreaterThanOrEqualTo(String value) {
            addCriterion("consignmentListNo >=", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoLessThan(String value) {
            addCriterion("consignmentListNo <", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoLessThanOrEqualTo(String value) {
            addCriterion("consignmentListNo <=", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoLike(String value) {
            addCriterion("consignmentListNo like", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoNotLike(String value) {
            addCriterion("consignmentListNo not like", value, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoIn(List<String> values) {
            addCriterion("consignmentListNo in", values, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoNotIn(List<String> values) {
            addCriterion("consignmentListNo not in", values, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoBetween(String value1, String value2) {
            addCriterion("consignmentListNo between", value1, value2, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andConsignmentlistnoNotBetween(String value1, String value2) {
            addCriterion("consignmentListNo not between", value1, value2, "consignmentlistno");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("employeeId =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("employeeId <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("employeeId >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeId >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("employeeId <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("employeeId <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("employeeId in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("employeeId not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("employeeId between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeId not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberIsNull() {
            addCriterion("waybillNumber is null");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberIsNotNull() {
            addCriterion("waybillNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberEqualTo(String value) {
            addCriterion("waybillNumber =", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberNotEqualTo(String value) {
            addCriterion("waybillNumber <>", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberGreaterThan(String value) {
            addCriterion("waybillNumber >", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberGreaterThanOrEqualTo(String value) {
            addCriterion("waybillNumber >=", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberLessThan(String value) {
            addCriterion("waybillNumber <", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberLessThanOrEqualTo(String value) {
            addCriterion("waybillNumber <=", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberLike(String value) {
            addCriterion("waybillNumber like", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberNotLike(String value) {
            addCriterion("waybillNumber not like", value, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberIn(List<String> values) {
            addCriterion("waybillNumber in", values, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberNotIn(List<String> values) {
            addCriterion("waybillNumber not in", values, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberBetween(String value1, String value2) {
            addCriterion("waybillNumber between", value1, value2, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andWaybillnumberNotBetween(String value1, String value2) {
            addCriterion("waybillNumber not between", value1, value2, "waybillnumber");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidIsNull() {
            addCriterion("receivingPartyId is null");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidIsNotNull() {
            addCriterion("receivingPartyId is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidEqualTo(Integer value) {
            addCriterion("receivingPartyId =", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidNotEqualTo(Integer value) {
            addCriterion("receivingPartyId <>", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidGreaterThan(Integer value) {
            addCriterion("receivingPartyId >", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receivingPartyId >=", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidLessThan(Integer value) {
            addCriterion("receivingPartyId <", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidLessThanOrEqualTo(Integer value) {
            addCriterion("receivingPartyId <=", value, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidIn(List<Integer> values) {
            addCriterion("receivingPartyId in", values, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidNotIn(List<Integer> values) {
            addCriterion("receivingPartyId not in", values, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidBetween(Integer value1, Integer value2) {
            addCriterion("receivingPartyId between", value1, value2, "receivingpartyid");
            return (Criteria) this;
        }

        public Criteria andReceivingpartyidNotBetween(Integer value1, Integer value2) {
            addCriterion("receivingPartyId not between", value1, value2, "receivingpartyid");
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