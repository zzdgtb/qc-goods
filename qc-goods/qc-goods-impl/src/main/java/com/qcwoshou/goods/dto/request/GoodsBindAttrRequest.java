package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 
 * 功能描述: 商品绑定属性请求类
 * 
 * @author: xiongkun
 * @date: 2017年11月30日 下午4:30:32
 */
@Data
public class GoodsBindAttrRequest {

	@ApiModelProperty(value = "商品ID 不能为空")
	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	@ApiModelProperty(value = "属性值 不能为空")
	@NotNull(message="属性值不能为空")
	private List<TypeAttrValueBindRequest> attrValues;

	

}
