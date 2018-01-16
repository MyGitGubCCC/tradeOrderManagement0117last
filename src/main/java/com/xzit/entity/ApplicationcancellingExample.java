package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class ApplicationcancellingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationcancellingExample() {
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

        public Criteria andApplicationcancellingidIsNull() {
            addCriterion("applicationCancellingId is null");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidIsNotNull() {
            addCriterion("applicationCancellingId is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidEqualTo(Integer value) {
            addCriterion("applicationCancellingId =", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidNotEqualTo(Integer value) {
            addCriterion("applicationCancellingId <>", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidGreaterThan(Integer value) {
            addCriterion("applicationCancellingId >", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicationCancellingId >=", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidLessThan(Integer value) {
            addCriterion("applicationCancellingId <", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidLessThanOrEqualTo(Integer value) {
            addCriterion("applicationCancellingId <=", value, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidIn(List<Integer> values) {
            addCriterion("applicationCancellingId in", values, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidNotIn(List<Integer> values) {
            addCriterion("applicationCancellingId not in", values, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidBetween(Integer value1, Integer value2) {
            addCriterion("applicationCancellingId between", value1, value2, "applicationcancellingid");
            return (Criteria) this;
        }

        public Criteria andApplicationcancellingidNotBetween(Integer value1, Integer value2) {
            addCriterion("applicationCancellingId not between", value1, value2, "applicationcancellingid");
            return (Criteria) this;
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberIsNull() {
            addCriterion("changeSequenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberIsNotNull() {
            addCriterion("changeSequenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberEqualTo(String value) {
            addCriterion("changeSequenceNumber =", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberNotEqualTo(String value) {
            addCriterion("changeSequenceNumber <>", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberGreaterThan(String value) {
            addCriterion("changeSequenceNumber >", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberGreaterThanOrEqualTo(String value) {
            addCriterion("changeSequenceNumber >=", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberLessThan(String value) {
            addCriterion("changeSequenceNumber <", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberLessThanOrEqualTo(String value) {
            addCriterion("changeSequenceNumber <=", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberLike(String value) {
            addCriterion("changeSequenceNumber like", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberNotLike(String value) {
            addCriterion("changeSequenceNumber not like", value, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberIn(List<String> values) {
            addCriterion("changeSequenceNumber in", values, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberNotIn(List<String> values) {
            addCriterion("changeSequenceNumber not in", values, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberBetween(String value1, String value2) {
            addCriterion("changeSequenceNumber between", value1, value2, "changesequencenumber");
            return (Criteria) this;
        }

        public Criteria andChangesequencenumberNotBetween(String value1, String value2) {
            addCriterion("changeSequenceNumber not between", value1, value2, "changesequencenumber");
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