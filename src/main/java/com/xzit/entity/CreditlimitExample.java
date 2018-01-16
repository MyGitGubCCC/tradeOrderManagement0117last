package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class CreditlimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditlimitExample() {
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

        public Criteria andFinalreviewdateIsNull() {
            addCriterion("finalreviewDate is null");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateIsNotNull() {
            addCriterion("finalreviewDate is not null");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateEqualTo(String value) {
            addCriterion("finalreviewDate =", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateNotEqualTo(String value) {
            addCriterion("finalreviewDate <>", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateGreaterThan(String value) {
            addCriterion("finalreviewDate >", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateGreaterThanOrEqualTo(String value) {
            addCriterion("finalreviewDate >=", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateLessThan(String value) {
            addCriterion("finalreviewDate <", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateLessThanOrEqualTo(String value) {
            addCriterion("finalreviewDate <=", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateLike(String value) {
            addCriterion("finalreviewDate like", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateNotLike(String value) {
            addCriterion("finalreviewDate not like", value, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateIn(List<String> values) {
            addCriterion("finalreviewDate in", values, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateNotIn(List<String> values) {
            addCriterion("finalreviewDate not in", values, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateBetween(String value1, String value2) {
            addCriterion("finalreviewDate between", value1, value2, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andFinalreviewdateNotBetween(String value1, String value2) {
            addCriterion("finalreviewDate not between", value1, value2, "finalreviewdate");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameIsNull() {
            addCriterion("Auditaccountingname is null");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameIsNotNull() {
            addCriterion("Auditaccountingname is not null");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameEqualTo(String value) {
            addCriterion("Auditaccountingname =", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameNotEqualTo(String value) {
            addCriterion("Auditaccountingname <>", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameGreaterThan(String value) {
            addCriterion("Auditaccountingname >", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameGreaterThanOrEqualTo(String value) {
            addCriterion("Auditaccountingname >=", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameLessThan(String value) {
            addCriterion("Auditaccountingname <", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameLessThanOrEqualTo(String value) {
            addCriterion("Auditaccountingname <=", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameLike(String value) {
            addCriterion("Auditaccountingname like", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameNotLike(String value) {
            addCriterion("Auditaccountingname not like", value, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameIn(List<String> values) {
            addCriterion("Auditaccountingname in", values, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameNotIn(List<String> values) {
            addCriterion("Auditaccountingname not in", values, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameBetween(String value1, String value2) {
            addCriterion("Auditaccountingname between", value1, value2, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andAuditaccountingnameNotBetween(String value1, String value2) {
            addCriterion("Auditaccountingname not between", value1, value2, "auditaccountingname");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("Customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("Customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("Customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("Customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("Customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("Customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("Customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("Customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("Customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("Customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("Customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("Customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("Customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("Customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionIsNull() {
            addCriterion("Creditsituationdescription is null");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionIsNotNull() {
            addCriterion("Creditsituationdescription is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionEqualTo(String value) {
            addCriterion("Creditsituationdescription =", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionNotEqualTo(String value) {
            addCriterion("Creditsituationdescription <>", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionGreaterThan(String value) {
            addCriterion("Creditsituationdescription >", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Creditsituationdescription >=", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionLessThan(String value) {
            addCriterion("Creditsituationdescription <", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionLessThanOrEqualTo(String value) {
            addCriterion("Creditsituationdescription <=", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionLike(String value) {
            addCriterion("Creditsituationdescription like", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionNotLike(String value) {
            addCriterion("Creditsituationdescription not like", value, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionIn(List<String> values) {
            addCriterion("Creditsituationdescription in", values, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionNotIn(List<String> values) {
            addCriterion("Creditsituationdescription not in", values, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionBetween(String value1, String value2) {
            addCriterion("Creditsituationdescription between", value1, value2, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCreditsituationdescriptionNotBetween(String value1, String value2) {
            addCriterion("Creditsituationdescription not between", value1, value2, "creditsituationdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionIsNull() {
            addCriterion("Customeraddressdescription is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionIsNotNull() {
            addCriterion("Customeraddressdescription is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionEqualTo(String value) {
            addCriterion("Customeraddressdescription =", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionNotEqualTo(String value) {
            addCriterion("Customeraddressdescription <>", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionGreaterThan(String value) {
            addCriterion("Customeraddressdescription >", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Customeraddressdescription >=", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionLessThan(String value) {
            addCriterion("Customeraddressdescription <", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionLessThanOrEqualTo(String value) {
            addCriterion("Customeraddressdescription <=", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionLike(String value) {
            addCriterion("Customeraddressdescription like", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionNotLike(String value) {
            addCriterion("Customeraddressdescription not like", value, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionIn(List<String> values) {
            addCriterion("Customeraddressdescription in", values, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionNotIn(List<String> values) {
            addCriterion("Customeraddressdescription not in", values, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionBetween(String value1, String value2) {
            addCriterion("Customeraddressdescription between", value1, value2, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressdescriptionNotBetween(String value1, String value2) {
            addCriterion("Customeraddressdescription not between", value1, value2, "customeraddressdescription");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeIsNull() {
            addCriterion("Intercoursetime is null");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeIsNotNull() {
            addCriterion("Intercoursetime is not null");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeEqualTo(String value) {
            addCriterion("Intercoursetime =", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeNotEqualTo(String value) {
            addCriterion("Intercoursetime <>", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeGreaterThan(String value) {
            addCriterion("Intercoursetime >", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeGreaterThanOrEqualTo(String value) {
            addCriterion("Intercoursetime >=", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeLessThan(String value) {
            addCriterion("Intercoursetime <", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeLessThanOrEqualTo(String value) {
            addCriterion("Intercoursetime <=", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeLike(String value) {
            addCriterion("Intercoursetime like", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeNotLike(String value) {
            addCriterion("Intercoursetime not like", value, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeIn(List<String> values) {
            addCriterion("Intercoursetime in", values, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeNotIn(List<String> values) {
            addCriterion("Intercoursetime not in", values, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeBetween(String value1, String value2) {
            addCriterion("Intercoursetime between", value1, value2, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andIntercoursetimeNotBetween(String value1, String value2) {
            addCriterion("Intercoursetime not between", value1, value2, "intercoursetime");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastIsNull() {
            addCriterion("Descriptionpaymentipast is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastIsNotNull() {
            addCriterion("Descriptionpaymentipast is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastEqualTo(String value) {
            addCriterion("Descriptionpaymentipast =", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastNotEqualTo(String value) {
            addCriterion("Descriptionpaymentipast <>", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastGreaterThan(String value) {
            addCriterion("Descriptionpaymentipast >", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastGreaterThanOrEqualTo(String value) {
            addCriterion("Descriptionpaymentipast >=", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastLessThan(String value) {
            addCriterion("Descriptionpaymentipast <", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastLessThanOrEqualTo(String value) {
            addCriterion("Descriptionpaymentipast <=", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastLike(String value) {
            addCriterion("Descriptionpaymentipast like", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastNotLike(String value) {
            addCriterion("Descriptionpaymentipast not like", value, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastIn(List<String> values) {
            addCriterion("Descriptionpaymentipast in", values, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastNotIn(List<String> values) {
            addCriterion("Descriptionpaymentipast not in", values, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastBetween(String value1, String value2) {
            addCriterion("Descriptionpaymentipast between", value1, value2, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andDescriptionpaymentipastNotBetween(String value1, String value2) {
            addCriterion("Descriptionpaymentipast not between", value1, value2, "descriptionpaymentipast");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalIsNull() {
            addCriterion("Customercapital is null");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalIsNotNull() {
            addCriterion("Customercapital is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalEqualTo(String value) {
            addCriterion("Customercapital =", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalNotEqualTo(String value) {
            addCriterion("Customercapital <>", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalGreaterThan(String value) {
            addCriterion("Customercapital >", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalGreaterThanOrEqualTo(String value) {
            addCriterion("Customercapital >=", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalLessThan(String value) {
            addCriterion("Customercapital <", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalLessThanOrEqualTo(String value) {
            addCriterion("Customercapital <=", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalLike(String value) {
            addCriterion("Customercapital like", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalNotLike(String value) {
            addCriterion("Customercapital not like", value, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalIn(List<String> values) {
            addCriterion("Customercapital in", values, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalNotIn(List<String> values) {
            addCriterion("Customercapital not in", values, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalBetween(String value1, String value2) {
            addCriterion("Customercapital between", value1, value2, "customercapital");
            return (Criteria) this;
        }

        public Criteria andCustomercapitalNotBetween(String value1, String value2) {
            addCriterion("Customercapital not between", value1, value2, "customercapital");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidIsNull() {
            addCriterion("MarketingdepartmentaccountID is null");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidIsNotNull() {
            addCriterion("MarketingdepartmentaccountID is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidEqualTo(String value) {
            addCriterion("MarketingdepartmentaccountID =", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidNotEqualTo(String value) {
            addCriterion("MarketingdepartmentaccountID <>", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidGreaterThan(String value) {
            addCriterion("MarketingdepartmentaccountID >", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("MarketingdepartmentaccountID >=", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidLessThan(String value) {
            addCriterion("MarketingdepartmentaccountID <", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidLessThanOrEqualTo(String value) {
            addCriterion("MarketingdepartmentaccountID <=", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidLike(String value) {
            addCriterion("MarketingdepartmentaccountID like", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidNotLike(String value) {
            addCriterion("MarketingdepartmentaccountID not like", value, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidIn(List<String> values) {
            addCriterion("MarketingdepartmentaccountID in", values, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidNotIn(List<String> values) {
            addCriterion("MarketingdepartmentaccountID not in", values, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidBetween(String value1, String value2) {
            addCriterion("MarketingdepartmentaccountID between", value1, value2, "marketingdepartmentaccountid");
            return (Criteria) this;
        }

        public Criteria andMarketingdepartmentaccountidNotBetween(String value1, String value2) {
            addCriterion("MarketingdepartmentaccountID not between", value1, value2, "marketingdepartmentaccountid");
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