package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName PLiveInfoTransmitRequest
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
public class PLiveInfoTransmitRequest {

    @ApiModelProperty(value="用户id 不能为空")
    @NotNull(message="用户id 不能为空")
    private Integer userId;

    @ApiModelProperty(value="开播信息id 不能为空")
    @NotNull(message="开播信息id 不能为空")
    private Integer liveInfoid;

    @ApiModelProperty(value="转发到（1-微信，2-微博，3-QQ空间，4-QQ） 不能为空")
    @NotNull(message="转发到（1-微信，2-微博，3-QQ空间，4-QQ） 不能为空")
    private Integer destination;
}
