package com.qcwoshou.goods.dao.custom;

import com.qcwoshou.goods.model.PGoodsStatistical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
* 功能描述: 商品统计
* @author: xiongkun
* @date: 2017年12月1日 下午5:16:19
 */
public interface PGoodsStatisticalManualMapper {

	/**
	 * 
	* 功能描述: 销量统计
	* @author: xiongkun
	* @date: 2017年12月1日 下午5:16:04 
	* @param record
	* @return
	 */
    Integer selectBuyCount(PGoodsStatistical record);
    
    /**
     * 
     * 功能描述: 批量新增商品sku统计信息：下单量、销量<br>
     * @author: wenwj
     * @date: 2017年12月23日 下午4:17:31 
     * @version 1.4.0
     * @param gsList
     * @return
     */
    int insertByBatch(@Param("gsAddlist") List<PGoodsStatistical> gsAddList);
    
    /**
     * 
     * 功能描述: 批量更新商品sku统计信息：下单量、销量<br>
     * @author: wenwj
     * @date: 2017年12月23日 下午4:18:39 
     * @version 1.4.0
     * @param gsUpdateList
     * @return
     */
    int updateByBatch(@Param("gsUpdateList") List<PGoodsStatistical> gsUpdateList);
}