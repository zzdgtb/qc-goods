package com.qcwoshou.goods.facade.dto.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author zhouzhiming
 * @Description 获取商品详情请求结果类
 * @Date 17:44 2018/10/23
 * @Param
 * @return
 **/
public class GoodsDetailsDResponse implements Serializable{

	private static final long serialVersionUID = 2877500785161997266L;

    /**
     * 商品ID
     */
    private Integer goodsId;
    /**
     * 商家ID
     */
    private Integer supplierId;
    /**
     * 商家名称
     */
    private String supplierName;

    /**
     * 是否需要实名： 0为否 ，1为是
     */
    private Integer isRealName;

    /**
     * sku结算价
     */
    private BigDecimal skuBalancePrice;
    /**
     * sku当前价
     */
    private BigDecimal skuCurrentPrice;
    /**
     * sku图片集合
     */
    private List<String> skuImgList;
    /**
     * 默认图片 如果集合图片不为空则取集合第一张，否则取默认图片
     */
    private String skuImg;
    /**
     * 是否使用积分 0不使用 非零使用
     */
    private Integer useScoreFlag;
    /**
     * 能使用积分
     */
    private BigDecimal canUseScore = BigDecimal.ZERO;
    /**
     * 最小购买数量
     */
    private Integer minBookNum;
    /**
     * 最大购买数量
     */
    private Integer maxBookNum;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * sku当前库存
     */
    private Integer skuStock;
    /**
     * 原始价
     */
    private BigDecimal skuOriginPrice;
    /**
     * sku标题
     */
    private String skuTitle;
    /**
     * sku编码
     */
    private String skuNumber;

    public String getIsOnLine() {
        return isOnLine;
    }

    public void setIsOnLine(String isOnLine) {
        this.isOnLine = isOnLine;
    }

    /**
     * 是否上架  1上架 非1下架
     */
    private String isOnLine;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(Integer isRealName) {
        this.isRealName = isRealName;
    }

    public BigDecimal getSkuBalancePrice() {
        return skuBalancePrice;
    }

    public void setSkuBalancePrice(BigDecimal skuBalancePrice) {
        this.skuBalancePrice = skuBalancePrice;
    }

    public BigDecimal getSkuCurrentPrice() {
        return skuCurrentPrice;
    }

    public void setSkuCurrentPrice(BigDecimal skuCurrentPrice) {
        this.skuCurrentPrice = skuCurrentPrice;
    }

    public List<String> getSkuImgList() {
        return skuImgList;
    }

    public void setSkuImgList(List<String> skuImgList) {
        this.skuImgList = skuImgList;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public Integer getUseScoreFlag() {
        return useScoreFlag;
    }

    public void setUseScoreFlag(Integer useScoreFlag) {
        this.useScoreFlag = useScoreFlag;
    }

    public BigDecimal getCanUseScore() {
        return canUseScore;
    }

    public void setCanUseScore(BigDecimal canUseScore) {
        this.canUseScore = canUseScore;
    }

    public Integer getMinBookNum() {
        return minBookNum;
    }

    public void setMinBookNum(Integer minBookNum) {
        this.minBookNum = minBookNum;
    }

    public Integer getMaxBookNum() {
        return maxBookNum;
    }

    public void setMaxBookNum(Integer maxBookNum) {
        this.maxBookNum = maxBookNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getSkuStock() {
        return skuStock;
    }

    public void setSkuStock(Integer skuStock) {
        this.skuStock = skuStock;
    }

    public BigDecimal getSkuOriginPrice() {
        return skuOriginPrice;
    }

    public void setSkuOriginPrice(BigDecimal skuOriginPrice) {
        this.skuOriginPrice = skuOriginPrice;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }
}
