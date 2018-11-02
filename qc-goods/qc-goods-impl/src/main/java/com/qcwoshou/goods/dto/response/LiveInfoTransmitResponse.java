package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName LiveInfoTransmitResponse
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
@ApiModel(description="开播信息转发返回信息")
public class LiveInfoTransmitResponse {

    @ApiModelProperty(value="开播信息ID")
    private Integer id;
}
