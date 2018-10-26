package com.qcwoshou.common;

import com.qcwoshou.core.common.BaseApiCode;

/**
 * @Author zhouzhiming
 * @Description 定义状态码，继承基础状态码类：BaseApiCode
 * @Date 17:55 2018/10/23
 * @Param
 * @return
 **/
public class GoodsApiCode extends BaseApiCode {
	/** 请求参数校验失败*/
	public static final Integer PARAMS_CHECK_FAIL = 10850;
	
	/** 查询商品列表失败*/
	public static final Integer QUERY_GOODS_LIST  = 10801;
	
	/** 查询商品分类列表失败*/
	public static final Integer QUERY_GOODS_TYPE_LIST  = 10802;
	
	/** 新增商品分类失败*/
	public static final Integer ADD_GOODS_TYPE  = 10803;
	
	/** 更新商品分类失败*/
	public static final Integer UPDATE_GOODS_TYPE  = 10804;
	
	/** 删除商品分类失败*/
	public static final Integer DELETE_GOODS_TYPE  = 10805;
	
	/** 查询商品分类详情失败*/
	public static final Integer QUERY_GOODS_TYPE_DETAILS  = 10806;
	
	/** 查询商品标签列表失败*/
	public static final Integer QUERY_GOODS_TAG_LIST  = 10807;
	
	/** 新增商品标签失败*/
	public static final Integer ADD_GOODS_TAG  = 10808;
	
	/** 更新商品标签失败*/
	public static final Integer UPDATE_GOODS_TAG  = 10809;
	
	/** 删除商品标签失败*/
	public static final Integer DELETE_GOODS_TAG  = 10810;
	
	/** 查询商品分类详情失败*/
	public static final Integer QUERY_GOODS_TAG_DETAILS  = 10811;
	
	
	/** 新增商品标签失败*/
	public static final Integer ADD_ATTR  = 10812;	
	/** 更新商品标签失败*/
	public static final Integer UPDATE_ATTR  = 10813;	
	/** 删除商品标签失败*/
	public static final Integer DELETE_ATTR  = 10814;
	/** 查询属性失败*/
	public static final Integer QUERY_ATTR  = 10815;
	/** 更新属性失败*/
	public static final Integer UPDATE_ATTR_VALUE  = 10816;	
	/** 删除属性失败*/
	public static final Integer DELETE_ATTR_VALUE  = 10817;
	/** 查询属性失败*/
	public static final Integer QUERY_ATTR_VALUE  = 10818;
	/** 新增属性失败*/
	public static final Integer ADD_ATTR_VALUE  = 10819;	
	
	//-------------------------------------------10830--->10859---------start---------------------
	/** 商品模块获取用户缓存信息失败*/
	public static final Integer QUERY_GOODS_LOGIN_USER_ERROR = 10830;
	/**更新商品下单量/销量失败*/
	public static final Integer UPDATE_GOODS_STATISTICAL_ERROR = 10830;
	/** 删除商品sku属性模板信息失败，上架状态为已上架*/
	public static final Integer DELETE_GOODS_SKU_MODEL_ERROR = 10849;
	/** 新增商品信息失败*/
	public static final Integer ADD_GOODS = 10851;
	/** 更新商品信息失败*/
	public static final Integer UPDATE_GOODS = 10852;
	/** 获取商品信息失败*/
	public static final Integer GET_GOODS = 10853;
	/** 删除商品信息失败*/
	public static final Integer DELETE_GOODS = 10854;
	/** 新增商品sku-model信息失败*/
	public static final Integer ADD_GOODS_SKU = 10855;
	/** 删除商品sku-model信息失败*/
	public static final Integer DELETE_GOODS_SKU = 10856;
	/** 新增商品信息失败，定时上架设置时间为空*/
	public static final Integer SHELVESDATE_IS_NULL = 10856;
	/** 更新商品信息失败，上架状态异常*/
	public static final Integer UPDATE_GOODS_IS_ONLIVE_ONE_ERROR = 10857;
	/** 删除商品信息失败，上架状态为已上架*/
	public static final Integer DELETE_GOODS_IS_ONLIVE_ONE_ERROR = 10858;
	/** 添加商品sku属性模板信息失败，上架状态为已上架*/
	public static final Integer ADD_GOODS_SKU_MODEL_ERROR = 10859;
	

	//-------------------------------------------10830--->10859---------end---------------------
	
	/** 查询商品品牌信息失败*/
	public static final Integer QUERY_BRAND_LIST = 10860;
	
	/** 查询商品品牌详情失败*/
	public static final Integer QUERY_BRAND_INFO = 10861;
	
	/** 删除商品品牌详情失败*/
	public static final Integer DELETE_BRAND_INFO = 10862;
	
	/** 保存商品品牌详情失败*/
	public static final Integer SAVE_BRAND_INFO = 10862;
	
	/** 查询商品列表失败*/
	public static final Integer QUERY_GOODS_DETAILS  = 10863;
	
	/** 商品绑定标签*/
	public static final Integer GOODS_BIND_TAG  = 10864;
	
	/** 商品绑定属性*/
	public static final Integer GOODS_BIND_ATTR  = 10865;
	
	/** 商品标签关联关系*/
	public static final Integer GOODS_TAG_RELATION  = 10866;
	
	/** 商品属性关联关系*/
	public static final Integer GOODS_ATTR_RELATION  = 10867;
	
	/** 商品sku model已经存在*/
	public static final Integer GOODS_SKU_MODEL_EXITS_ERROR = 10868;
	
