package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @ClassName 新增开播信息
 * @Author wh
 * @Date 2018/10/25
 * @Version 1.0.0
 */
@Data
public class PVideoAddRequest {

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

    @ApiModelProperty(value="开播时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginLiveTime;

    @ApiModelProperty(value="结束时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endLiveTime;

    @ApiModelProperty(value="用户id 不能为空")
    @NotNull(message="用户id 不能为空")
    private Integer userid;
}
