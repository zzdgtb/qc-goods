package com.qcwoshou.goods.facade.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author zhouzhiming
 * @Description 商品分类信息
 * @Date 17:42 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsTypeSelectMapResponse implements Serializable{/**
	*/
	private static final long serialVersionUID = 558196254675193569L;

	private Map<Integer, List<GoodsTypeSelectResponse>> goodsTypeMap;
    
}
