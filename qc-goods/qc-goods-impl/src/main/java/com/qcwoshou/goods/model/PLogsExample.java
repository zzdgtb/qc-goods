package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PLogsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLogsLevelIsNull() {
            addCriterion("logs_level is null");
            return (Criteria) this;
        }

        public Criteria andLogsLevelIsNotNull() {
            addCriterion("logs_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogsLevelEqualTo(Byte value) {
            addCriterion("logs_level =", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelNotEqualTo(Byte value) {
            addCriterion("logs_level <>", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelGreaterThan(Byte value) {
            addCriterion("logs_level >", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("logs_level >=", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelLessThan(Byte value) {
            addCriterion("logs_level <", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelLessThanOrEqualTo(Byte value) {
            addCriterion("logs_level <=", value, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelIn(List<Byte> values) {
            addCriterion("logs_level in", values, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelNotIn(List<Byte> values) {
            addCriterion("logs_level not in", values, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelBetween(Byte value1, Byte value2) {
            addCriterion("logs_level between", value1, value2, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andLogsLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("logs_level not between", value1, value2, "logsLevel");
            return (Criteria) this;
        }

        public Criteria andSystemSourceIsNull() {
            addCriterion("system_source is null");
            return (Criteria) this;
        }

        public Criteria andSystemSourceIsNotNull() {
            addCriterion("system_source is not null");
            return (Criteria) this;
        }

        public Criteria andSystemSourceEqualTo(Byte value) {
            addCriterion("system_source =", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceNotEqualTo(Byte value) {
            addCriterion("system_source <>", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceGreaterThan(Byte value) {
            addCriterion("system_source >", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("system_source >=", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceLessThan(Byte value) {
            addCriterion("system_source <", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceLessThanOrEqualTo(Byte value) {
            addCriterion("system_source <=", value, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceIn(List<Byte> values) {
            addCriterion("system_source in", values, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceNotIn(List<Byte> values) {
            addCriterion("system_source not in", values, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceBetween(Byte value1, Byte value2) {
            addCriterion("system_source between", value1, value2, "systemSource");
            return (Criteria) this;
        }

        public Criteria andSystemSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("system_source not between", value1, value2, "systemSource");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNull() {
            addCriterion("elapsed_time is null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIsNotNull() {
            addCriterion("elapsed_time is not null");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeEqualTo(String value) {
            addCriterion("elapsed_time =", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotEqualTo(String value) {
            addCriterion("elapsed_time <>", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThan(String value) {
            addCriterion("elapsed_time >", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("elapsed_time >=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThan(String value) {
            addCriterion("elapsed_time <", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLessThanOrEqualTo(String value) {
            addCriterion("elapsed_time <=", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeLike(String value) {
            addCriterion("elapsed_time like", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotLike(String value) {
            addCriterion("elapsed_time not like", value, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeIn(List<String> values) {
            addCriterion("elapsed_time in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotIn(List<String> values) {
            addCriterion("elapsed_time not in", values, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeBetween(String value1, String value2) {
            addCriterion("elapsed_time between", value1, value2, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andElapsedTimeNotBetween(String value1, String value2) {
            addCriterion("elapsed_time not between", value1, value2, "elapsedTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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