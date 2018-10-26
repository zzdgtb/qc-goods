package com.qcwoshou.goods.model.custom;

import lombok.Data;

/**商品信息附带商家信息
 * Created by jiangzufu on 2017/12/6.
 */
@Data
public class GoodsWithSupplierInfoVo {
    private Integer id;
    private String name;
    private Integer supplierId;
    private String  supplierName;
    private String  img;
    private Integer goodsTypeId;
    private Integer isDelivery;
    private Integer isOnlive;
    private Integer isDelete;
    private Integer isNew;
    private Integer brandId;
    private Integer publishWait;
    private Integer isRealName;
}
