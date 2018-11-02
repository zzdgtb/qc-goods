package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName VideoDetailsTransmitResponse
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
@ApiModel(description="视频信息转发返回信息")
public class VideoDetailsTransmitResponse {
    @ApiModelProperty(value="视频编码")
    private String videoCode;
}
