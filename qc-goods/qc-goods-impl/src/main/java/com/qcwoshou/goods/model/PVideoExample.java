package com.qcwoshou.goods.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PVideoExample() {
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

        public Criteria andVideoCodeIsNull() {
            addCriterion("video_code is null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIsNotNull() {
            addCriterion("video_code is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeEqualTo(String value) {
            addCriterion("video_code =", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotEqualTo(String value) {
            addCriterion("video_code <>", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThan(String value) {
            addCriterion("video_code >", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_code >=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThan(String value) {
            addCriterion("video_code <", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThanOrEqualTo(String value) {
            addCriterion("video_code <=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLike(String value) {
            addCriterion("video_code like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotLike(String value) {
            addCriterion("video_code not like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIn(List<String> values) {
            addCriterion("video_code in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotIn(List<String> values) {
            addCriterion("video_code not in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeBetween(String value1, String value2) {
            addCriterion("video_code between", value1, value2, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotBetween(String value1, String value2) {
            addCriterion("video_code not between", value1, value2, "videoCode");
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

        public Criteria andPlatformSourceIsNull() {
            addCriterion("platform_source is null");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceIsNotNull() {
            addCriterion("platform_source is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceEqualTo(Byte value) {
            addCriterion("platform_source =", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceNotEqualTo(Byte value) {
            addCriterion("platform_source <>", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceGreaterThan(Byte value) {
            addCriterion("platform_source >", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform_source >=", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceLessThan(Byte value) {
            addCriterion("platform_source <", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceLessThanOrEqualTo(Byte value) {
            addCriterion("platform_source <=", value, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceIn(List<Byte> values) {
            addCriterion("platform_source in", values, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceNotIn(List<Byte> values) {
            addCriterion("platform_source not in", values, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceBetween(Byte value1, Byte value2) {
            addCriterion("platform_source between", value1, value2, "platformSource");
            return (Criteria) this;
        }

        public Criteria andPlatformSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("platform_source not between", value1, value2, "platformSource");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("sub_title =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("sub_title >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("sub_title <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("sub_title like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("sub_title not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("sub_title in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "subTitle");
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andUnshelvesDateIsNull() {
            addCriterion("unshelves_date is null");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateIsNotNull() {
            addCriterion("unshelves_date is not null");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateEqualTo(Date value) {
            addCriterion("unshelves_date =", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateNotEqualTo(Date value) {
            addCriterion("unshelves_date <>", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateGreaterThan(Date value) {
            addCriterion("unshelves_date >", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("unshelves_date >=", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateLessThan(Date value) {
            addCriterion("unshelves_date <", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateLessThanOrEqualTo(Date value) {
            addCriterion("unshelves_date <=", value, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateIn(List<Date> values) {
            addCriterion("unshelves_date in", values, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateNotIn(List<Date> values) {
            addCriterion("unshelves_date not in", values, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateBetween(Date value1, Date value2) {
            addCriterion("unshelves_date between", value1, value2, "unshelvesDate");
            return (Criteria) this;
        }

        public Criteria andUnshelvesDateNotBetween(Date value1, Date value2) {
            addCriterion("unshelves_date not between", value1, value2, "unshelvesDate");
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

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Boolean value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Boolean value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Boolean value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Boolean value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Boolean value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Boolean> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Boolean> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andLastReviewerTimeEqualTo(Date value) {
            addCriterion("last_reviewer_time =", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotEqualTo(Date value) {
            addCriterion("last_reviewer_time <>", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeGreaterThan(Date value) {
            addCriterion("last_reviewer_time >", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_reviewer_time >=", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeLessThan(Date value) {
            addCriterion("last_reviewer_time <", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_reviewer_time <=", value, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeIn(List<Date> values) {
            addCriterion("last_reviewer_time in", values, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotIn(List<Date> values) {
            addCriterion("last_reviewer_time not in", values, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeBetween(Date value1, Date value2) {
            addCriterion("last_reviewer_time between", value1, value2, "lastReviewerTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewerTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_reviewer_time not between", value1, value2, "lastReviewerTime");
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

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageIsNull() {
            addCriterion("reviewer_meseage is null");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageIsNotNull() {
            addCriterion("reviewer_meseage is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageEqualTo(String value) {
            addCriterion("reviewer_meseage =", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageNotEqualTo(String value) {
            addCriterion("reviewer_meseage <>", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageGreaterThan(String value) {
            addCriterion("reviewer_meseage >", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_meseage >=", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageLessThan(String value) {
            addCriterion("reviewer_meseage <", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageLessThanOrEqualTo(String value) {
            addCriterion("reviewer_meseage <=", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageLike(String value) {
            addCriterion("reviewer_meseage like", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageNotLike(String value) {
            addCriterion("reviewer_meseage not like", value, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageIn(List<String> values) {
            addCriterion("reviewer_meseage in", values, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageNotIn(List<String> values) {
            addCriterion("reviewer_meseage not in", values, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageBetween(String value1, String value2) {
            addCriterion("reviewer_meseage between", value1, value2, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andReviewerMeseageNotBetween(String value1, String value2) {
            addCriterion("reviewer_meseage not between", value1, value2, "reviewerMeseage");
            return (Criteria) this;
        }

        public Criteria andRoomCodeIsNull() {
            addCriterion("room_code is null");
            return (Criteria) this;
        }

        public Criteria andRoomCodeIsNotNull() {
            addCriterion("room_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCodeEqualTo(String value) {
            addCriterion("room_code =", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeNotEqualTo(String value) {
            addCriterion("room_code <>", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeGreaterThan(String value) {
            addCriterion("room_code >", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("room_code >=", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeLessThan(String value) {
            addCriterion("room_code <", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeLessThanOrEqualTo(String value) {
            addCriterion("room_code <=", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeLike(String value) {
            addCriterion("room_code like", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeNotLike(String value) {
            addCriterion("room_code not like", value, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeIn(List<String> values) {
            addCriterion("room_code in", values, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeNotIn(List<String> values) {
            addCriterion("room_code not in", values, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeBetween(String value1, String value2) {
            addCriterion("room_code between", value1, value2, "roomCode");
            return (Criteria) this;
        }

        public Criteria andRoomCodeNotBetween(String value1, String value2) {
            addCriterion("room_code not between", value1, value2, "roomCode");
            return (Criteria) this;
        }

        public Criteria andSubInfoIsNull() {
            addCriterion("sub_info is null");
            return (Criteria) this;
        }

        public Criteria andSubInfoIsNotNull() {
            addCriterion("sub_info is not null");
            return (Criteria) this;
        }

        public Criteria andSubInfoEqualTo(String value) {
            addCriterion("sub_info =", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoNotEqualTo(String value) {
            addCriterion("sub_info <>", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoGreaterThan(String value) {
            addCriterion("sub_info >", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_info >=", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoLessThan(String value) {
            addCriterion("sub_info <", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoLessThanOrEqualTo(String value) {
            addCriterion("sub_info <=", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoLike(String value) {
            addCriterion("sub_info like", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoNotLike(String value) {
            addCriterion("sub_info not like", value, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoIn(List<String> values) {
            addCriterion("sub_info in", values, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoNotIn(List<String> values) {
            addCriterion("sub_info not in", values, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoBetween(String value1, String value2) {
            addCriterion("sub_info between", value1, value2, "subInfo");
            return (Criteria) this;
        }

        public Criteria andSubInfoNotBetween(String value1, String value2) {
            addCriterion("sub_info not between", value1, value2, "subInfo");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeIsNull() {
            addCriterion("end_live_time is null");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeIsNotNull() {
            addCriterion("end_live_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeEqualTo(Date value) {
            addCriterion("end_live_time =", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeNotEqualTo(Date value) {
            addCriterion("end_live_time <>", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeGreaterThan(Date value) {
            addCriterion("end_live_time >", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_live_time >=", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeLessThan(Date value) {
            addCriterion("end_live_time <", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_live_time <=", value, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeIn(List<Date> values) {
            addCriterion("end_live_time in", values, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeNotIn(List<Date> values) {
            addCriterion("end_live_time not in", values, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeBetween(Date value1, Date value2) {
            addCriterion("end_live_time between", value1, value2, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andEndLiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_live_time not between", value1, value2, "endLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeIsNull() {
            addCriterion("begin_live_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeIsNotNull() {
            addCriterion("begin_live_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeEqualTo(Date value) {
            addCriterion("begin_live_time =", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeNotEqualTo(Date value) {
            addCriterion("begin_live_time <>", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeGreaterThan(Date value) {
            addCriterion("begin_live_time >", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_live_time >=", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeLessThan(Date value) {
            addCriterion("begin_live_time <", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_live_time <=", value, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeIn(List<Date> values) {
            addCriterion("begin_live_time in", values, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeNotIn(List<Date> values) {
            addCriterion("begin_live_time not in", values, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeBetween(Date value1, Date value2) {
            addCriterion("begin_live_time between", value1, value2, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andBeginLiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_live_time not between", value1, value2, "beginLiveTime");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlIsNull() {
            addCriterion("course_data_url is null");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlIsNotNull() {
            addCriterion("course_data_url is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlEqualTo(String value) {
            addCriterion("course_data_url =", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlNotEqualTo(String value) {
            addCriterion("course_data_url <>", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlGreaterThan(String value) {
            addCriterion("course_data_url >", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlGreaterThanOrEqualTo(String value) {
            addCriterion("course_data_url >=", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlLessThan(String value) {
            addCriterion("course_data_url <", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlLessThanOrEqualTo(String value) {
            addCriterion("course_data_url <=", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlLike(String value) {
            addCriterion("course_data_url like", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlNotLike(String value) {
            addCriterion("course_data_url not like", value, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlIn(List<String> values) {
            addCriterion("course_data_url in", values, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlNotIn(List<String> values) {
            addCriterion("course_data_url not in", values, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlBetween(String value1, String value2) {
            addCriterion("course_data_url between", value1, value2, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andCourseDataUrlNotBetween(String value1, String value2) {
            addCriterion("course_data_url not between", value1, value2, "courseDataUrl");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlIsNull() {
            addCriterion("main_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlIsNotNull() {
            addCriterion("main_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlEqualTo(String value) {
            addCriterion("main_pic_url =", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlNotEqualTo(String value) {
            addCriterion("main_pic_url <>", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlGreaterThan(String value) {
            addCriterion("main_pic_url >", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_pic_url >=", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlLessThan(String value) {
            addCriterion("main_pic_url <", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlLessThanOrEqualTo(String value) {
            addCriterion("main_pic_url <=", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlLike(String value) {
            addCriterion("main_pic_url like", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlNotLike(String value) {
            addCriterion("main_pic_url not like", value, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlIn(List<String> values) {
            addCriterion("main_pic_url in", values, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlNotIn(List<String> values) {
            addCriterion("main_pic_url not in", values, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlBetween(String value1, String value2) {
            addCriterion("main_pic_url between", value1, value2, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andMainPicUrlNotBetween(String value1, String value2) {
            addCriterion("main_pic_url not between", value1, value2, "mainPicUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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