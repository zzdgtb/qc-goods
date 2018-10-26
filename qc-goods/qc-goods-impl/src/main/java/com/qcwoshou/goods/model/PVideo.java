package com.qcwoshou.goods.model;

import java.math.BigDecimal;
import java.util.Date;

public class PVideo {
    private Long id;

    private String videoCode;

    private Byte submitFrom;

    private Byte platformSource;

    private String subTitle;

    private String name;

    private Integer supplierId;

    private Integer agentId;

    private Integer typeId;

    private String adsMessage;

    private String img;

    private Byte isOnlive;

    private Byte shelvesType;

    private Date shelvesDate;

    private Date unshelvesDate;

    private BigDecimal originPrice;

    private BigDecimal currentPrice;

    private BigDecimal balancePrice;

    private Boolean isBest;

    private Byte isNew;

    private Byte isOwn;

    private String seoKeywords;

    private Byte publishWait;

    private Integer createUserId;

    private Date createTime;

    private Date createDate;

    private Date updateTime;

    private Date lastUpdateDate;

    private Integer reviewerId;

    private Date lastReviewerTime;

    private Date auditTime;

    private Byte isDelete;

    private Boolean isHot;

    private String reviewerMeseage;

    private String roomCode;

    private String subInfo;

    private Date endLiveTime;

    private Date beginLiveTime;

    private String courseDataUrl;

    private String className;

    private String subject;

    private String course;

    private String mainPicUrl;

    private Integer status;

    private String description;

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

    public Byte getSubmitFrom() {
        return submitFrom;
    }

    public void setSubmitFrom(Byte submitFrom) {
        this.submitFrom = submitFrom;
    }

    public Byte getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(Byte platformSource) {
        this.platformSource = platformSource;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getAdsMessage() {
        return adsMessage;
    }

    public void setAdsMessage(String adsMessage) {
        this.adsMessage = adsMessage == null ? null : adsMessage.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Byte getIsOnlive() {
        return isOnlive;
    }

    public void setIsOnlive(Byte isOnlive) {
        this.isOnlive = isOnlive;
    }

    public Byte getShelvesType() {
        return shelvesType;
    }

    public void setShelvesType(Byte shelvesType) {
        this.shelvesType = shelvesType;
    }

    public Date getShelvesDate() {
        return shelvesDate;
    }

    public void setShelvesDate(Date shelvesDate) {
        this.shelvesDate = shelvesDate;
    }

    public Date getUnshelvesDate() {
        return unshelvesDate;
    }

    public void setUnshelvesDate(Date unshelvesDate) {
        this.unshelvesDate = unshelvesDate;
    }

    public BigDecimal getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(BigDecimal originPrice) {
        this.originPrice = originPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getBalancePrice() {
        return balancePrice;
    }

    public void setBalancePrice(BigDecimal balancePrice) {
        this.balancePrice = balancePrice;
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getIsOwn() {
        return isOwn;
    }

    public void setIsOwn(Byte isOwn) {
        this.isOwn = isOwn;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public Byte getPublishWait() {
        return publishWait;
    }

    public void setPublishWait(Byte publishWait) {
        this.publishWait = publishWait;
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

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Date getLastReviewerTime() {
        return lastReviewerTime;
    }

    public void setLastReviewerTime(Date lastReviewerTime) {
        this.lastReviewerTime = lastReviewerTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public String getReviewerMeseage() {
        return reviewerMeseage;
    }

    public void setReviewerMeseage(String reviewerMeseage) {
        this.reviewerMeseage = reviewerMeseage == null ? null : reviewerMeseage.trim();
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public String getSubInfo() {
        return subInfo;
    }

    public void setSubInfo(String subInfo) {
        this.subInfo = subInfo == null ? null : subInfo.trim();
    }

    public Date getEndLiveTime() {
        return endLiveTime;
    }

    public void setEndLiveTime(Date endLiveTime) {
        this.endLiveTime = endLiveTime;
    }

    public Date getBeginLiveTime() {
        return beginLiveTime;
    }

    public void setBeginLiveTime(Date beginLiveTime) {
        this.beginLiveTime = beginLiveTime;
    }

    public String getCourseDataUrl() {
        return courseDataUrl;
    }

    public void setCourseDataUrl(String courseDataUrl) {
        this.courseDataUrl = courseDataUrl == null ? null : courseDataUrl.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl == null ? null : mainPicUrl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}