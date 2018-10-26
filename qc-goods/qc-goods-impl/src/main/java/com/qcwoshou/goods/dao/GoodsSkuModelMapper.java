package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.GoodsSkuModel;
import com.qcwoshou.goods.model.GoodsSkuModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuModelMapper {
    int countByExample(GoodsSkuModelExample example);

    int deleteByExample(GoodsSkuModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSkuModel record);

    int insertSelective(GoodsSkuModel record);

    List<GoodsSkuModel> selectByExample(GoodsSkuModelExample example);

    GoodsSkuModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSkuModel record, @Param("example") GoodsSkuModelExample example);

    int updateByExample(@Param("record") GoodsSkuModel record, @Param("example") GoodsSkuModelExample example);

    int updateByPrimaryKeySelective(GoodsSkuModel record);

    int updateByPrimaryKey(GoodsSkuModel record);
}