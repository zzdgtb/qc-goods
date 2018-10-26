package com.qcwoshou.goods.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSkuExample() {
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

        public Criteria andModelNumberIsNull() {
            addCriterion("model_number is null");
            return (Criteria) this;
        }

        public Criteria andModelNumberIsNotNull() {
            addCriterion("model_number is not null");
            return (Criteria) this;
        }

        public Criteria andModelNumberEqualTo(String value) {
            addCriterion("model_number =", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotEqualTo(String value) {
            addCriterion("model_number <>", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThan(String value) {
            addCriterion("model_number >", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("model_number >=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThan(String value) {
            addCriterion("model_number <", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThanOrEqualTo(String value) {
            addCriterion("model_number <=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLike(String value) {
            addCriterion("model_number like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotLike(String value) {
            addCriterion("model_number not like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberIn(List<String> values) {
            addCriterion("model_number in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotIn(List<String> values) {
            addCriterion("model_number not in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberBetween(String value1, String value2) {
            addCriterion("model_number between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotBetween(String value1, String value2) {
            addCriterion("model_number not between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIsNull() {
            addCriterion("sku_title is null");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIsNotNull() {
            addCriterion("sku_title is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTitleEqualTo(String value) {
            addCriterion("sku_title =", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotEqualTo(String value) {
            addCriterion("sku_title <>", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleGreaterThan(String value) {
            addCriterion("sku_title >", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sku_title >=", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLessThan(String value) {
            addCriterion("sku_title <", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLessThanOrEqualTo(String value) {
            addCriterion("sku_title <=", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLike(String value) {
            addCriterion("sku_title like", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotLike(String value) {
            addCriterion("sku_title not like", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIn(List<String> values) {
            addCriterion("sku_title in", values, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotIn(List<String> values) {
            addCriterion("sku_title not in", values, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleBetween(String value1, String value2) {
            addCriterion("sku_title between", value1, value2, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotBetween(String value1, String value2) {
            addCriterion("sku_title not between", value1, value2, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtIsNull() {
            addCriterion("max_bought is null");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtIsNotNull() {
            addCriterion("max_bought is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtEqualTo(Integer value) {
            addCriterion("max_bought =", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtNotEqualTo(Integer value) {
            addCriterion("max_bought <>", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtGreaterThan(Integer value) {
            addCriterion("max_bought >", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_bought >=", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtLessThan(Integer value) {
            addCriterion("max_bought <", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtLessThanOrEqualTo(Integer value) {
            addCriterion("max_bought <=", value, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtIn(List<Integer> values) {
            addCriterion("max_bought in", values, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtNotIn(List<Integer> values) {
            addCriterion("max_bought not in", values, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtBetween(Integer value1, Integer value2) {
            addCriterion("max_bought between", value1, value2, "maxBought");
            return (Criteria) this;
        }

        public Criteria andMaxBoughtNotBetween(Integer value1, Integer value2) {
            addCriterion("max_bought not between", value1, value2, "maxBought");
            return (Criteria) this;
        }

        public Criteria andBoughtIsNull() {
            addCriterion("bought is null");
            return (Criteria) this;
        }

        public Criteria andBoughtIsNotNull() {
            addCriterion("bought is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtEqualTo(Integer value) {
            addCriterion("bought =", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtNotEqualTo(Integer value) {
            addCriterion("bought <>", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtGreaterThan(Integer value) {
            addCriterion("bought >", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtGreaterThanOrEqualTo(Integer value) {
            addCriterion("bought >=", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtLessThan(Integer value) {
            addCriterion("bought <", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtLessThanOrEqualTo(Integer value) {
            addCriterion("bought <=", value, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtIn(List<Integer> values) {
            addCriterion("bought in", values, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtNotIn(List<Integer> values) {
            addCriterion("bought not in", values, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtBetween(Integer value1, Integer value2) {
            addCriterion("bought between", value1, value2, "bought");
            return (Criteria) this;
        }

        public Criteria andBoughtNotBetween(Integer value1, Integer value2) {
            addCriterion("bought not between", value1, value2, "bought");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNull() {
            addCriterion("sku_img is null");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNotNull() {
            addCriterion("sku_img is not null");
            return (Criteria) this;
        }

        public Criteria andSkuImgEqualTo(String value) {
            addCriterion("sku_img =", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotEqualTo(String value) {
            addCriterion("sku_img <>", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThan(String value) {
            addCriterion("sku_img >", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThanOrEqualTo(String value) {
            addCriterion("sku_img >=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThan(String value) {
            addCriterion("sku_img <", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThanOrEqualTo(String value) {
            addCriterion("sku_img <=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLike(String value) {
            addCriterion("sku_img like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotLike(String value) {
            addCriterion("sku_img not like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgIn(List<String> values) {
            addCriterion("sku_img in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotIn(List<String> values) {
            addCriterion("sku_img not in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgBetween(String value1, String value2) {
            addCriterion("sku_img between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotBetween(String value1, String value2) {
            addCriterion("sku_img not between", value1, value2, "skuImg");
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

        public Criteria andSortEqualTo(Byte value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Byte value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Byte value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Byte value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Byte value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Byte> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Byte> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Byte value1, Byte value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Byte value1, Byte value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNull() {
            addCriterion("origin_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNotNull() {
            addCriterion("origin_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceEqualTo(BigDecimal value) {
            addCriterion("origin_price =", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotEqualTo(BigDecimal value) {
            addCriterion("origin_price <>", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThan(BigDecimal value) {
            addCriterion("origin_price >", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_price >=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThan(BigDecimal value) {
            addCriterion("origin_price <", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_price <=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIn(List<BigDecimal> values) {
            addCriterion("origin_price in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotIn(List<BigDecimal> values) {
            addCriterion("origin_price not in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_price between", value1, value2, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_price not between", value1, value2, "originPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNull() {
            addCriterion("current_price is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNotNull() {
            addCriterion("current_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceEqualTo(BigDecimal value) {
            addCriterion("current_price =", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotEqualTo(BigDecimal value) {
            addCriterion("current_price <>", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThan(BigDecimal value) {
            addCriterion("current_price >", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_price >=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThan(BigDecimal value) {
            addCriterion("current_price <", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_price <=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIn(List<BigDecimal> values) {
            addCriterion("current_price in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotIn(List<BigDecimal> values) {
            addCriterion("current_price not in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_price between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_price not between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceIsNull() {
            addCriterion("balance_price is null");
            return (Criteria) this;
        }

        public Criteria andBalancePriceIsNotNull() {
            addCriterion("balance_price is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePriceEqualTo(BigDecimal value) {
            addCriterion("balance_price =", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceNotEqualTo(BigDecimal value) {
            addCriterion("balance_price <>", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceGreaterThan(BigDecimal value) {
            addCriterion("balance_price >", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_price >=", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceLessThan(BigDecimal value) {
            addCriterion("balance_price <", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_price <=", value, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceIn(List<BigDecimal> values) {
            addCriterion("balance_price in", values, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceNotIn(List<BigDecimal> values) {
            addCriterion("balance_price not in", values, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_price between", value1, value2, "balancePrice");
            return (Criteria) this;
        }

        public Criteria andBalancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_price not between", value1, value2, "balancePrice");
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

        public Criteria andMinBuyCountIsNull() {
            addCriterion("min_buy_count is null");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountIsNotNull() {
            addCriterion("min_buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountEqualTo(Integer value) {
            addCriterion("min_buy_count =", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountNotEqualTo(Integer value) {
            addCriterion("min_buy_count <>", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountGreaterThan(Integer value) {
            addCriterion("min_buy_count >", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_buy_count >=", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountLessThan(Integer value) {
            addCriterion("min_buy_count <", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("min_buy_count <=", value, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountIn(List<Integer> values) {
            addCriterion("min_buy_count in", values, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountNotIn(List<Integer> values) {
            addCriterion("min_buy_count not in", values, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("min_buy_count between", value1, value2, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMinBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("min_buy_count not between", value1, value2, "minBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountIsNull() {
            addCriterion("max_buy_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountIsNotNull() {
            addCriterion("max_buy_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountEqualTo(Integer value) {
            addCriterion("max_buy_count =", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountNotEqualTo(Integer value) {
            addCriterion("max_buy_count <>", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountGreaterThan(Integer value) {
            addCriterion("max_buy_count >", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_buy_count >=", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountLessThan(Integer value) {
            addCriterion("max_buy_count <", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_buy_count <=", value, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountIn(List<Integer> values) {
            addCriterion("max_buy_count in", values, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountNotIn(List<Integer> values) {
            addCriterion("max_buy_count not in", values, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_count between", value1, value2, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andMaxBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_buy_count not between", value1, value2, "maxBuyCount");
            return (Criteria) this;
        }

        public Criteria andUseScoreIsNull() {
            addCriterion("use_score is null");
            return (Criteria) this;
        }

        public Criteria andUseScoreIsNotNull() {
            addCriterion("use_score is not null");
            return (Criteria) this;
        }

        public Criteria andUseScoreEqualTo(Byte value) {
            addCriterion("use_score =", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreNotEqualTo(Byte value) {
            addCriterion("use_score <>", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreGreaterThan(Byte value) {
            addCriterion("use_score >", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_score >=", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreLessThan(Byte value) {
            addCriterion("use_score <", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreLessThanOrEqualTo(Byte value) {
            addCriterion("use_score <=", value, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreIn(List<Byte> values) {
            addCriterion("use_score in", values, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreNotIn(List<Byte> values) {
            addCriterion("use_score not in", values, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreBetween(Byte value1, Byte value2) {
            addCriterion("use_score between", value1, value2, "useScore");
            return (Criteria) this;
        }

        public Criteria andUseScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("use_score not between", value1, value2, "useScore");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioIsNull() {
            addCriterion("integral_use_ratio is null");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioIsNotNull() {
            addCriterion("integral_use_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioEqualTo(Integer value) {
            addCriterion("integral_use_ratio =", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioNotEqualTo(Integer value) {
            addCriterion("integral_use_ratio <>", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioGreaterThan(Integer value) {
            addCriterion("integral_use_ratio >", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_use_ratio >=", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioLessThan(Integer value) {
            addCriterion("integral_use_ratio <", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioLessThanOrEqualTo(Integer value) {
            addCriterion("integral_use_ratio <=", value, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioIn(List<Integer> values) {
            addCriterion("integral_use_ratio in", values, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioNotIn(List<Integer> values) {
            addCriterion("integral_use_ratio not in", values, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioBetween(Integer value1, Integer value2) {
            addCriterion("integral_use_ratio between", value1, value2, "integralUseRatio");
            return (Criteria) this;
        }

        public Criteria andIntegralUseRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_use_ratio not between", value1, value2, "integralUseRatio");
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