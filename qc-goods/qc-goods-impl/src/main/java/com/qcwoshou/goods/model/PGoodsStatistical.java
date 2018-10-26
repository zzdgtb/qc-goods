package com.qcwoshou.goods.model;

public class PGoodsStatistical {
    private String skuNumber;

    private Integer goodsId;

    private Integer userCount;

    private Integer buyCount;

    private Integer dpCount;

    private Integer dpCount1;

    private Integer dpCount2;

    private Integer dpCount3;

    private Integer dpCount4;

    private Integer dpCount5;

    private Integer viewCount;

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber == null ? null : skuNumber.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getDpCount() {
        return dpCount;
    }

    public void setDpCount(Integer dpCount) {
        this.dpCount = dpCount;
    }

    public Integer getDpCount1() {
        return dpCount1;
    }

    public void setDpCount1(Integer dpCount1) {
        this.dpCount1 = dpCount1;
    }

    public Integer getDpCount2() {
        return dpCount2;
    }

    public void setDpCount2(Integer dpCount2) {
        this.dpCount2 = dpCount2;
    }

    public Integer getDpCount3() {
        return dpCount3;
    }

    public void setDpCount3(Integer dpCount3) {
        this.dpCount3 = dpCount3;
    }

    public Integer getDpCount4() {
        return dpCount4;
    }

    public void setDpCount4(Integer dpCount4) {
        this.dpCount4 = dpCount4;
    }

    public Integer getDpCount5() {
        return dpCount5;
    }

    public void setDpCount5(Integer dpCount5) {
        this.dpCount5 = dpCount5;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
}