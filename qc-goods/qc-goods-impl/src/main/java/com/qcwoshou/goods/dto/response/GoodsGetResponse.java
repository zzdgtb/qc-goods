package com.qcwoshou.goods.dto.response;

import com.qcwoshou.fieldpack.annotations.PackEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
* 获取商品信息返回结果数据信息
* @author wenwj 
* @date: 2017年11月28日 上午11:38:32 
* @version 1.4.0
*
 */
@Data
public class GoodsGetResponse {

	@ApiModelProperty(value="商品ID")
    private Integer id;
	
	@ApiModelProperty(value="商家ID")
    private Integer supplierId;
	
	@PackEntity(cacheKey="supplierName",dbColumn="supplier_name",idFieldName="supplierId",querySql="select supplier_name  from u_supplier_user where supplier_id = ?")
	@ApiModelProperty(value="商家名称")
    private String supplierName;
	
	@ApiModelProperty(value="商品名称")
    private String name;
	
	@ApiModelProperty(value="商品介绍广告语")
    private String adsMessage;
	
	@ApiModelProperty(value="商品分类ID")
    private Integer goodsTypeId;
	
    @PackEntity(cacheKey="goodsTypeName",dbColumn="name",idFieldName="goodsTypeId",querySql="select name  from p_goods_type where id = ?")
	@ApiModelProperty(value="商品分类名称")
    private String goodsTypeName;

	@ApiModelProperty(value="商品品牌ID")
    private Integer brandId;
	
    @PackEntity(cacheKey="brandName",dbColumn="name",idFieldName="brandId",querySql="select name  from brand where id = ?")
	@ApiModelProperty(value="商品品牌名称")
    private String brandName;
	
	@ApiModelProperty(value="库存警告")
    private Byte boughtWarning;
	
	@ApiModelProperty(value="是否首页推荐：0不是，1是")
    private Byte isNew;
    
	@ApiModelProperty(value="商品类型： 0实体商品 ，1虚拟商品")
    private Byte isDelivery;
	
	@ApiModelProperty(value="是否需要实名认证： 0为否 ，1为是")
    private Byte isRealName;

	@ApiModelProperty(value="是否自营商品： 0为否 ，1为是")
    private Byte isOwn;
	
	@ApiModelProperty(value="上架类型：1，立即上架，2，定时上架")
    private Byte shelvesType;
    
	@ApiModelProperty(value="上架时间,时间戳格式")
    private Date shelvesDate;
	
	@ApiModelProperty(value="商品主图")
    private String img;
	
	@ApiModelProperty(value="商品关键字")
    private String seoKeywords;
	
	@ApiModelProperty(value="商品详情")
    private String description;
	
	@ApiModelProperty(value="图片全路径前缀，例：http://qctest.oss-cn-shenzhen.aliyuncs.com")
	private String imgUrlPrix;
	
	@ApiModelProperty(value="商品Sku列表")
	private List<GoodsSkuResponse> goodsSkuList;
	
	@ApiModelProperty(value="商品Sku-Model列表")
	private List<GoodsSkuModelResponse> goodsSkuModelList;
	
	public List<GoodsSkuResponse> getGoodsSkuList(){
		if(this.goodsSkuList==null){
			this.goodsSkuList = new ArrayList<GoodsSkuResponse>();
		}
		return this.goodsSkuList;
	}
	
	public List<GoodsSkuModelResponse> getGoodsSkuModelList(){
		if(this.goodsSkuModelList==null){
			this.goodsSkuModelList = new ArrayList<GoodsSkuModelResponse>();
		}
		return this.goodsSkuModelList;
	}
}
