package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @ClassName 开播
 * @Author admin
 * @Date 2018/10/26
 * @Version 1.0.0
 */
@Data
public class PVideoLiveRequest {

    @ApiModelProperty(value="视频ID")
    private Integer id;

    @ApiModelProperty(value="封面图片 不能为空")
    @NotNull(message="封面图片 不能为空")
    private String mainPicUrl;

    @ApiModelProperty(value="课程名称 不能为空")
    @NotNull( message="课程名称 不能为空")
    private String course;

    @ApiModelProperty(value="科目名称 不能为空")
    @NotNull( message="科目名称 不能为空")
    private String subject;

    @ApiModelProperty(value="班级名称 不能为空")
    @NotNull( message="班级名称 不能为空")
    private String className;

    @ApiModelProperty(value="课程资料")
    private String courseDataUrl;

    @ApiModelProperty(value="开播时间 若不为空则需大于当前时间10分钟")
    //@NotNull( essage="开播时间 不能为空")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginLiveTime;

    @ApiModelProperty(value="结束时间 若开播时间不为空则需大于开始播放时间")
   // @NotNull( message="结束时间 不能为空")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endLiveTime;

    @ApiModelProperty(value="用户id 不能为空")
    @NotNull(message="用户id 不能为空")
    private Integer userid;
}
