package com.qcwoshou.goods.model;

public class PGoodsPic {
    private Long id;

    private Long goodId;

    private String skuNumber;

    private String imageJsonArray;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber == null ? null : skuNumber.trim();
    }

    public String getImageJsonArray() {
        return imageJsonArray;
    }

    public void setImageJsonArray(String imageJsonArray) {
        this.imageJsonArray = imageJsonArray == null ? null : imageJsonArray.trim();
    }
}