package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AppBrandResponse implements Serializable{
	

	/**
	*/
	private static final long serialVersionUID = -3539139222575123236L;

	@ApiModelProperty("ID")
	private Integer id;
	@ApiModelProperty("品牌名称")
    private String name;
	@ApiModelProperty("品牌logo")
    private String logo;
	@ApiModelProperty("用于限时促销模块展示的品牌促销图片")
    private String brandPromoteLogo;
	@ApiModelProperty("排序")
    private Integer sort;
	@ApiModelProperty("所属的商品分类，用于前台分类展示用")
    private Integer shopCateId;
	@ApiModelProperty("是否参与品牌限时促销的标识")
    private Boolean brandPromote;
	@ApiModelProperty("限时促销开始时间")
    private Integer beginTime;
	@ApiModelProperty("限时促销结束时间")
    private Integer endTime;
	@ApiModelProperty("0:已上线 1:未上线 2:已过期")
    private Boolean timeStatus;
	@ApiModelProperty("品牌订阅数量")
    private Integer dyCount;
    @ApiModelProperty("品牌简介")
    private String brief;
    @ApiModelProperty("检索标签")
    private String tag;
    private String tagMatch;

    private String tagMatchRow;
}
