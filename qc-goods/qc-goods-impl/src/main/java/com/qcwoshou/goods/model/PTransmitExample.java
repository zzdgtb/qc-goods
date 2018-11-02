package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PTransmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PTransmitExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeIsNull() {
            addCriterion("transmit_code is null");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeIsNotNull() {
            addCriterion("transmit_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeEqualTo(String value) {
            addCriterion("transmit_code =", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeNotEqualTo(String value) {
            addCriterion("transmit_code <>", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeGreaterThan(String value) {
            addCriterion("transmit_code >", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("transmit_code >=", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeLessThan(String value) {
            addCriterion("transmit_code <", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeLessThanOrEqualTo(String value) {
            addCriterion("transmit_code <=", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeLike(String value) {
            addCriterion("transmit_code like", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeNotLike(String value) {
            addCriterion("transmit_code not like", value, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeIn(List<String> values) {
            addCriterion("transmit_code in", values, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeNotIn(List<String> values) {
            addCriterion("transmit_code not in", values, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeBetween(String value1, String value2) {
            addCriterion("transmit_code between", value1, value2, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitCodeNotBetween(String value1, String value2) {
            addCriterion("transmit_code not between", value1, value2, "transmitCode");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeIsNull() {
            addCriterion("transmit_type is null");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeIsNotNull() {
            addCriterion("transmit_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeEqualTo(Byte value) {
            addCriterion("transmit_type =", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeNotEqualTo(Byte value) {
            addCriterion("transmit_type <>", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeGreaterThan(Byte value) {
            addCriterion("transmit_type >", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("transmit_type >=", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeLessThan(Byte value) {
            addCriterion("transmit_type <", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeLessThanOrEqualTo(Byte value) {
            addCriterion("transmit_type <=", value, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeIn(List<Byte> values) {
            addCriterion("transmit_type in", values, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeNotIn(List<Byte> values) {
            addCriterion("transmit_type not in", values, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeBetween(Byte value1, Byte value2) {
            addCriterion("transmit_type between", value1, value2, "transmitType");
            return (Criteria) this;
        }

        public Criteria andTransmitTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("transmit_type not between", value1, value2, "transmitType");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(Integer value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(Integer value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(Integer value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(Integer value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(Integer value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(Integer value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<Integer> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<Integer> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(Integer value1, Integer value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(Integer value1, Integer value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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