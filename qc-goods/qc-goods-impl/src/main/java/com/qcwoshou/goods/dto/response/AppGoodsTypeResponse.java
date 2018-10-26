package com.qcwoshou.goods.dto.response;

import com.qcwoshou.goods.model.PGoodsTypeAds;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class AppGoodsTypeResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = 7266260201927748661L;
	
	@ApiModelProperty("订单ID")
	private Integer id;
	@ApiModelProperty("父级ID")
    private Integer pid;
	@ApiModelProperty("分类名")
    private String name;
	@ApiModelProperty("排序")
    private Integer sort;
    @ApiModelProperty("图标")
    private String icon;
    @ApiModelProperty("分类层级")
    private Byte level;
    @ApiModelProperty("分类广告")
    private List<PGoodsTypeAds> adsList;
    @ApiModelProperty("子分类")
    private List<AppGoodsTypeResponse> typeChildList;
    
}
