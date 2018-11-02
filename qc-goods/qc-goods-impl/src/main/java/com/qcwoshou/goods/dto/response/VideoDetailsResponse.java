package com.qcwoshou.goods.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

import static org.apache.coyote.http11.Constants.a;

/**
 * @ClassName VideoDetailsResponse
 * @Author wh
 * @Date 2018/11/2
 * @Version 1.0.0
 */
@Data
@ApiModel(description="视频列表返回信息")
public class VideoDetailsResponse {

    @ApiModelProperty(value="视频详情ID")
    private Integer id;

    @ApiModelProperty(value="视频编码")
    private String videoCode;

    @ApiModelProperty(value="开播信息ID")
    private Integer liveInfoId;

    @ApiModelProperty(value="创建人（老师）ID")
    private Integer createUserId;

    @ApiModelProperty(value="是否已结束直播")
    private Integer isEndLive;

    @ApiModelProperty(value="实际开播时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date realBeginLivetime;

    @ApiModelProperty(value="实际开播结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date realEndLivetime;

    @ApiModelProperty(value="封面图片")
    private String mainPicUrl;

    @ApiModelProperty(value="课程名称")
    private String course;

    @ApiModelProperty(value="科目名称")
    private String subject;

    @ApiModelProperty(value="班级名称")
    private String className;

    @ApiModelProperty(value="课程资料")
    private String courseDataUrl;

    @ApiModelProperty(value="开播时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date beginLiveTime;

    @ApiModelProperty(value="结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endLiveTime;

}
