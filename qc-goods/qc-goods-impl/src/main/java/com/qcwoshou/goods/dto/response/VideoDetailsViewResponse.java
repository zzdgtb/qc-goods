package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName VideoDetailsViewResponse
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Data
@ApiModel(description="查看视频详情返回信息")
public class VideoDetailsViewResponse {

    @ApiModelProperty(value="视频详情ID")
    private Long id;
    @ApiModelProperty(value="视频编码")
    private String videoCode;
    @ApiModelProperty(value="对应开播信息id")
    private Long liveInfoId;
    @ApiModelProperty(value="播放地址")
    private String playUrl;
}
