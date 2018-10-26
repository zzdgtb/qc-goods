package com.qcwoshou.goods.model;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer id;

    private String dealNum;

    private String name;

    private Integer supplierId;

    private Integer agentId;

    private Integer goodsTypeId;

    private String img;

    private Byte isOnlive;

    private Integer beginTime;

    private BigDecimal currentPrice;

    private Byte isDelivery;

    private Byte isDelete;

    private Byte isNew;

    private Byte isOwn;

    private Integer createTime;

    private Integer updateTime;

    private Integer brandId;

    private Byte publishWait;

    private Byte submitFrom;

    private Byte isRealName;

    private Integer reviewerId;

    private Integer lastReviewerTime;

    private Integer createUserId;

    private Byte shelvesType;

    private Date createDate;

    private Date lastUpdateDate;

    private Date auditTime;

    private String adsMessage;

    private String seoKeywords;

    private Byte boughtWarning;

    private Date shelvesDate;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDealNum() {
        return dealNum;
    }

    public void setDealNum(String dealNum) {
        this.dealNum = dealNum == null ? null : dealNum.trim();
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

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
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

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Byte getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(Byte isDelivery) {
        this.isDelivery = isDelivery;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Byte getPublishWait() {
        return publishWait;
    }

    public void setPublishWait(Byte publishWait) {
        this.publishWait = publishWait;
    }

    public Byte getSubmitFrom() {
        return submitFrom;
    }

    public void setSubmitFrom(Byte submitFrom) {
        this.submitFrom = submitFrom;
    }

    public Byte getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(Byte isRealName) {
        this.isRealName = isRealName;
    }

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Integer getLastReviewerTime() {
        return lastReviewerTime;
    }

    public void setLastReviewerTime(Integer lastReviewerTime) {
        this.lastReviewerTime = lastReviewerTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Byte getShelvesType() {
        return shelvesType;
    }

    public void setShelvesType(Byte shelvesType) {
        this.shelvesType = shelvesType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAdsMessage() {
        return adsMessage;
    }

    public void setAdsMessage(String adsMessage) {
        this.adsMessage = adsMessage == null ? null : adsMessage.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public Byte getBoughtWarning() {
        return boughtWarning;
    }

    public void setBoughtWarning(Byte boughtWarning) {
        this.boughtWarning = boughtWarning;
    }

    public Date getShelvesDate() {
        return shelvesDate;
    }

    public void setShelvesDate(Date shelvesDate) {
        this.shelvesDate = shelvesDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}