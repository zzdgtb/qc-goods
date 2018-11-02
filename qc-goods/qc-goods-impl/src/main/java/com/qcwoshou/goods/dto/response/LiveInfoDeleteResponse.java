package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName VideosDeleteResponse
 * @Author wh
 * @Date 2018/10/31
 * @Version 1.0.0
 */
@Data
@ApiModel(description="开播信息删除返回信息")
public class LiveInfoDeleteResponse implements Serializable {

    @ApiModelProperty(value="被删除开播信息ID")
    private Integer id;
}
