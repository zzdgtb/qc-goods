package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.GoodsSku;
import com.qcwoshou.goods.model.GoodsSkuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuMapper {
    int countByExample(GoodsSkuExample example);

    int deleteByExample(GoodsSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSku record);

    int insertSelective(GoodsSku record);

    List<GoodsSku> selectByExample(GoodsSkuExample example);

    GoodsSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByExample(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByPrimaryKeySelective(GoodsSku record);

    int updateByPrimaryKey(GoodsSku record);
}