package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleslistExample() {
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

        public Criteria andCommodityidIsNull() {
            addCriterion("commodityId is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityId is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(Integer value) {
            addCriterion("commodityId =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(Integer value) {
            addCriterion("commodityId <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(Integer value) {
            addCriterion("commodityId >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityId >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(Integer value) {
            addCriterion("commodityId <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(Integer value) {
            addCriterion("commodityId <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<Integer> values) {
            addCriterion("commodityId in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<Integer> values) {
            addCriterion("commodityId not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(Integer value1, Integer value2) {
            addCriterion("commodityId between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityId not between", value1, value2, "commodityid");
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

        public Criteria andDistributionmodeidIsNull() {
            addCriterion("distributionModeId is null");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidIsNotNull() {
            addCriterion("distributionModeId is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidEqualTo(Integer value) {
            addCriterion("distributionModeId =", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidNotEqualTo(Integer value) {
            addCriterion("distributionModeId <>", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidGreaterThan(Integer value) {
            addCriterion("distributionModeId >", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("distributionModeId >=", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidLessThan(Integer value) {
            addCriterion("distributionModeId <", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidLessThanOrEqualTo(Integer value) {
            addCriterion("distributionModeId <=", value, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidIn(List<Integer> values) {
            addCriterion("distributionModeId in", values, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidNotIn(List<Integer> values) {
            addCriterion("distributionModeId not in", values, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidBetween(Integer value1, Integer value2) {
            addCriterion("distributionModeId between", value1, value2, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andDistributionmodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("distributionModeId not between", value1, value2, "distributionmodeid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIsNull() {
            addCriterion("paymentMethodId is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIsNotNull() {
            addCriterion("paymentMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidEqualTo(Integer value) {
            addCriterion("paymentMethodId =", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotEqualTo(Integer value) {
            addCriterion("paymentMethodId <>", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidGreaterThan(Integer value) {
            addCriterion("paymentMethodId >", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodId >=", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidLessThan(Integer value) {
            addCriterion("paymentMethodId <", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidLessThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodId <=", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIn(List<Integer> values) {
            addCriterion("paymentMethodId in", values, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotIn(List<Integer> values) {
            addCriterion("paymentMethodId not in", values, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodId between", value1, value2, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodId not between", value1, value2, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidIsNull() {
            addCriterion("applyTransferFormId is null");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidIsNotNull() {
            addCriterion("applyTransferFormId is not null");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidEqualTo(Integer value) {
            addCriterion("applyTransferFormId =", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidNotEqualTo(Integer value) {
            addCriterion("applyTransferFormId <>", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidGreaterThan(Integer value) {
            addCriterion("applyTransferFormId >", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyTransferFormId >=", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidLessThan(Integer value) {
            addCriterion("applyTransferFormId <", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidLessThanOrEqualTo(Integer value) {
            addCriterion("applyTransferFormId <=", value, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidIn(List<Integer> values) {
            addCriterion("applyTransferFormId in", values, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidNotIn(List<Integer> values) {
            addCriterion("applyTransferFormId not in", values, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidBetween(Integer value1, Integer value2) {
            addCriterion("applyTransferFormId between", value1, value2, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andApplytransferformidNotBetween(Integer value1, Integer value2) {
            addCriterion("applyTransferFormId not between", value1, value2, "applytransferformid");
            return (Criteria) this;
        }

        public Criteria andDueIsNull() {
            addCriterion("due is null");
            return (Criteria) this;
        }

        public Criteria andDueIsNotNull() {
            addCriterion("due is not null");
            return (Criteria) this;
        }

        public Criteria andDueEqualTo(String value) {
            addCriterion("due =", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotEqualTo(String value) {
            addCriterion("due <>", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThan(String value) {
            addCriterion("due >", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThanOrEqualTo(String value) {
            addCriterion("due >=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThan(String value) {
            addCriterion("due <", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThanOrEqualTo(String value) {
            addCriterion("due <=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLike(String value) {
            addCriterion("due like", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotLike(String value) {
            addCriterion("due not like", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueIn(List<String> values) {
            addCriterion("due in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotIn(List<String> values) {
            addCriterion("due not in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueBetween(String value1, String value2) {
            addCriterion("due between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotBetween(String value1, String value2) {
            addCriterion("due not between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andExpressfeeIsNull() {
            addCriterion("expressFee is null");
            return (Criteria) this;
        }

        public Criteria andExpressfeeIsNotNull() {
            addCriterion("expressFee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressfeeEqualTo(String value) {
            addCriterion("expressFee =", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeNotEqualTo(String value) {
            addCriterion("expressFee <>", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeGreaterThan(String value) {
            addCriterion("expressFee >", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeGreaterThanOrEqualTo(String value) {
            addCriterion("expressFee >=", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeLessThan(String value) {
            addCriterion("expressFee <", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeLessThanOrEqualTo(String value) {
            addCriterion("expressFee <=", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeLike(String value) {
            addCriterion("expressFee like", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeNotLike(String value) {
            addCriterion("expressFee not like", value, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeIn(List<String> values) {
            addCriterion("expressFee in", values, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeNotIn(List<String> values) {
            addCriterion("expressFee not in", values, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeBetween(String value1, String value2) {
            addCriterion("expressFee between", value1, value2, "expressfee");
            return (Criteria) this;
        }

        public Criteria andExpressfeeNotBetween(String value1, String value2) {
            addCriterion("expressFee not between", value1, value2, "expressfee");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("orderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("orderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("orderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("orderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("orderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("orderTime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("orderTime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("orderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("orderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("orderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("orderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1IsNull() {
            addCriterion("orderStatus1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1IsNotNull() {
            addCriterion("orderStatus1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1EqualTo(String value) {
            addCriterion("orderStatus1 =", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1NotEqualTo(String value) {
            addCriterion("orderStatus1 <>", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1GreaterThan(String value) {
            addCriterion("orderStatus1 >", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1GreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus1 >=", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1LessThan(String value) {
            addCriterion("orderStatus1 <", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1LessThanOrEqualTo(String value) {
            addCriterion("orderStatus1 <=", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1Like(String value) {
            addCriterion("orderStatus1 like", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1NotLike(String value) {
            addCriterion("orderStatus1 not like", value, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1In(List<String> values) {
            addCriterion("orderStatus1 in", values, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1NotIn(List<String> values) {
            addCriterion("orderStatus1 not in", values, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1Between(String value1, String value2) {
            addCriterion("orderStatus1 between", value1, value2, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andOrderstatus1NotBetween(String value1, String value2) {
            addCriterion("orderStatus1 not between", value1, value2, "orderstatus1");
            return (Criteria) this;
        }

        public Criteria andBuyernoIsNull() {
            addCriterion("buyerNo is null");
            return (Criteria) this;
        }

        public Criteria andBuyernoIsNotNull() {
            addCriterion("buyerNo is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernoEqualTo(String value) {
            addCriterion("buyerNo =", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotEqualTo(String value) {
            addCriterion("buyerNo <>", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoGreaterThan(String value) {
            addCriterion("buyerNo >", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoGreaterThanOrEqualTo(String value) {
            addCriterion("buyerNo >=", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoLessThan(String value) {
            addCriterion("buyerNo <", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoLessThanOrEqualTo(String value) {
            addCriterion("buyerNo <=", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoLike(String value) {
            addCriterion("buyerNo like", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotLike(String value) {
            addCriterion("buyerNo not like", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoIn(List<String> values) {
            addCriterion("buyerNo in", values, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotIn(List<String> values) {
            addCriterion("buyerNo not in", values, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoBetween(String value1, String value2) {
            addCriterion("buyerNo between", value1, value2, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotBetween(String value1, String value2) {
            addCriterion("buyerNo not between", value1, value2, "buyerno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoIsNull() {
            addCriterion("consigneeNo is null");
            return (Criteria) this;
        }

        public Criteria andConsigneenoIsNotNull() {
            addCriterion("consigneeNo is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneenoEqualTo(String value) {
            addCriterion("consigneeNo =", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoNotEqualTo(String value) {
            addCriterion("consigneeNo <>", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoGreaterThan(String value) {
            addCriterion("consigneeNo >", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoGreaterThanOrEqualTo(String value) {
            addCriterion("consigneeNo >=", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoLessThan(String value) {
            addCriterion("consigneeNo <", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoLessThanOrEqualTo(String value) {
            addCriterion("consigneeNo <=", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoLike(String value) {
            addCriterion("consigneeNo like", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoNotLike(String value) {
            addCriterion("consigneeNo not like", value, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoIn(List<String> values) {
            addCriterion("consigneeNo in", values, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoNotIn(List<String> values) {
            addCriterion("consigneeNo not in", values, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoBetween(String value1, String value2) {
            addCriterion("consigneeNo between", value1, value2, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andConsigneenoNotBetween(String value1, String value2) {
            addCriterion("consigneeNo not between", value1, value2, "consigneeno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoIsNull() {
            addCriterion("deliveryMethodNo is null");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoIsNotNull() {
            addCriterion("deliveryMethodNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoEqualTo(String value) {
            addCriterion("deliveryMethodNo =", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoNotEqualTo(String value) {
            addCriterion("deliveryMethodNo <>", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoGreaterThan(String value) {
            addCriterion("deliveryMethodNo >", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryMethodNo >=", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoLessThan(String value) {
            addCriterion("deliveryMethodNo <", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoLessThanOrEqualTo(String value) {
            addCriterion("deliveryMethodNo <=", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoLike(String value) {
            addCriterion("deliveryMethodNo like", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoNotLike(String value) {
            addCriterion("deliveryMethodNo not like", value, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoIn(List<String> values) {
            addCriterion("deliveryMethodNo in", values, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoNotIn(List<String> values) {
            addCriterion("deliveryMethodNo not in", values, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoBetween(String value1, String value2) {
            addCriterion("deliveryMethodNo between", value1, value2, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andDeliverymethodnoNotBetween(String value1, String value2) {
            addCriterion("deliveryMethodNo not between", value1, value2, "deliverymethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoIsNull() {
            addCriterion("paymentMethodNo is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoIsNotNull() {
            addCriterion("paymentMethodNo is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoEqualTo(String value) {
            addCriterion("paymentMethodNo =", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoNotEqualTo(String value) {
            addCriterion("paymentMethodNo <>", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoGreaterThan(String value) {
            addCriterion("paymentMethodNo >", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethodNo >=", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoLessThan(String value) {
            addCriterion("paymentMethodNo <", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoLessThanOrEqualTo(String value) {
            addCriterion("paymentMethodNo <=", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoLike(String value) {
            addCriterion("paymentMethodNo like", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoNotLike(String value) {
            addCriterion("paymentMethodNo not like", value, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoIn(List<String> values) {
            addCriterion("paymentMethodNo in", values, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoNotIn(List<String> values) {
            addCriterion("paymentMethodNo not in", values, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoBetween(String value1, String value2) {
            addCriterion("paymentMethodNo between", value1, value2, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnoNotBetween(String value1, String value2) {
            addCriterion("paymentMethodNo not between", value1, value2, "paymentmethodno");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateIsNull() {
            addCriterion("expectDeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateIsNotNull() {
            addCriterion("expectDeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateEqualTo(String value) {
            addCriterion("expectDeliveryDate =", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateNotEqualTo(String value) {
            addCriterion("expectDeliveryDate <>", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateGreaterThan(String value) {
            addCriterion("expectDeliveryDate >", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateGreaterThanOrEqualTo(String value) {
            addCriterion("expectDeliveryDate >=", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateLessThan(String value) {
            addCriterion("expectDeliveryDate <", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateLessThanOrEqualTo(String value) {
            addCriterion("expectDeliveryDate <=", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateLike(String value) {
            addCriterion("expectDeliveryDate like", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateNotLike(String value) {
            addCriterion("expectDeliveryDate not like", value, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateIn(List<String> values) {
            addCriterion("expectDeliveryDate in", values, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateNotIn(List<String> values) {
            addCriterion("expectDeliveryDate not in", values, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateBetween(String value1, String value2) {
            addCriterion("expectDeliveryDate between", value1, value2, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andExpectdeliverydateNotBetween(String value1, String value2) {
            addCriterion("expectDeliveryDate not between", value1, value2, "expectdeliverydate");
            return (Criteria) this;
        }

        public Criteria andActualpaymentIsNull() {
            addCriterion("actualPayment is null");
            return (Criteria) this;
        }

        public Criteria andActualpaymentIsNotNull() {
            addCriterion("actualPayment is not null");
            return (Criteria) this;
        }

        public Criteria andActualpaymentEqualTo(String value) {
            addCriterion("actualPayment =", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentNotEqualTo(String value) {
            addCriterion("actualPayment <>", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentGreaterThan(String value) {
            addCriterion("actualPayment >", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("actualPayment >=", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentLessThan(String value) {
            addCriterion("actualPayment <", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentLessThanOrEqualTo(String value) {
            addCriterion("actualPayment <=", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentLike(String value) {
            addCriterion("actualPayment like", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentNotLike(String value) {
            addCriterion("actualPayment not like", value, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentIn(List<String> values) {
            addCriterion("actualPayment in", values, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentNotIn(List<String> values) {
            addCriterion("actualPayment not in", values, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentBetween(String value1, String value2) {
            addCriterion("actualPayment between", value1, value2, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentNotBetween(String value1, String value2) {
            addCriterion("actualPayment not between", value1, value2, "actualpayment");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalIsNull() {
            addCriterion("actualPaymentCapital is null");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalIsNotNull() {
            addCriterion("actualPaymentCapital is not null");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalEqualTo(String value) {
            addCriterion("actualPaymentCapital =", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalNotEqualTo(String value) {
            addCriterion("actualPaymentCapital <>", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalGreaterThan(String value) {
            addCriterion("actualPaymentCapital >", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("actualPaymentCapital >=", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalLessThan(String value) {
            addCriterion("actualPaymentCapital <", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalLessThanOrEqualTo(String value) {
            addCriterion("actualPaymentCapital <=", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalLike(String value) {
            addCriterion("actualPaymentCapital like", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalNotLike(String value) {
            addCriterion("actualPaymentCapital not like", value, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalIn(List<String> values) {
            addCriterion("actualPaymentCapital in", values, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalNotIn(List<String> values) {
            addCriterion("actualPaymentCapital not in", values, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalBetween(String value1, String value2) {
            addCriterion("actualPaymentCapital between", value1, value2, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andActualpaymentcapitalNotBetween(String value1, String value2) {
            addCriterion("actualPaymentCapital not between", value1, value2, "actualpaymentcapital");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNull() {
            addCriterion("paymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNotNull() {
            addCriterion("paymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeEqualTo(String value) {
            addCriterion("paymentTime =", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotEqualTo(String value) {
            addCriterion("paymentTime <>", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThan(String value) {
            addCriterion("paymentTime >", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("paymentTime >=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThan(String value) {
            addCriterion("paymentTime <", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThanOrEqualTo(String value) {
            addCriterion("paymentTime <=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLike(String value) {
            addCriterion("paymentTime like", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotLike(String value) {
            addCriterion("paymentTime not like", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIn(List<String> values) {
            addCriterion("paymentTime in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotIn(List<String> values) {
            addCriterion("paymentTime not in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeBetween(String value1, String value2) {
            addCriterion("paymentTime between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotBetween(String value1, String value2) {
            addCriterion("paymentTime not between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andFormtimeIsNull() {
            addCriterion("formTime is null");
            return (Criteria) this;
        }

        public Criteria andFormtimeIsNotNull() {
            addCriterion("formTime is not null");
            return (Criteria) this;
        }

        public Criteria andFormtimeEqualTo(String value) {
            addCriterion("formTime =", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeNotEqualTo(String value) {
            addCriterion("formTime <>", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeGreaterThan(String value) {
            addCriterion("formTime >", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeGreaterThanOrEqualTo(String value) {
            addCriterion("formTime >=", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeLessThan(String value) {
            addCriterion("formTime <", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeLessThanOrEqualTo(String value) {
            addCriterion("formTime <=", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeLike(String value) {
            addCriterion("formTime like", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeNotLike(String value) {
            addCriterion("formTime not like", value, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeIn(List<String> values) {
            addCriterion("formTime in", values, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeNotIn(List<String> values) {
            addCriterion("formTime not in", values, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeBetween(String value1, String value2) {
            addCriterion("formTime between", value1, value2, "formtime");
            return (Criteria) this;
        }

        public Criteria andFormtimeNotBetween(String value1, String value2) {
            addCriterion("formTime not between", value1, value2, "formtime");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2IsNull() {
            addCriterion("orderStatus2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2IsNotNull() {
            addCriterion("orderStatus2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2EqualTo(String value) {
            addCriterion("orderStatus2 =", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2NotEqualTo(String value) {
            addCriterion("orderStatus2 <>", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2GreaterThan(String value) {
            addCriterion("orderStatus2 >", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2GreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus2 >=", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2LessThan(String value) {
            addCriterion("orderStatus2 <", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2LessThanOrEqualTo(String value) {
            addCriterion("orderStatus2 <=", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2Like(String value) {
            addCriterion("orderStatus2 like", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2NotLike(String value) {
            addCriterion("orderStatus2 not like", value, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2In(List<String> values) {
            addCriterion("orderStatus2 in", values, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2NotIn(List<String> values) {
            addCriterion("orderStatus2 not in", values, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2Between(String value1, String value2) {
            addCriterion("orderStatus2 between", value1, value2, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andOrderstatus2NotBetween(String value1, String value2) {
            addCriterion("orderStatus2 not between", value1, value2, "orderstatus2");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("Notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("Notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("Notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("Notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("Notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("Notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("Notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("Notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("Notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("Notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("Notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("Notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("Notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("Notes not between", value1, value2, "notes");
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