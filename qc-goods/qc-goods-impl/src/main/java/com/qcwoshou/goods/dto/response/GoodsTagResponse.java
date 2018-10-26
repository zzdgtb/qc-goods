package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GoodsTagResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = -9056375064913721117L;
	
	@ApiModelProperty("ID")
	private Integer id;
	
	@ApiModelProperty("标签名")
	private String tagName;
}
