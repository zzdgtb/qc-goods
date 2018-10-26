package com.qcwoshou.goods.dao.custom;

import com.qcwoshou.goods.model.GoodsSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
* 自定义商品sku数据操作类
* @author wenwj 
* @date: 2017年11月29日 下午5:12:46 
* @version 1.4.0
*
 */
public interface GoodsSkuManualMapper {

	/**
	 * 
	 * 功能描述: 批量根据主键id更新对应数据<br>
	 * @author: wenwj
	 * @date: 2017年11月29日 下午5:13:05 
	 * @version 1.4.0
	 * @param records
	 * @return
	 */
    int updateBatchByPrimaryKeySelective(@Param("goodsSkuList") List<GoodsSku> goodsSkuList);

    /**
     * 
     * 功能描述: 批量插入sku数据<br>
     * @author: wenwj
     * @date: 2017年12月1日 下午2:14:06 
     * @version 1.4.0
     * @param goodsSkuList
     * @return
     */
    int insertByBatch(@Param("goodsSkuList") List<GoodsSku> goodsSkuList);
}