	/** 商品导出异常*/
	public static final Integer GOODS_EXPORT_ERROR = 10869;
	
	/**商品已下架**/
	public static final Integer GOODS_IS_OFFLINE = 10870;

	//-------------------------------------------vedio---10871--->10899------------------------------
	/**直播开始时间未大于当前时间10分钟**/
	public static final Integer VEDIOS_BEGIN_LIVETIME_TOO_SMALL = 10871;

	/**直播结束时间不能为空且要大于直播开始时间**/
	public static final Integer VEDIOS_END_LIVETIME_IS_NULL = 10872;
	
	/**
	 * 静态代码块，自定义编码需加入map
	 */
	static {
		zhMsgMap.put(PARAMS_CHECK_FAIL,"请求参数校验失败");
		zhMsgMap.put(QUERY_GOODS_LIST, "查询商品列表失败");
		zhMsgMap.put(QUERY_GOODS_TYPE_LIST, "查询商品分类列表失败");
		zhMsgMap.put(ADD_GOODS_TYPE, "新增商品分类失败");
		zhMsgMap.put(UPDATE_GOODS_TYPE, "更新商品分类失败");
		zhMsgMap.put(DELETE_GOODS_TYPE, "删除商品分类失败");
		zhMsgMap.put(QUERY_GOODS_TYPE_DETAILS, "查询商品分类详情失败");
		zhMsgMap.put(QUERY_GOODS_TAG_LIST, "查询商品标签列表失败");
		zhMsgMap.put(ADD_GOODS_TAG, "新增商品标签失败");
		zhMsgMap.put(UPDATE_GOODS_TAG, "更新商品标签失败");
		zhMsgMap.put(DELETE_GOODS_TAG, "删除商品标签失败");
		zhMsgMap.put(QUERY_GOODS_TAG_DETAILS, "查询商品标签详情失败");
		zhMsgMap.put(QUERY_GOODS_DETAILS, "查询商品详情失败");
		
		zhMsgMap.put(ADD_ATTR, "新增属性失败");
		zhMsgMap.put(UPDATE_ATTR, "更新属性失败");
		zhMsgMap.put(DELETE_ATTR, "删除属性失败");
		zhMsgMap.put(QUERY_ATTR, "查询属性失败");
		zhMsgMap.put(ADD_ATTR_VALUE, "新增属性值失败");
		zhMsgMap.put(UPDATE_ATTR_VALUE, "更新属性值失败");
		zhMsgMap.put(DELETE_ATTR_VALUE, "删除属性值失败");
		zhMsgMap.put(QUERY_ATTR_VALUE, "查询属性值失败");
		
		zhMsgMap.put(QUERY_GOODS_LOGIN_USER_ERROR, "商品模块获取用户缓存信息失败");
		zhMsgMap.put(UPDATE_GOODS_STATISTICAL_ERROR, "更新商品下单量/销量失败");
		zhMsgMap.put(ADD_GOODS, "新增商品信息失败");
		zhMsgMap.put(UPDATE_GOODS, "更新商品信息失败");
		zhMsgMap.put(GET_GOODS, "获取商品信息失败");
		zhMsgMap.put(DELETE_GOODS, "删除商品信息失败");
		zhMsgMap.put(ADD_GOODS_SKU, "新增商品sku-model信息失败");
		zhMsgMap.put(DELETE_GOODS_SKU, "删除商品sku-model信息失败");
		zhMsgMap.put(SHELVESDATE_IS_NULL, "新增商品信息失败，定时上架设置时间为空");
		zhMsgMap.put(UPDATE_GOODS_IS_ONLIVE_ONE_ERROR, "更新商品信息失败，已上架商品不能更新");
		zhMsgMap.put(DELETE_GOODS_IS_ONLIVE_ONE_ERROR, "删除商品信息失败，已上架商品不能删除");
		zhMsgMap.put(ADD_GOODS_SKU_MODEL_ERROR, "添加商品sku属性模板信息失败，上架状态为已上架");
		zhMsgMap.put(DELETE_GOODS_SKU_MODEL_ERROR, "删除商品sku属性模板信息失败，上架状态为已上架");
		zhMsgMap.put(GOODS_SKU_MODEL_EXITS_ERROR, "商品sku属性模板已经存在了");
		
		zhMsgMap.put(QUERY_BRAND_LIST, "查询商品品牌信息失败");
		zhMsgMap.put(QUERY_BRAND_INFO, "查询商品品牌详情失败");
		zhMsgMap.put(DELETE_BRAND_INFO, "删除商品品牌详情失败");
		zhMsgMap.put(SAVE_BRAND_INFO, "保存商品品牌详情失败");		
		zhMsgMap.put(GOODS_BIND_TAG, "商品绑定标签失败");
		zhMsgMap.put(GOODS_BIND_ATTR, "商品绑定属性失败");
		zhMsgMap.put(GOODS_TAG_RELATION, "商品标签关联关系失败");
		zhMsgMap.put(GOODS_ATTR_RELATION, "商品属性关联关系失败");
		zhMsgMap.put(GOODS_EXPORT_ERROR, "商品导出失败");
		zhMsgMap.put(GOODS_IS_OFFLINE, "商品已下架");

		//-------------------------------videos--------------------------------------
		zhMsgMap.put(VEDIOS_BEGIN_LIVETIME_TOO_SMALL, "开播失败，直播开始时间未大于当前时间10分钟");

		zhMsgMap.put(VEDIOS_END_LIVETIME_IS_NULL, "开播失败，直播结束时间不能为空且要大于直播开始时间");

	}
}
