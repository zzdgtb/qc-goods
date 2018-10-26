package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.BrandGoodsType;
import com.qcwoshou.goods.model.BrandGoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandGoodsTypeMapper {
    int countByExample(BrandGoodsTypeExample example);

    int deleteByExample(BrandGoodsTypeExample example);

    int insert(BrandGoodsType record);

    int insertSelective(BrandGoodsType record);

    List<BrandGoodsType> selectByExample(BrandGoodsTypeExample example);

    int updateByExampleSelective(@Param("record") BrandGoodsType record, @Param("example") BrandGoodsTypeExample example);

    int updateByExample(@Param("record") BrandGoodsType record, @Param("example") BrandGoodsTypeExample example);
}