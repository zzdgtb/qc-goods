package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.GoodsAttr;
import com.qcwoshou.goods.model.GoodsAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsAttrMapper {
    int countByExample(GoodsAttrExample example);

    int deleteByExample(GoodsAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsAttr record);

    int insertSelective(GoodsAttr record);

    List<GoodsAttr> selectByExample(GoodsAttrExample example);

    GoodsAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    int updateByExample(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    int updateByPrimaryKeySelective(GoodsAttr record);

    int updateByPrimaryKey(GoodsAttr record);
}