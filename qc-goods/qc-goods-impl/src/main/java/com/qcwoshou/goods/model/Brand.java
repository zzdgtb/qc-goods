package com.qcwoshou.goods.model;

public class Brand {
    private Integer id;

    private String name;

    private String logo;

    private String brandPromoteLogo;

    private Integer sort;

    private Integer shopCateId;

    private Boolean brandPromote;

    private Integer beginTime;

    private Integer endTime;

    private Boolean timeStatus;

    private Integer dyCount;

    private Integer isDelete;

    private Integer useId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBrandPromoteLogo() {
        return brandPromoteLogo;
    }

    public void setBrandPromoteLogo(String brandPromoteLogo) {
        this.brandPromoteLogo = brandPromoteLogo == null ? null : brandPromoteLogo.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getShopCateId() {
        return shopCateId;
    }

    public void setShopCateId(Integer shopCateId) {
        this.shopCateId = shopCateId;
    }

    public Boolean getBrandPromote() {
        return brandPromote;
    }

    public void setBrandPromote(Boolean brandPromote) {
        this.brandPromote = brandPromote;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Boolean getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(Boolean timeStatus) {
        this.timeStatus = timeStatus;
    }

    public Integer getDyCount() {
        return dyCount;
    }

    public void setDyCount(Integer dyCount) {
        this.dyCount = dyCount;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }
}