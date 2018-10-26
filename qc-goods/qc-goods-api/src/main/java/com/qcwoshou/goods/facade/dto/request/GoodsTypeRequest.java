package com.qcwoshou.goods.facade.dto.request;

import com.qcwoshou.core.dto.request.DubboCommonRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Author zhouzhiming
 * @Description 获取商品分类信息
 * @Date 17:43 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsTypeRequest extends DubboCommonRequest implements Serializable {

	@NotNull(message="商品ID不能为空")
	private List<Integer> id;
}
