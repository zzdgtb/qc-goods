package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

/**
 * 商品模块单图片上传请求参数类
*
 * @author wenwj 
 * @date: 2017年11月23日 上午9:44:54 
* @since 1.4.0
 */
@Data
public class GoodsFileUploadRequest  {
	@ApiModelProperty(value="图片信息")
	@NotNull(message="图片不能为空")
    private MultipartFile file;
	@ApiModelProperty(value="上传的文件类型")
	@NotNull(message="上传的文件类型不能为空")
    private Integer type;
	@ApiModelProperty(value="是否需要覆盖上次上传图片:0,否，1，是")
    private boolean isRepeatUpload;
	@ApiModelProperty(value="需要覆盖的图片url")
    private String imgUrl;

}
