package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliverynoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverynoteExample() {
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

        public Criteria andDeliverynoteidIsNull() {
            addCriterion("deliveryNoteId is null");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidIsNotNull() {
            addCriterion("deliveryNoteId is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidEqualTo(Integer value) {
            addCriterion("deliveryNoteId =", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidNotEqualTo(Integer value) {
            addCriterion("deliveryNoteId <>", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidGreaterThan(Integer value) {
            addCriterion("deliveryNoteId >", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryNoteId >=", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidLessThan(Integer value) {
            addCriterion("deliveryNoteId <", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryNoteId <=", value, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidIn(List<Integer> values) {
            addCriterion("deliveryNoteId in", values, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidNotIn(List<Integer> values) {
            addCriterion("deliveryNoteId not in", values, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidBetween(Integer value1, Integer value2) {
            addCriterion("deliveryNoteId between", value1, value2, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynoteidNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryNoteId not between", value1, value2, "deliverynoteid");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoIsNull() {
            addCriterion("deliveryNoteNo is null");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoIsNotNull() {
            addCriterion("deliveryNoteNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoEqualTo(String value) {
            addCriterion("deliveryNoteNo =", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoNotEqualTo(String value) {
            addCriterion("deliveryNoteNo <>", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoGreaterThan(String value) {
            addCriterion("deliveryNoteNo >", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryNoteNo >=", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoLessThan(String value) {
            addCriterion("deliveryNoteNo <", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoLessThanOrEqualTo(String value) {
            addCriterion("deliveryNoteNo <=", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoLike(String value) {
            addCriterion("deliveryNoteNo like", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoNotLike(String value) {
            addCriterion("deliveryNoteNo not like", value, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoIn(List<String> values) {
            addCriterion("deliveryNoteNo in", values, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoNotIn(List<String> values) {
            addCriterion("deliveryNoteNo not in", values, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoBetween(String value1, String value2) {
            addCriterion("deliveryNoteNo between", value1, value2, "deliverynoteno");
            return (Criteria) this;
        }

        public Criteria andDeliverynotenoNotBetween(String value1, String value2) {
            addCriterion("deliveryNoteNo not between", value1, value2, "deliverynoteno");
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

        public Criteria andPickupIsNull() {
            addCriterion("pickUp is null");
            return (Criteria) this;
        }

        public Criteria andPickupIsNotNull() {
            addCriterion("pickUp is not null");
            return (Criteria) this;
        }

        public Criteria andPickupEqualTo(String value) {
            addCriterion("pickUp =", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotEqualTo(String value) {
            addCriterion("pickUp <>", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupGreaterThan(String value) {
            addCriterion("pickUp >", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupGreaterThanOrEqualTo(String value) {
            addCriterion("pickUp >=", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupLessThan(String value) {
            addCriterion("pickUp <", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupLessThanOrEqualTo(String value) {
            addCriterion("pickUp <=", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupLike(String value) {
            addCriterion("pickUp like", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotLike(String value) {
            addCriterion("pickUp not like", value, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupIn(List<String> values) {
            addCriterion("pickUp in", values, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotIn(List<String> values) {
            addCriterion("pickUp not in", values, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupBetween(String value1, String value2) {
            addCriterion("pickUp between", value1, value2, "pickup");
            return (Criteria) this;
        }

        public Criteria andPickupNotBetween(String value1, String value2) {
            addCriterion("pickUp not between", value1, value2, "pickup");
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