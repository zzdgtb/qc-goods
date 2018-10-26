package com.qcwoshou.goods.model;

import java.math.BigDecimal;

public class GoodsSku {
    private Integer id;

    private Integer goodsId;

    private String skuNumber;

    private String modelNumber;

    private String skuTitle;

    private Integer maxBought;

    private Integer bought;

    private String skuImg;

    private Byte sort;

    private BigDecimal originPrice;

    private BigDecimal currentPrice;

    private BigDecimal balancePrice;

    private Byte isDelete;

    private Integer minBuyCount;

    private Integer maxBuyCount;

    private Byte useScore;

    private Integer integralUseRatio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber == null ? null : skuNumber.trim();
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber == null ? null : modelNumber.trim();
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle == null ? null : skuTitle.trim();
    }

    public Integer getMaxBought() {
        return maxBought;
    }

    public void setMaxBought(Integer maxBought) {
        this.maxBought = maxBought;
    }

    public Integer getBought() {
        return bought;
    }

    public void setBought(Integer bought) {
        this.bought = bought;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg == null ? null : skuImg.trim();
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getMinBuyCount() {
        return minBuyCount;
    }

    public void setMinBuyCount(Integer minBuyCount) {
        this.minBuyCount = minBuyCount;
    }

    public Integer getMaxBuyCount() {
        return maxBuyCount;
    }

    public void setMaxBuyCount(Integer maxBuyCount) {
        this.maxBuyCount = maxBuyCount;
    }

    public Byte getUseScore() {
        return useScore;
    }

    public void setUseScore(Byte useScore) {
        this.useScore = useScore;
    }

    public Integer getIntegralUseRatio() {
        return integralUseRatio;
    }

    public void setIntegralUseRatio(Integer integralUseRatio) {
        this.integralUseRatio = integralUseRatio;
    }
}