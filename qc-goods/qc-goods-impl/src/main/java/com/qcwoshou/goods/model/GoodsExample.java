package com.qcwoshou.goods.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andDealNumIsNull() {
            addCriterion("deal_num is null");
            return (Criteria) this;
        }

        public Criteria andDealNumIsNotNull() {
            addCriterion("deal_num is not null");
            return (Criteria) this;
        }

        public Criteria andDealNumEqualTo(String value) {
            addCriterion("deal_num =", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotEqualTo(String value) {
            addCriterion("deal_num <>", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumGreaterThan(String value) {
            addCriterion("deal_num >", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumGreaterThanOrEqualTo(String value) {
            addCriterion("deal_num >=", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLessThan(String value) {
            addCriterion("deal_num <", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLessThanOrEqualTo(String value) {
            addCriterion("deal_num <=", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLike(String value) {
            addCriterion("deal_num like", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotLike(String value) {
            addCriterion("deal_num not like", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumIn(List<String> values) {
            addCriterion("deal_num in", values, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotIn(List<String> values) {
            addCriterion("deal_num not in", values, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumBetween(String value1, String value2) {
            addCriterion("deal_num between", value1, value2, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotBetween(String value1, String value2) {
            addCriterion("deal_num not between", value1, value2, "dealNum");
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Integer value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Integer value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Integer> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andIsOnliveIsNull() {
            addCriterion("is_onlive is null");
            return (Criteria) this;
        }

        public Criteria andIsOnliveIsNotNull() {
            addCriterion("is_onlive is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnliveEqualTo(Byte value) {
            addCriterion("is_onlive =", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveNotEqualTo(Byte value) {
            addCriterion("is_onlive <>", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveGreaterThan(Byte value) {
            addCriterion("is_onlive >", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_onlive >=", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveLessThan(Byte value) {
            addCriterion("is_onlive <", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveLessThanOrEqualTo(Byte value) {
            addCriterion("is_onlive <=", value, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveIn(List<Byte> values) {
            addCriterion("is_onlive in", values, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveNotIn(List<Byte> values) {
            addCriterion("is_onlive not in", values, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveBetween(Byte value1, Byte value2) {
            addCriterion("is_onlive between", value1, value2, "isOnlive");
            return (Criteria) this;
        }

        public Criteria andIsOnliveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_onlive not between", value1, value2, "isOnlive");
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

        public Criteria andIsDeliveryIsNull() {
            addCriterion("is_delivery is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryIsNotNull() {
            addCriterion("is_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryEqualTo(Byte value) {
            addCriterion("is_delivery =", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotEqualTo(Byte value) {
            addCriterion("is_delivery <>", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryGreaterThan(Byte value) {
            addCriterion("is_delivery >", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delivery >=", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryLessThan(Byte value) {
            addCriterion("is_delivery <", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryLessThanOrEqualTo(Byte value) {
            addCriterion("is_delivery <=", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryIn(List<Byte> values) {
            addCriterion("is_delivery in", values, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotIn(List<Byte> values) {
            addCriterion("is_delivery not in", values, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryBetween(Byte value1, Byte value2) {
            addCriterion("is_delivery between", value1, value2, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delivery not between", value1, value2, "isDelivery");
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

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Byte value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Byte value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Byte value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Byte value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Byte> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Byte> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Byte value1, Byte value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsOwnIsNull() {
            addCriterion("is_own is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnIsNotNull() {
            addCriterion("is_own is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnEqualTo(Byte value) {
            addCriterion("is_own =", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnNotEqualTo(Byte value) {
            addCriterion("is_own <>", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnGreaterThan(Byte value) {
            addCriterion("is_own >", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_own >=", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnLessThan(Byte value) {
            addCriterion("is_own <", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnLessThanOrEqualTo(Byte value) {
            addCriterion("is_own <=", value, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnIn(List<Byte> values) {
            addCriterion("is_own in", values, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnNotIn(List<Byte> values) {
            addCriterion("is_own not in", values, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnBetween(Byte value1, Byte value2) {
            addCriterion("is_own between", value1, value2, "isOwn");
            return (Criteria) this;
        }

        public Criteria andIsOwnNotBetween(Byte value1, Byte value2) {
            addCriterion("is_own not between", value1, value2, "isOwn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andPublishWaitIsNull() {
            addCriterion("publish_wait is null");
            return (Criteria) this;
        }

        public Criteria andPublishWaitIsNotNull() {
            addCriterion("publish_wait is not null");
            return (Criteria) this;
        }

        public Criteria andPublishWaitEqualTo(Byte value) {
            addCriterion("publish_wait =", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitNotEqualTo(Byte value) {
            addCriterion("publish_wait <>", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitGreaterThan(Byte value) {
            addCriterion("publish_wait >", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitGreaterThanOrEqualTo(Byte value) {
            addCriterion("publish_wait >=", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitLessThan(Byte value) {
            addCriterion("publish_wait <", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitLessThanOrEqualTo(Byte value) {
            addCriterion("publish_wait <=", value, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitIn(List<Byte> values) {
            addCriterion("publish_wait in", values, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitNotIn(List<Byte> values) {
            addCriterion("publish_wait not in", values, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitBetween(Byte value1, Byte value2) {
            addCriterion("publish_wait between", value1, value2, "publishWait");
            return (Criteria) this;
        }

        public Criteria andPublishWaitNotBetween(Byte value1, Byte value2) {
            addCriterion("publish_wait not between", value1, value2, "publishWait");
            return (Criteria) this;
        }

        public Criteria andSubmitFromIsNull() {
            addCriterion("submit_from is null");
            return (Criteria) this;
        }

        public Criteria andSubmitFromIsNotNull() {
            addCriterion("submit_from is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitFromEqualTo(Byte value) {
            addCriterion("submit_from =", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromNotEqualTo(Byte value) {
            addCriterion("submit_from <>", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromGreaterThan(Byte value) {
            addCriterion("submit_from >", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromGreaterThanOrEqualTo(Byte value) {
            addCriterion("submit_from >=", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromLessThan(Byte value) {
            addCriterion("submit_from <", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromLessThanOrEqualTo(Byte value) {
            addCriterion("submit_from <=", value, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromIn(List<Byte> values) {
            addCriterion("submit_from in", values, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromNotIn(List<Byte> values) {
            addCriterion("submit_from not in", values, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromBetween(Byte value1, Byte value2) {
            addCriterion("submit_from between", value1, value2, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andSubmitFromNotBetween(Byte value1, Byte value2) {
            addCriterion("submit_from not between", value1, value2, "submitFrom");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIsNull() {
            addCriterion("is_real_name is null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIsNotNull() {
            addCriterion("is_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameEqualTo(Byte value) {
            addCriterion("is_real_name =", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotEqualTo(Byte value) {
            addCriterion("is_real_name <>", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThan(Byte value) {
            addCriterion("is_real_name >", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_real_name >=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThan(Byte value) {
            addCriterion("is_real_name <", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThanOrEqualTo(Byte value) {
            addCriterion("is_real_name <=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIn(List<Byte> values) {
            addCriterion("is_real_name in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotIn(List<Byte> values) {
            addCriterion("is_real_name not in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameBetween(Byte value1, Byte value2) {
            addCriterion("is_real_name between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotBetween(Byte value1, Byte value2) {
            addCriterion("is_real_name not between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNull() {
            addCriterion("reviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNotNull() {
            addCriterion("reviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdEqualTo(Integer value) {
            addCriterion("reviewer_id =", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotEqualTo(Integer value) {
            addCriterion("reviewer_id <>", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThan(Integer value) {
            addCriterion("reviewer_id >", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewer_id >=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThan(Integer value) {
            addCriterion("reviewer_id <", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThanOrEqualTo(Integer value) {
            addCriterion("reviewer_id <=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIn(List<Integer> values) {
            addCriterion("reviewer_id in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotIn(List<Integer> values) {
            addCriterion("reviewer_id not in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdBetween(Integer value1, Integer value2) {
            addCriterion("reviewer_id between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewer_id not between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeIsNull() {
            addCriterion("last_reviewer_time is null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeIsNotNull() {
            addCriterion("last_reviewer_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeEqualTo(Integer value) {
            addCriterion("last_reviewer_time =", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotEqualTo(Integer value) {
            addCriterion("last_reviewer_time <>", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeGreaterThan(Integer value) {
            addCriterion("last_reviewer_time >", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_reviewer_time >=", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeLessThan(Integer value) {
            addCriterion("last_reviewer_time <", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_reviewer_time <=", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeIn(List<Integer> values) {
            addCriterion("last_reviewer_time in", values, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotIn(List<Integer> values) {
            addCriterion("last_reviewer_time not in", values, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_reviewer_time between", value1, value2, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_reviewer_time not between", value1, value2, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIsNull() {
            addCriterion("shelves_type is null");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIsNotNull() {
            addCriterion("shelves_type is not null");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeEqualTo(Byte value) {
            addCriterion("shelves_type =", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotEqualTo(Byte value) {
            addCriterion("shelves_type <>", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeGreaterThan(Byte value) {
            addCriterion("shelves_type >", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shelves_type >=", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeLessThan(Byte value) {
            addCriterion("shelves_type <", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeLessThanOrEqualTo(Byte value) {
            addCriterion("shelves_type <=", value, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeIn(List<Byte> values) {
            addCriterion("shelves_type in", values, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotIn(List<Byte> values) {
            addCriterion("shelves_type not in", values, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeBetween(Byte value1, Byte value2) {
            addCriterion("shelves_type between", value1, value2, "shelvesType");
            return (Criteria) this;
        }

        public Criteria andShelvesTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("shelves_type not between", value1, value2, "shelvesType");
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

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAdsMessageIsNull() {
            addCriterion("ads_message is null");
            return (Criteria) this;
        }

        public Criteria andAdsMessageIsNotNull() {
            addCriterion("ads_message is not null");
            return (Criteria) this;
        }

        public Criteria andAdsMessageEqualTo(String value) {
            addCriterion("ads_message =", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageNotEqualTo(String value) {
            addCriterion("ads_message <>", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageGreaterThan(String value) {
            addCriterion("ads_message >", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ads_message >=", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageLessThan(String value) {
            addCriterion("ads_message <", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageLessThanOrEqualTo(String value) {
            addCriterion("ads_message <=", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageLike(String value) {
            addCriterion("ads_message like", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageNotLike(String value) {
            addCriterion("ads_message not like", value, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageIn(List<String> values) {
            addCriterion("ads_message in", values, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageNotIn(List<String> values) {
            addCriterion("ads_message not in", values, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageBetween(String value1, String value2) {
            addCriterion("ads_message between", value1, value2, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andAdsMessageNotBetween(String value1, String value2) {
            addCriterion("ads_message not between", value1, value2, "adsMessage");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningIsNull() {
            addCriterion("bought_warning is null");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningIsNotNull() {
            addCriterion("bought_warning is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningEqualTo(Byte value) {
            addCriterion("bought_warning =", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningNotEqualTo(Byte value) {
            addCriterion("bought_warning <>", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningGreaterThan(Byte value) {
            addCriterion("bought_warning >", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningGreaterThanOrEqualTo(Byte value) {
            addCriterion("bought_warning >=", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningLessThan(Byte value) {
            addCriterion("bought_warning <", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningLessThanOrEqualTo(Byte value) {
            addCriterion("bought_warning <=", value, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningIn(List<Byte> values) {
            addCriterion("bought_warning in", values, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningNotIn(List<Byte> values) {
            addCriterion("bought_warning not in", values, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningBetween(Byte value1, Byte value2) {
            addCriterion("bought_warning between", value1, value2, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andBoughtWarningNotBetween(Byte value1, Byte value2) {
            addCriterion("bought_warning not between", value1, value2, "boughtWarning");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIsNull() {
            addCriterion("shelves_date is null");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIsNotNull() {
            addCriterion("shelves_date is not null");
            return (Criteria) this;
        }

        public Criteria andShelvesDateEqualTo(Date value) {
            addCriterion("shelves_date =", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotEqualTo(Date value) {
            addCriterion("shelves_date <>", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateGreaterThan(Date value) {
            addCriterion("shelves_date >", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shelves_date >=", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateLessThan(Date value) {
            addCriterion("shelves_date <", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateLessThanOrEqualTo(Date value) {
            addCriterion("shelves_date <=", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIn(List<Date> values) {
            addCriterion("shelves_date in", values, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotIn(List<Date> values) {
            addCriterion("shelves_date not in", values, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateBetween(Date value1, Date value2) {
            addCriterion("shelves_date between", value1, value2, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotBetween(Date value1, Date value2) {
            addCriterion("shelves_date not between", value1, value2, "shelvesDate");
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