package com.qcwoshou.goods.model;

import java.util.Date;

public class PVideoDetails {
    private Long id;

    private String videoCode;

    private Long liveInfoId;

    private String pushLiveUrl;

    private String playLiveUrl;

    private String playRecordUrl;

    private String roomCode;

    private Date realBeginLivetime;

    private Date realEndLivetime;

    private Integer isEndLive;

    private Integer createUserId;

    private Date createTime;

    private Date updateTime;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode == null ? null : videoCode.trim();
    }

    public Long getLiveInfoId() {
        return liveInfoId;
    }

    public void setLiveInfoId(Long liveInfoId) {
        this.liveInfoId = liveInfoId;
    }

    public String getPushLiveUrl() {
        return pushLiveUrl;
    }

    public void setPushLiveUrl(String pushLiveUrl) {
        this.pushLiveUrl = pushLiveUrl == null ? null : pushLiveUrl.trim();
    }

    public String getPlayLiveUrl() {
        return playLiveUrl;
    }

    public void setPlayLiveUrl(String playLiveUrl) {
        this.playLiveUrl = playLiveUrl == null ? null : playLiveUrl.trim();
    }

    public String getPlayRecordUrl() {
        return playRecordUrl;
    }

    public void setPlayRecordUrl(String playRecordUrl) {
        this.playRecordUrl = playRecordUrl == null ? null : playRecordUrl.trim();
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public Date getRealBeginLivetime() {
        return realBeginLivetime;
    }

    public void setRealBeginLivetime(Date realBeginLivetime) {
        this.realBeginLivetime = realBeginLivetime;
    }

    public Date getRealEndLivetime() {
        return realEndLivetime;
    }

    public void setRealEndLivetime(Date realEndLivetime) {
        this.realEndLivetime = realEndLivetime;
    }

    public Integer getIsEndLive() {
        return isEndLive;
    }

    public void setIsEndLive(Integer isEndLive) {
        this.isEndLive = isEndLive;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}