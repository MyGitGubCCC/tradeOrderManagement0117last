package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class ApplytransferformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplytransferformExample() {
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

        public Criteria andTransfertimeIsNull() {
            addCriterion("transferTime is null");
            return (Criteria) this;
        }

        public Criteria andTransfertimeIsNotNull() {
            addCriterion("transferTime is not null");
            return (Criteria) this;
        }

        public Criteria andTransfertimeEqualTo(String value) {
            addCriterion("transferTime =", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotEqualTo(String value) {
            addCriterion("transferTime <>", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeGreaterThan(String value) {
            addCriterion("transferTime >", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeGreaterThanOrEqualTo(String value) {
            addCriterion("transferTime >=", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLessThan(String value) {
            addCriterion("transferTime <", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLessThanOrEqualTo(String value) {
            addCriterion("transferTime <=", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLike(String value) {
            addCriterion("transferTime like", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotLike(String value) {
            addCriterion("transferTime not like", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeIn(List<String> values) {
            addCriterion("transferTime in", values, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotIn(List<String> values) {
            addCriterion("transferTime not in", values, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeBetween(String value1, String value2) {
            addCriterion("transferTime between", value1, value2, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotBetween(String value1, String value2) {
            addCriterion("transferTime not between", value1, value2, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfermanidIsNull() {
            addCriterion("transfermanId is null");
            return (Criteria) this;
        }

        public Criteria andTransfermanidIsNotNull() {
            addCriterion("transfermanId is not null");
            return (Criteria) this;
        }

        public Criteria andTransfermanidEqualTo(Integer value) {
            addCriterion("transfermanId =", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidNotEqualTo(Integer value) {
            addCriterion("transfermanId <>", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidGreaterThan(Integer value) {
            addCriterion("transfermanId >", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfermanId >=", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidLessThan(Integer value) {
            addCriterion("transfermanId <", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidLessThanOrEqualTo(Integer value) {
            addCriterion("transfermanId <=", value, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidIn(List<Integer> values) {
            addCriterion("transfermanId in", values, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidNotIn(List<Integer> values) {
            addCriterion("transfermanId not in", values, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidBetween(Integer value1, Integer value2) {
            addCriterion("transfermanId between", value1, value2, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andTransfermanidNotBetween(Integer value1, Integer value2) {
            addCriterion("transfermanId not between", value1, value2, "transfermanid");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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