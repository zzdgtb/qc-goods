package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName VideosLiveResponse
 * @Author admin
 * @Date 2018/10/26
 * @Version 1.0.0
 */
@Data
@ApiModel(description="开播返回信息")
public class VideosLiveResponse {
    @ApiModelProperty(value="视频ID")
    private Integer id;

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

    @ApiModelProperty(value="推流url")
    private String pushLiveUrl;

    @ApiModelProperty(value="视频编码")
    private String videoCode;

    @ApiModelProperty( value="开播时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginLiveTime;

    @ApiModelProperty( value="结束时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endLiveTime;
}
