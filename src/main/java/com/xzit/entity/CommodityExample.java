package com.xzit.entity;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCommoditynoIsNull() {
            addCriterion("commodityNo is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynoIsNotNull() {
            addCriterion("commodityNo is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynoEqualTo(String value) {
            addCriterion("commodityNo =", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoNotEqualTo(String value) {
            addCriterion("commodityNo <>", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoGreaterThan(String value) {
            addCriterion("commodityNo >", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoGreaterThanOrEqualTo(String value) {
            addCriterion("commodityNo >=", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoLessThan(String value) {
            addCriterion("commodityNo <", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoLessThanOrEqualTo(String value) {
            addCriterion("commodityNo <=", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoLike(String value) {
            addCriterion("commodityNo like", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoNotLike(String value) {
            addCriterion("commodityNo not like", value, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoIn(List<String> values) {
            addCriterion("commodityNo in", values, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoNotIn(List<String> values) {
            addCriterion("commodityNo not in", values, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoBetween(String value1, String value2) {
            addCriterion("commodityNo between", value1, value2, "commodityno");
            return (Criteria) this;
        }

        public Criteria andCommoditynoNotBetween(String value1, String value2) {
            addCriterion("commodityNo not between", value1, value2, "commodityno");
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

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
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