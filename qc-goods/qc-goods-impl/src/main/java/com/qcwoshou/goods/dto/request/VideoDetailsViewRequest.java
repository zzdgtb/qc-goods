package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName VideoDetailsViewRequest
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
public class VideoDetailsViewRequest {

    @ApiModelProperty(value="视频编码")
    @NotNull( message="视频编码 不能为空")
    private String videoCode;
}
