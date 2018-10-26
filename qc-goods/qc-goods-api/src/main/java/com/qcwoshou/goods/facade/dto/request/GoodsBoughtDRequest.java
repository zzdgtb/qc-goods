package com.qcwoshou.goods.facade.dto.request;

import com.qcwoshou.core.dto.request.DubboCommonRequest;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author zhouzhiming
 * @Description 获取商品库存请求参数类
 * @Date 17:42 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsBoughtDRequest extends DubboCommonRequest implements Serializable{

	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	
	@NotBlank(message="商品Sku编码不能为空")
	private String skuNumber;
}
