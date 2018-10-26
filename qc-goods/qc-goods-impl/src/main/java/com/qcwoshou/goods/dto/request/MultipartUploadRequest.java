package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;


/**
 * 
* 商品模块单图片上传请求参数类
*
 * @author wenwj 
 * @date: 2017年11月23日 上午9:45:25 
* @since 1.0
 */
@Data
public class MultipartUploadRequest{

	@ApiModelProperty(value="图片信息数组")
	@NotNull(message="图片不能为空")
    private MultipartFile[] files;
	@ApiModelProperty(value="上传的文件类型")
	@NotNull(message="上传的文件类型不能为空")
    private Integer type;
}
