package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImGroupExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIsNull() {
            addCriterion("group_code is null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIsNotNull() {
            addCriterion("group_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeEqualTo(String value) {
            addCriterion("group_code =", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotEqualTo(String value) {
            addCriterion("group_code <>", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThan(String value) {
            addCriterion("group_code >", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("group_code >=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThan(String value) {
            addCriterion("group_code <", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("group_code <=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLike(String value) {
            addCriterion("group_code like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotLike(String value) {
            addCriterion("group_code not like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIn(List<String> values) {
            addCriterion("group_code in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotIn(List<String> values) {
            addCriterion("group_code not in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeBetween(String value1, String value2) {
            addCriterion("group_code between", value1, value2, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotBetween(String value1, String value2) {
            addCriterion("group_code not between", value1, value2, "groupCode");
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

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
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

        public Criteria andOwnerAccountIsNull() {
            addCriterion("owner_account is null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIsNotNull() {
            addCriterion("owner_account is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountEqualTo(String value) {
            addCriterion("owner_account =", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountNotEqualTo(String value) {
            addCriterion("owner_account <>", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountGreaterThan(String value) {
            addCriterion("owner_account >", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("owner_account >=", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountLessThan(String value) {
            addCriterion("owner_account <", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountLessThanOrEqualTo(String value) {
            addCriterion("owner_account <=", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountLike(String value) {
            addCriterion("owner_account like", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountNotLike(String value) {
            addCriterion("owner_account not like", value, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIn(List<String> values) {
            addCriterion("owner_account in", values, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountNotIn(List<String> values) {
            addCriterion("owner_account not in", values, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountBetween(String value1, String value2) {
            addCriterion("owner_account between", value1, value2, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountNotBetween(String value1, String value2) {
            addCriterion("owner_account not between", value1, value2, "ownerAccount");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdIsNull() {
            addCriterion("owner_account_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdIsNotNull() {
            addCriterion("owner_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdEqualTo(Integer value) {
            addCriterion("owner_account_id =", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdNotEqualTo(Integer value) {
            addCriterion("owner_account_id <>", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdGreaterThan(Integer value) {
            addCriterion("owner_account_id >", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_account_id >=", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdLessThan(Integer value) {
            addCriterion("owner_account_id <", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_account_id <=", value, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdIn(List<Integer> values) {
            addCriterion("owner_account_id in", values, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdNotIn(List<Integer> values) {
            addCriterion("owner_account_id not in", values, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_account_id between", value1, value2, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andOwnerAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_account_id not between", value1, value2, "ownerAccountId");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthIsNull() {
            addCriterion("is_need_auth is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthIsNotNull() {
            addCriterion("is_need_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthEqualTo(Boolean value) {
            addCriterion("is_need_auth =", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthNotEqualTo(Boolean value) {
            addCriterion("is_need_auth <>", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthGreaterThan(Boolean value) {
            addCriterion("is_need_auth >", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_need_auth >=", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthLessThan(Boolean value) {
            addCriterion("is_need_auth <", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthLessThanOrEqualTo(Boolean value) {
            addCriterion("is_need_auth <=", value, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthIn(List<Boolean> values) {
            addCriterion("is_need_auth in", values, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthNotIn(List<Boolean> values) {
            addCriterion("is_need_auth not in", values, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need_auth between", value1, value2, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andIsNeedAuthNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need_auth not between", value1, value2, "isNeedAuth");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Short value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Short value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Short value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Short value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Short value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Short> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Short> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Short value1, Short value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Short value1, Short value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
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