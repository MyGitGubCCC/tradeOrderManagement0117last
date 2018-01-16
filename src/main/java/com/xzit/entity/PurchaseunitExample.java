package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class PurchaseunitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseunitExample() {
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

        public Criteria andPurchaseunitidIsNull() {
            addCriterion("purchaseUnitId is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidIsNotNull() {
            addCriterion("purchaseUnitId is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidEqualTo(Integer value) {
            addCriterion("purchaseUnitId =", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidNotEqualTo(Integer value) {
            addCriterion("purchaseUnitId <>", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidGreaterThan(Integer value) {
            addCriterion("purchaseUnitId >", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseUnitId >=", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidLessThan(Integer value) {
            addCriterion("purchaseUnitId <", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseUnitId <=", value, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidIn(List<Integer> values) {
            addCriterion("purchaseUnitId in", values, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidNotIn(List<Integer> values) {
            addCriterion("purchaseUnitId not in", values, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseUnitId between", value1, value2, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andPurchaseunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseUnitId not between", value1, value2, "purchaseunitid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andMembershipidIsNull() {
            addCriterion("membershipId is null");
            return (Criteria) this;
        }

        public Criteria andMembershipidIsNotNull() {
            addCriterion("membershipId is not null");
            return (Criteria) this;
        }

        public Criteria andMembershipidEqualTo(Integer value) {
            addCriterion("membershipId =", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidNotEqualTo(Integer value) {
            addCriterion("membershipId <>", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidGreaterThan(Integer value) {
            addCriterion("membershipId >", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipId >=", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidLessThan(Integer value) {
            addCriterion("membershipId <", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidLessThanOrEqualTo(Integer value) {
            addCriterion("membershipId <=", value, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidIn(List<Integer> values) {
            addCriterion("membershipId in", values, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidNotIn(List<Integer> values) {
            addCriterion("membershipId not in", values, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidBetween(Integer value1, Integer value2) {
            addCriterion("membershipId between", value1, value2, "membershipid");
            return (Criteria) this;
        }

        public Criteria andMembershipidNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipId not between", value1, value2, "membershipid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidIsNull() {
            addCriterion("creditlimitId is null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidIsNotNull() {
            addCriterion("creditlimitId is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidEqualTo(Integer value) {
            addCriterion("creditlimitId =", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidNotEqualTo(Integer value) {
            addCriterion("creditlimitId <>", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidGreaterThan(Integer value) {
            addCriterion("creditlimitId >", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditlimitId >=", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidLessThan(Integer value) {
            addCriterion("creditlimitId <", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidLessThanOrEqualTo(Integer value) {
            addCriterion("creditlimitId <=", value, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidIn(List<Integer> values) {
            addCriterion("creditlimitId in", values, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidNotIn(List<Integer> values) {
            addCriterion("creditlimitId not in", values, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidBetween(Integer value1, Integer value2) {
            addCriterion("creditlimitId between", value1, value2, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andCreditlimitidNotBetween(Integer value1, Integer value2) {
            addCriterion("creditlimitId not between", value1, value2, "creditlimitid");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNull() {
            addCriterion("\"Contact Information\" is null");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNotNull() {
            addCriterion("\"Contact Information\" is not null");
            return (Criteria) this;
        }

        public Criteria andContactInformationEqualTo(String value) {
            addCriterion("\"Contact Information\" =", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotEqualTo(String value) {
            addCriterion("\"Contact Information\" <>", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThan(String value) {
            addCriterion("\"Contact Information\" >", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThanOrEqualTo(String value) {
            addCriterion("\"Contact Information\" >=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThan(String value) {
            addCriterion("\"Contact Information\" <", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThanOrEqualTo(String value) {
            addCriterion("\"Contact Information\" <=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLike(String value) {
            addCriterion("\"Contact Information\" like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotLike(String value) {
            addCriterion("\"Contact Information\" not like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationIn(List<String> values) {
            addCriterion("\"Contact Information\" in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotIn(List<String> values) {
            addCriterion("\"Contact Information\" not in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationBetween(String value1, String value2) {
            addCriterion("\"Contact Information\" between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotBetween(String value1, String value2) {
            addCriterion("\"Contact Information\" not between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidIsNull() {
            addCriterion("customerOrderId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidIsNotNull() {
            addCriterion("customerOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidEqualTo(Integer value) {
            addCriterion("customerOrderId =", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidNotEqualTo(Integer value) {
            addCriterion("customerOrderId <>", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidGreaterThan(Integer value) {
            addCriterion("customerOrderId >", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerOrderId >=", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidLessThan(Integer value) {
            addCriterion("customerOrderId <", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidLessThanOrEqualTo(Integer value) {
            addCriterion("customerOrderId <=", value, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidIn(List<Integer> values) {
            addCriterion("customerOrderId in", values, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidNotIn(List<Integer> values) {
            addCriterion("customerOrderId not in", values, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidBetween(Integer value1, Integer value2) {
            addCriterion("customerOrderId between", value1, value2, "customerorderid");
            return (Criteria) this;
        }

        public Criteria andCustomerorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("customerOrderId not between", value1, value2, "customerorderid");
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