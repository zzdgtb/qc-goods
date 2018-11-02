package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName VideoDetailsLikeRequest
 * @Author wh
 * @Date 2018/11/2
 * @Version 1.0.0
 */
@Data
public class VideoDetailsLikeRequest {
    @ApiModelProperty(value="用户id 不能为空")
    @NotNull(message="用户id 不能为空")
    private Integer userId;

    @ApiModelProperty(value="视频编码 不能为空")
    @NotNull(message="视频编码 不能为空")
    private String videoCode;
}
