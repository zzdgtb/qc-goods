package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName PLiveInfoViewRequest
 * @Author admin
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
public class PLiveInfoViewRequest {
    @ApiModelProperty(value="开播信息ID")
    @NotNull(message="封面图片 不能为空")
    private Integer id;
}
