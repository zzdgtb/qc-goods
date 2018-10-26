package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GoodsExportResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = 2470455008187833034L;
	
	@ApiModelProperty(value="任务ID")
	private String taskId;
}
