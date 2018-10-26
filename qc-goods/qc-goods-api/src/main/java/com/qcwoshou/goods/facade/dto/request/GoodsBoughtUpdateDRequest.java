package com.qcwoshou.goods.facade.dto.request;

import com.qcwoshou.core.dto.request.DubboCommonRequest;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author zhouzhiming
 * @Description 更新商品库存请求参数类
 * @Date 17:42 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsBoughtUpdateDRequest extends DubboCommonRequest implements Serializable {

	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	
	@NotBlank(message="商品Sku编码不能为空")
	private String skuNumber;
	
	@NotNull(message="更新操作类型不能为空：1扣减库存 2 返回库存")
	private Integer type;
	
	@NotNull(message="购买数量不能为空")
	private Integer count;
}
