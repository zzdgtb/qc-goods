package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
* 更新商品请求参数类
* @author wenwj 
* @date: 2017年11月28日 上午9:17:58 
* @version 1.4.0
*
 */
@Data
public class GoodsUpdateRequest {

	@ApiModelProperty(value="商品ID")
	@NotNull(message="商品ID不能为空")
    private Integer id;
	
	@ApiModelProperty(value="商家ID,必填")
	@NotNull(message="商家不能为空")
    private Integer supplierId;
	
	@ApiModelProperty(value="商品名称,必填")
	@NotBlank(message="商品名称不能为空")
    private String name;
	
	@ApiModelProperty(value="商品介绍广告语")
    private String adsMessage = "";
	
	@ApiModelProperty(value="商品分类ID,必填")
	@NotNull(message="商品分类不能为空")
    private Integer goodsTypeId;

	@ApiModelProperty(value="商品品牌ID,必填")
	@NotNull(message="商品品牌不能为空")
    private Integer brandId;
	
	@ApiModelProperty(value="库存警告，默认：10")
    private Byte boughtWarning;
	
	@ApiModelProperty(value="是否首页推荐：0不是，1是,必填")
	@NotNull(message="是否首页推荐不能为空")
    private Byte isNew;
    
	@ApiModelProperty(value="商品类型： 0实体商品 ，1虚拟商品,必填")
	@NotNull(message="商品类型不能为空")
    private Byte isDelivery;
	
	@ApiModelProperty(value="是否需要实名认证： 0为否 ，1为是,必填")
	@NotNull(message="是否需要实名认证不能为空")
    private Byte isRealName;

	@ApiModelProperty(value="是否自营商品： 0为否 ，1为是,必填")
	@NotNull(message="是否自营商品不能为空")
    private Byte isOwn;
	
	@ApiModelProperty(value="上架类型：1，立即上架，2，定时上架,必填")
	@NotNull(message="是否自营商品不能为空")
    private Byte shelvesType;
    
	@ApiModelProperty(value="上架时间,前端参数传13位时间戳格式，立即上架不需填写，定时上架时必填")
    private Date shelvesDate;
	
	@ApiModelProperty(value="商品主图,必填")
	@NotBlank(message="商品主图不能为空")
    private String img;
	
	@ApiModelProperty(value="商品关键字，非必填")
    private String seoKeywords;
	
	@ApiModelProperty(value="商品详情，非必填")
    private String description;
	
	@ApiModelProperty(value="sku列表信息，非必填")
	@Valid
	private List<GoodsSkuRequest> skuList;
	
	@ApiModelProperty(value="当前售价")
	private BigDecimal currentPrice;
	
	@ApiModelProperty(value="是否提交审核：0，否，1，是，非必填，默认：0")
	private Byte isSubmit = 0;
}
