package com.qcwoshou.goods.facade.dto.request;

import com.qcwoshou.core.dto.request.DubboCommonRequest;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author zhouzhiming
 * @Description 更新商品下单量及销量</ br>
 *  type =1,更新下单量，type=2,更新销量
 * @Date 17:41 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsStatisticalUpdateRequest extends DubboCommonRequest implements Serializable{

	private static final long serialVersionUID = 3932137785907308657L;
	
	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	@NotBlank(message="商品SKU编码不能为空")
	private String skuNumber;
	@NotNull(message="数量不能为空")
	@Min(value=1,message="数量必须大于0")
	private Integer count;
	@NotNull(message="操作类型不能为空，type =1,更新下单量，type=2,更新销量")
	private Integer type;

}
