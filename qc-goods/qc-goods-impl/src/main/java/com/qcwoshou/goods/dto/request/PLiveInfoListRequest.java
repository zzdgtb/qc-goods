package com.qcwoshou.goods.dto.request;

import com.qcwoshou.core.common.constants.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName PLiveInfoListRequest
 * @Author wh
 * @Date 2018/10/29
 * @Version 1.0.0
 */
@Data
public class PLiveInfoListRequest {

    @ApiModelProperty(value="用户id 不能为空")
    @NotNull(message="用户id 不能为空")
    private Integer userId;

    @ApiModelProperty(value="直播状态")
    private String status;

    /** 当前页 */
    @ApiModelProperty(value="当前分页数，默认：1")
    private Integer page = Constants.DEFAULT_PAGE;
    /** 每页记录数 */
    @ApiModelProperty(value="当前分页条数，默认：20")
    private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;
}
