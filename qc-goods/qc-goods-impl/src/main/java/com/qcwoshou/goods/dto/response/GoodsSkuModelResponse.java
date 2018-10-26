package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* 商品sku-model返回结果信息类
* @author wenwj 
* @date: 2017年11月30日 上午9:22:38 
* @version 1.4.0
*
 */
@Data
@ApiModel(description="商品sku-model返回结果信息类")
public class GoodsSkuModelResponse {
	@ApiModelProperty(value="sku-model对应ID")
	private Integer id;
	@ApiModelProperty(value="SKU-model名称")
    private String name;
	@ApiModelProperty(value="SKU-model所属商品ID")
    private Integer goodsId;
	@ApiModelProperty(value="SKU-model父ID，顶级父ID：0")
    private Integer pid;
	@ApiModelProperty(value="SKU-model子集列表")
	private List<GoodsSkuModelResponse> childGoodsSkuModelList;
	
	public List<GoodsSkuModelResponse> getChildGoodsSkuModelList(){
		if(this.childGoodsSkuModelList==null){
			this.childGoodsSkuModelList = new ArrayList<GoodsSkuModelResponse>();
		}
		return this.childGoodsSkuModelList;
	}
}
