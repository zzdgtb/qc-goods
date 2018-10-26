package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by jiangzufu on 2017/12/13.
 */
@Data
public class GoodsSkuModelVo implements Serializable{
    @ApiModelProperty(value="sku-model对应ID")
    private Integer id;
    @ApiModelProperty(value="SKU-model名称")
    private String name;
    @ApiModelProperty(value="SKU-model所属商品ID")
    private Integer goodsId;
    @ApiModelProperty(value="SKU-model父ID，顶级父ID：0")
    private Integer pid;
}
