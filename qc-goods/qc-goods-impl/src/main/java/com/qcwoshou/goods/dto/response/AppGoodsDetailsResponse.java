package com.qcwoshou.goods.dto.response;

import com.qcwoshou.fieldpack.annotations.PackEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 
* 功能描述: app商品详情返回信息
* @author: xiongkun
* @date: 2017年11月28日 下午2:39:14
 */
@Data
public class AppGoodsDetailsResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = -2590664884036374498L;
	
	@ApiModelProperty(value="一级分类ID")
	private Integer firstGoodsTypeId;
	@ApiModelProperty(value="商品ID")
	private Integer id;
	@ApiModelProperty(value="商品编号")
    private String dealNum;
	@ApiModelProperty(value="商品名")
    private String name;
	@ApiModelProperty(value="商品详情信息")
    private String description;
	@ApiModelProperty(value="商家ID")
    private Integer supplierId;
	@PackEntity(cacheKey="supplierName",dbColumn="supplier_name",idFieldName="supplierId",querySql="select supplier_name  from u_supplier_user where supplier_id = ?")
	@ApiModelProperty(value="商家名称")
    private String supplierName;
	@ApiModelProperty(value="商品分类ID")
    private Integer goodsTypeId;
	@ApiModelProperty(value="商品主图")
    private String img;
	@ApiModelProperty(value="实体商品 0为实体商品 1为虚拟商品")
    private Byte isDelivery;	
	@ApiModelProperty(value="是否自营 0为否；1为是")
    private Byte isOwn;
	@ApiModelProperty(value="当前售价")
	private BigDecimal currentPrice = BigDecimal.ZERO;
	@ApiModelProperty(value="真实商品总销量")
	private Integer buyCountTotal = 0;
	@ApiModelProperty(value="商品最高销量 用作APP列表显示 有随机数保底")
	private Integer buyCountMax  = 0;
	@ApiModelProperty(value="商品广告语")
	private String adsMessage;	
	@ApiModelProperty(value="sku")
	private List<AppGoodsSkuResponse> sku;
	@ApiModelProperty(value="sku模板")
	private List<AppGoodsSkuModelResponse> skuModelList;
	@ApiModelProperty(value="商品标签")
	private List<AppGoodsTagResponse> tag;
}
