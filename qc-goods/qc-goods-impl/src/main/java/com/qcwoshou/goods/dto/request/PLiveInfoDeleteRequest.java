package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName PLiveInfoDeleteRequest
 * @Author wh
 * @Date 2018/10/29
 * @Version 1.0.0
 */
@Data
public class PLiveInfoDeleteRequest {

    @ApiModelProperty(value="开播信息id 不能为空")
    @NotNull(message="开播信息id 不能为空")
    private Integer id;
}
