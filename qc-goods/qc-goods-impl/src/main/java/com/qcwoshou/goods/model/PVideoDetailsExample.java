package com.qcwoshou.goods.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PVideoDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PVideoDetailsExample() {
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

        public Criteria andPushLiveUrlIsNull() {
            addCriterion("push_live_url is null");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlIsNotNull() {
            addCriterion("push_live_url is not null");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlEqualTo(String value) {
            addCriterion("push_live_url =", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlNotEqualTo(String value) {
            addCriterion("push_live_url <>", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlGreaterThan(String value) {
            addCriterion("push_live_url >", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("push_live_url >=", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlLessThan(String value) {
            addCriterion("push_live_url <", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlLessThanOrEqualTo(String value) {
            addCriterion("push_live_url <=", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlLike(String value) {
            addCriterion("push_live_url like", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlNotLike(String value) {
            addCriterion("push_live_url not like", value, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlIn(List<String> values) {
            addCriterion("push_live_url in", values, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlNotIn(List<String> values) {
            addCriterion("push_live_url not in", values, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlBetween(String value1, String value2) {
            addCriterion("push_live_url between", value1, value2, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPushLiveUrlNotBetween(String value1, String value2) {
            addCriterion("push_live_url not between", value1, value2, "pushLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlIsNull() {
            addCriterion("play_live_url is null");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlIsNotNull() {
            addCriterion("play_live_url is not null");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlEqualTo(String value) {
            addCriterion("play_live_url =", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlNotEqualTo(String value) {
            addCriterion("play_live_url <>", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlGreaterThan(String value) {
            addCriterion("play_live_url >", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("play_live_url >=", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlLessThan(String value) {
            addCriterion("play_live_url <", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlLessThanOrEqualTo(String value) {
            addCriterion("play_live_url <=", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlLike(String value) {
            addCriterion("play_live_url like", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlNotLike(String value) {
            addCriterion("play_live_url not like", value, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlIn(List<String> values) {
            addCriterion("play_live_url in", values, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlNotIn(List<String> values) {
            addCriterion("play_live_url not in", values, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlBetween(String value1, String value2) {
            addCriterion("play_live_url between", value1, value2, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayLiveUrlNotBetween(String value1, String value2) {
            addCriterion("play_live_url not between", value1, value2, "playLiveUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlIsNull() {
            addCriterion("play_record_url is null");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlIsNotNull() {
            addCriterion("play_record_url is not null");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlEqualTo(String value) {
            addCriterion("play_record_url =", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlNotEqualTo(String value) {
            addCriterion("play_record_url <>", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlGreaterThan(String value) {
            addCriterion("play_record_url >", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlGreaterThanOrEqualTo(String value) {
            addCriterion("play_record_url >=", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlLessThan(String value) {
            addCriterion("play_record_url <", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlLessThanOrEqualTo(String value) {
            addCriterion("play_record_url <=", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlLike(String value) {
            addCriterion("play_record_url like", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlNotLike(String value) {
            addCriterion("play_record_url not like", value, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlIn(List<String> values) {
            addCriterion("play_record_url in", values, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlNotIn(List<String> values) {
            addCriterion("play_record_url not in", values, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlBetween(String value1, String value2) {
            addCriterion("play_record_url between", value1, value2, "playRecordUrl");
            return (Criteria) this;
        }

        public Criteria andPlayRecordUrlNotBetween(String value1, String value2) {
            addCriterion("play_record_url not between", value1, value2, "playRecordUrl");
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

        public Criteria andRealBeginLivetimeIsNull() {
            addCriterion("real_begin_livetime is null");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeIsNotNull() {
            addCriterion("real_begin_livetime is not null");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeEqualTo(Date value) {
            addCriterion("real_begin_livetime =", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeNotEqualTo(Date value) {
            addCriterion("real_begin_livetime <>", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeGreaterThan(Date value) {
            addCriterion("real_begin_livetime >", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_begin_livetime >=", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeLessThan(Date value) {
            addCriterion("real_begin_livetime <", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeLessThanOrEqualTo(Date value) {
            addCriterion("real_begin_livetime <=", value, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeIn(List<Date> values) {
            addCriterion("real_begin_livetime in", values, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeNotIn(List<Date> values) {
            addCriterion("real_begin_livetime not in", values, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeBetween(Date value1, Date value2) {
            addCriterion("real_begin_livetime between", value1, value2, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealBeginLivetimeNotBetween(Date value1, Date value2) {
            addCriterion("real_begin_livetime not between", value1, value2, "realBeginLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeIsNull() {
            addCriterion("real_end_livetime is null");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeIsNotNull() {
            addCriterion("real_end_livetime is not null");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeEqualTo(Date value) {
            addCriterion("real_end_livetime =", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeNotEqualTo(Date value) {
            addCriterion("real_end_livetime <>", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeGreaterThan(Date value) {
            addCriterion("real_end_livetime >", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_end_livetime >=", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeLessThan(Date value) {
            addCriterion("real_end_livetime <", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeLessThanOrEqualTo(Date value) {
            addCriterion("real_end_livetime <=", value, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeIn(List<Date> values) {
            addCriterion("real_end_livetime in", values, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeNotIn(List<Date> values) {
            addCriterion("real_end_livetime not in", values, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeBetween(Date value1, Date value2) {
            addCriterion("real_end_livetime between", value1, value2, "realEndLivetime");
            return (Criteria) this;
        }

        public Criteria andRealEndLivetimeNotBetween(Date value1, Date value2) {
            addCriterion("real_end_livetime not between", value1, value2, "realEndLivetime");
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