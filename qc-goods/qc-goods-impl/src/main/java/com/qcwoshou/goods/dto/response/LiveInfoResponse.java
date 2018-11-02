package com.qcwoshou.goods.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName LiveInfoResponse
 * @Author wh
 * @Date 2018/10/29
 * @Version 1.0.0
 */
@Data
@ApiModel(description="开播列表返回信息")
public class LiveInfoResponse implements Serializable {
    @ApiModelProperty(value="开播信息ID")
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

    @ApiModelProperty(value="开播时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date beginLiveTime;

    @ApiModelProperty(value="结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endLiveTime;

    @ApiModelProperty(value="创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty(value="状态")
    private String status;
}
