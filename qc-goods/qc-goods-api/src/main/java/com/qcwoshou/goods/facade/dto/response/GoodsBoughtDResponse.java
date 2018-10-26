package com.qcwoshou.goods.facade.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询sku库存信息
 */
@Data
public class GoodsBoughtDResponse implements Serializable{
    private Integer goodsId;
    private String skuNumber;
    private Integer stock;
}
