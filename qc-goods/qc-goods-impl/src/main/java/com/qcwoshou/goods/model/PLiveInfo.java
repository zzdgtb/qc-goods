package com.qcwoshou.goods.model;

import java.util.Date;

public class PLiveInfo {
    private Long id;

    private String mainPicUrl;

    private String course;

    private String subject;

    private String className;

    private String courseDataUrl;

    private Date beginLiveTime;

    private Date endLiveTime;

    private Integer status;

    private String roomCode;

    private Integer createUserId;

    private Date createTime;

    private Date createDate;

    private Date updateTime;

    private Date lastUpdateDate;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl == null ? null : mainPicUrl.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getCourseDataUrl() {
        return courseDataUrl;
    }

    public void setCourseDataUrl(String courseDataUrl) {
        this.courseDataUrl = courseDataUrl == null ? null : courseDataUrl.trim();
    }

    public Date getBeginLiveTime() {
        return beginLiveTime;
    }

    public void setBeginLiveTime(Date beginLiveTime) {
        this.beginLiveTime = beginLiveTime;
    }

    public Date getEndLiveTime() {
        return endLiveTime;
    }

    public void setEndLiveTime(Date endLiveTime) {
        this.endLiveTime = endLiveTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}