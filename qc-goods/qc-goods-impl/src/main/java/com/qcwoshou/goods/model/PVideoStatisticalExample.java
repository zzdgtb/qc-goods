package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.List;

public class PVideoStatisticalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PVideoStatisticalExample() {
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

        public Criteria andSkuNumberIsNull() {
            addCriterion("sku_number is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumberIsNotNull() {
            addCriterion("sku_number is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumberEqualTo(String value) {
            addCriterion("sku_number =", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberNotEqualTo(String value) {
            addCriterion("sku_number <>", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberGreaterThan(String value) {
            addCriterion("sku_number >", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sku_number >=", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberLessThan(String value) {
            addCriterion("sku_number <", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberLessThanOrEqualTo(String value) {
            addCriterion("sku_number <=", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberLike(String value) {
            addCriterion("sku_number like", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberNotLike(String value) {
            addCriterion("sku_number not like", value, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberIn(List<String> values) {
            addCriterion("sku_number in", values, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberNotIn(List<String> values) {
            addCriterion("sku_number not in", values, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberBetween(String value1, String value2) {
            addCriterion("sku_number between", value1, value2, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andSkuNumberNotBetween(String value1, String value2) {
            addCriterion("sku_number not between", value1, value2, "skuNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNull() {
            addCriterion("buy_count is null");
            return (Criteria) this;
        }

        public Criteria andBuyCountIsNotNull() {
            addCriterion("buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCountEqualTo(Integer value) {
            addCriterion("buy_count =", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotEqualTo(Integer value) {
            addCriterion("buy_count <>", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThan(Integer value) {
            addCriterion("buy_count >", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_count >=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThan(Integer value) {
            addCriterion("buy_count <", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("buy_count <=", value, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountIn(List<Integer> values) {
            addCriterion("buy_count in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotIn(List<Integer> values) {
            addCriterion("buy_count not in", values, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("buy_count between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_count not between", value1, value2, "buyCount");
            return (Criteria) this;
        }

        public Criteria andDpCountIsNull() {
            addCriterion("dp_count is null");
            return (Criteria) this;
        }

        public Criteria andDpCountIsNotNull() {
            addCriterion("dp_count is not null");
            return (Criteria) this;
        }

        public Criteria andDpCountEqualTo(Integer value) {
            addCriterion("dp_count =", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountNotEqualTo(Integer value) {
            addCriterion("dp_count <>", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountGreaterThan(Integer value) {
            addCriterion("dp_count >", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count >=", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountLessThan(Integer value) {
            addCriterion("dp_count <", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountLessThanOrEqualTo(Integer value) {
            addCriterion("dp_count <=", value, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountIn(List<Integer> values) {
            addCriterion("dp_count in", values, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountNotIn(List<Integer> values) {
            addCriterion("dp_count not in", values, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountBetween(Integer value1, Integer value2) {
            addCriterion("dp_count between", value1, value2, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count not between", value1, value2, "dpCount");
            return (Criteria) this;
        }

        public Criteria andDpCount1IsNull() {
            addCriterion("dp_count_1 is null");
            return (Criteria) this;
        }

        public Criteria andDpCount1IsNotNull() {
            addCriterion("dp_count_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDpCount1EqualTo(Integer value) {
            addCriterion("dp_count_1 =", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1NotEqualTo(Integer value) {
            addCriterion("dp_count_1 <>", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1GreaterThan(Integer value) {
            addCriterion("dp_count_1 >", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count_1 >=", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1LessThan(Integer value) {
            addCriterion("dp_count_1 <", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1LessThanOrEqualTo(Integer value) {
            addCriterion("dp_count_1 <=", value, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1In(List<Integer> values) {
            addCriterion("dp_count_1 in", values, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1NotIn(List<Integer> values) {
            addCriterion("dp_count_1 not in", values, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1Between(Integer value1, Integer value2) {
            addCriterion("dp_count_1 between", value1, value2, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount1NotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count_1 not between", value1, value2, "dpCount1");
            return (Criteria) this;
        }

        public Criteria andDpCount2IsNull() {
            addCriterion("dp_count_2 is null");
            return (Criteria) this;
        }

        public Criteria andDpCount2IsNotNull() {
            addCriterion("dp_count_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDpCount2EqualTo(Integer value) {
            addCriterion("dp_count_2 =", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2NotEqualTo(Integer value) {
            addCriterion("dp_count_2 <>", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2GreaterThan(Integer value) {
            addCriterion("dp_count_2 >", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count_2 >=", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2LessThan(Integer value) {
            addCriterion("dp_count_2 <", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2LessThanOrEqualTo(Integer value) {
            addCriterion("dp_count_2 <=", value, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2In(List<Integer> values) {
            addCriterion("dp_count_2 in", values, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2NotIn(List<Integer> values) {
            addCriterion("dp_count_2 not in", values, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2Between(Integer value1, Integer value2) {
            addCriterion("dp_count_2 between", value1, value2, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount2NotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count_2 not between", value1, value2, "dpCount2");
            return (Criteria) this;
        }

        public Criteria andDpCount3IsNull() {
            addCriterion("dp_count_3 is null");
            return (Criteria) this;
        }

        public Criteria andDpCount3IsNotNull() {
            addCriterion("dp_count_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDpCount3EqualTo(Integer value) {
            addCriterion("dp_count_3 =", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3NotEqualTo(Integer value) {
            addCriterion("dp_count_3 <>", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3GreaterThan(Integer value) {
            addCriterion("dp_count_3 >", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count_3 >=", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3LessThan(Integer value) {
            addCriterion("dp_count_3 <", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3LessThanOrEqualTo(Integer value) {
            addCriterion("dp_count_3 <=", value, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3In(List<Integer> values) {
            addCriterion("dp_count_3 in", values, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3NotIn(List<Integer> values) {
            addCriterion("dp_count_3 not in", values, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3Between(Integer value1, Integer value2) {
            addCriterion("dp_count_3 between", value1, value2, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount3NotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count_3 not between", value1, value2, "dpCount3");
            return (Criteria) this;
        }

        public Criteria andDpCount4IsNull() {
            addCriterion("dp_count_4 is null");
            return (Criteria) this;
        }

        public Criteria andDpCount4IsNotNull() {
            addCriterion("dp_count_4 is not null");
            return (Criteria) this;
        }

        public Criteria andDpCount4EqualTo(Integer value) {
            addCriterion("dp_count_4 =", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4NotEqualTo(Integer value) {
            addCriterion("dp_count_4 <>", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4GreaterThan(Integer value) {
            addCriterion("dp_count_4 >", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4GreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count_4 >=", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4LessThan(Integer value) {
            addCriterion("dp_count_4 <", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4LessThanOrEqualTo(Integer value) {
            addCriterion("dp_count_4 <=", value, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4In(List<Integer> values) {
            addCriterion("dp_count_4 in", values, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4NotIn(List<Integer> values) {
            addCriterion("dp_count_4 not in", values, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4Between(Integer value1, Integer value2) {
            addCriterion("dp_count_4 between", value1, value2, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount4NotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count_4 not between", value1, value2, "dpCount4");
            return (Criteria) this;
        }

        public Criteria andDpCount5IsNull() {
            addCriterion("dp_count_5 is null");
            return (Criteria) this;
        }

        public Criteria andDpCount5IsNotNull() {
            addCriterion("dp_count_5 is not null");
            return (Criteria) this;
        }

        public Criteria andDpCount5EqualTo(Integer value) {
            addCriterion("dp_count_5 =", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5NotEqualTo(Integer value) {
            addCriterion("dp_count_5 <>", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5GreaterThan(Integer value) {
            addCriterion("dp_count_5 >", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5GreaterThanOrEqualTo(Integer value) {
            addCriterion("dp_count_5 >=", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5LessThan(Integer value) {
            addCriterion("dp_count_5 <", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5LessThanOrEqualTo(Integer value) {
            addCriterion("dp_count_5 <=", value, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5In(List<Integer> values) {
            addCriterion("dp_count_5 in", values, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5NotIn(List<Integer> values) {
            addCriterion("dp_count_5 not in", values, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5Between(Integer value1, Integer value2) {
            addCriterion("dp_count_5 between", value1, value2, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andDpCount5NotBetween(Integer value1, Integer value2) {
            addCriterion("dp_count_5 not between", value1, value2, "dpCount5");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
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