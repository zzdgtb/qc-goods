package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName VideoDetailsFollowResponse
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
@ApiModel(description="关注视频返回信息")
public class VideoDetailsFollowResponse {

    @ApiModelProperty(value="用户id")
    private Integer userId;

    @ApiModelProperty(value="视频编码")
    private String videoCode;
}
