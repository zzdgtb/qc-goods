package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.facade.dto.response.GoodsTypeSelectResponse;
import com.qcwoshou.goods.model.GoodsSku;
import com.qcwoshou.goods.model.PGoodsTag;
import com.qcwoshou.goods.model.custom.GoodsWithSupplierInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsManualMapper {

	/**
	 * 
	* 功能描述: 大后台商品列表
	* @author: xiongkun
	* @date: 2017年11月28日 下午3:24:58 
	* @param request
	* @return
	 */
    List<GoodsResponse> selectListByCondition(GoodsListRequest request);
    
    /**
	 * 
	* 功能描述: 大后台商品导出列表
	* @author: xiongkun
	* @date: 2017年11月28日 下午3:24:58 
	* @param request
	* @return
	 */
    List<GoodsExportQueryResponse> selectExportList(GoodsExportQueryRequest request);
    
    /**
	 * 
	* 功能描述: app商品列表
	* @author: xiongkun
	* @date: 2017年11月28日 下午3:24:58 
	* @param request
	* @return
	 */
    List<AppGoodsListResponse> selectAppListByCondition(AppGoodsListRequest request);
    
    /**
	 * 
	* 功能描述: app搜索商品列表
	* @author: xiongkun
	* @date: 2017年11月30日 下午3:24:58 
	* @param request
	* @return
	 */
    List<AppGoodsListResponse> selectAppSearchListByCondition(AppGoodsSearchListRequest request);
    
    /**
   	 * 
   	* 功能描述: app搜索商品列表
   	* @author: xiongkun
   	* @date: 2017年11月30日 下午3:24:58 
   	* @param request
   	* @return
   	 */
    List<AppGoodsListResponse> selectAppHomeNewListByCondition(AppGoodsHomeNewListRequest request);
    
    /**
	 * 
	* 功能描述: 根据商品ID查询商品标签
	* @author: xiongkun
	* @date: 2017年11月28日 下午3:24:58 
	* @param goodsId
	* @return
	 */
    List<PGoodsTag> selectGoodsTagByGoodsId(Integer goodsId);

	/**
	 * 获取商品，商家信息
	 * @param goodsId
	 * @return
     */
	GoodsWithSupplierInfoVo selectSupplierAndGoodsInfo(Integer goodsId);
	
	/**
	 * 
	* 功能描述: <br>
	* @author: xiongkun
	* @date: 2017年12月8日 上午10:53:47 
	* @param goodsIds
	* @return
	 */
	List<GoodsTypeSelectResponse> selectGoodsType(@Param("goodsIds") List<Integer> goodsIds);
	
	/**
	 * 
	* 功能描述: 商品标签关联关系
	* @author: xiongkun
	* @date: 2017年12月8日 上午10:53:47 
	* @param goodsId
	* @return
	 */
	List<GoodsTagRelationResponse> selectGoodsTagRelation(Integer goodsId);
	
	/**
	 * 
	* 功能描述: 商品属性值关联关系
	* @author: xiongkun
	* @date: 2017年12月8日 上午10:53:47 
	* @param goodsId
	* @return
	 */
	List<TypeAttrValueResponse> selectGoodsAttrValueRelation(@Param("goodsId") Integer goodsId, @Param("attributeId") Integer attributeId);

	/**
	 * 通过商品id
	 * @param goodsId 商品id
	 * @param skuNumber skuNumber
     * @return
     */
	GoodsSku selectGoodsStockByGoodsIdAndSkuNumber(@Param("goodsId") Integer goodsId, @Param("skuNumber") String skuNumber);
	
	/**
	 * 
	 * 功能描述: 根据商品ID删除商品(软删除，更新is_delete=1)<br>
	 * @author: wenwj
	 * @date: 2017年12月21日 上午10:39:29 
	 * @version 1.4.0
	 * @param id 商品ID
	 */
	void deleteGoodsById(@Param("id") Integer id);
	
	/**
	 * 
	 * 功能描述: 更新符合定时上架商品状态为：已上架<br>
	 * @author: wenwj
	 * @date: 2017年12月21日 上午11:37:17 
	 * @version 1.4.0
	 * @return 上架条数
	 */
	int updateGoodsShelvesed();
}