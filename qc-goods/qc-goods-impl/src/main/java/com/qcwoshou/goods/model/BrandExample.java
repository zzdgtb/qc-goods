package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoIsNull() {
            addCriterion("brand_promote_logo is null");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoIsNotNull() {
            addCriterion("brand_promote_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoEqualTo(String value) {
            addCriterion("brand_promote_logo =", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoNotEqualTo(String value) {
            addCriterion("brand_promote_logo <>", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoGreaterThan(String value) {
            addCriterion("brand_promote_logo >", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoGreaterThanOrEqualTo(String value) {
            addCriterion("brand_promote_logo >=", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoLessThan(String value) {
            addCriterion("brand_promote_logo <", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoLessThanOrEqualTo(String value) {
            addCriterion("brand_promote_logo <=", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoLike(String value) {
            addCriterion("brand_promote_logo like", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoNotLike(String value) {
            addCriterion("brand_promote_logo not like", value, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoIn(List<String> values) {
            addCriterion("brand_promote_logo in", values, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoNotIn(List<String> values) {
            addCriterion("brand_promote_logo not in", values, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoBetween(String value1, String value2) {
            addCriterion("brand_promote_logo between", value1, value2, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLogoNotBetween(String value1, String value2) {
            addCriterion("brand_promote_logo not between", value1, value2, "brandPromoteLogo");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andShopCateIdIsNull() {
            addCriterion("shop_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCateIdIsNotNull() {
            addCriterion("shop_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCateIdEqualTo(Integer value) {
            addCriterion("shop_cate_id =", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdNotEqualTo(Integer value) {
            addCriterion("shop_cate_id <>", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdGreaterThan(Integer value) {
            addCriterion("shop_cate_id >", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_cate_id >=", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdLessThan(Integer value) {
            addCriterion("shop_cate_id <", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_cate_id <=", value, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdIn(List<Integer> values) {
            addCriterion("shop_cate_id in", values, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdNotIn(List<Integer> values) {
            addCriterion("shop_cate_id not in", values, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_cate_id between", value1, value2, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andShopCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_cate_id not between", value1, value2, "shopCateId");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteIsNull() {
            addCriterion("brand_promote is null");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteIsNotNull() {
            addCriterion("brand_promote is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteEqualTo(Boolean value) {
            addCriterion("brand_promote =", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteNotEqualTo(Boolean value) {
            addCriterion("brand_promote <>", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteGreaterThan(Boolean value) {
            addCriterion("brand_promote >", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("brand_promote >=", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLessThan(Boolean value) {
            addCriterion("brand_promote <", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteLessThanOrEqualTo(Boolean value) {
            addCriterion("brand_promote <=", value, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteIn(List<Boolean> values) {
            addCriterion("brand_promote in", values, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteNotIn(List<Boolean> values) {
            addCriterion("brand_promote not in", values, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteBetween(Boolean value1, Boolean value2) {
            addCriterion("brand_promote between", value1, value2, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBrandPromoteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("brand_promote not between", value1, value2, "brandPromote");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Integer value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Integer value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Integer value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Integer value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Integer> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Integer> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Integer value1, Integer value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTimeStatusIsNull() {
            addCriterion("time_status is null");
            return (Criteria) this;
        }

        public Criteria andTimeStatusIsNotNull() {
            addCriterion("time_status is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStatusEqualTo(Boolean value) {
            addCriterion("time_status =", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusNotEqualTo(Boolean value) {
            addCriterion("time_status <>", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusGreaterThan(Boolean value) {
            addCriterion("time_status >", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("time_status >=", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusLessThan(Boolean value) {
            addCriterion("time_status <", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("time_status <=", value, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusIn(List<Boolean> values) {
            addCriterion("time_status in", values, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusNotIn(List<Boolean> values) {
            addCriterion("time_status not in", values, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("time_status between", value1, value2, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andTimeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("time_status not between", value1, value2, "timeStatus");
            return (Criteria) this;
        }

        public Criteria andDyCountIsNull() {
            addCriterion("dy_count is null");
            return (Criteria) this;
        }

        public Criteria andDyCountIsNotNull() {
            addCriterion("dy_count is not null");
            return (Criteria) this;
        }

        public Criteria andDyCountEqualTo(Integer value) {
            addCriterion("dy_count =", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountNotEqualTo(Integer value) {
            addCriterion("dy_count <>", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountGreaterThan(Integer value) {
            addCriterion("dy_count >", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dy_count >=", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountLessThan(Integer value) {
            addCriterion("dy_count <", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountLessThanOrEqualTo(Integer value) {
            addCriterion("dy_count <=", value, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountIn(List<Integer> values) {
            addCriterion("dy_count in", values, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountNotIn(List<Integer> values) {
            addCriterion("dy_count not in", values, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountBetween(Integer value1, Integer value2) {
            addCriterion("dy_count between", value1, value2, "dyCount");
            return (Criteria) this;
        }

        public Criteria andDyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dy_count not between", value1, value2, "dyCount");
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

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(Integer value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(Integer value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(Integer value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(Integer value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<Integer> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<Integer> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(Integer value1, Integer value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_id not between", value1, value2, "useId");
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