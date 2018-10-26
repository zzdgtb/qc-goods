package com.qcwoshou.goods.facade.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhouzhiming
 * @Description 商品分类信息
 * @Date 17:42 2018/10/23
 * @Param
 * @return
 **/
@Data
public class GoodsTypeSelectResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = 221447618913818427L;
	/**
	 * 商品id
	 */
	private Integer goodsId;
	/**
	 * 分类id
	 */
	private Integer id;	
	/**
	 * 父id
	 */
	private Integer pid;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 层级
     */
    private Byte level;
    
}
