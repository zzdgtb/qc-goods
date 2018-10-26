package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.Brand;
import com.qcwoshou.goods.model.BrandExample;
import com.qcwoshou.goods.model.BrandWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandWithBLOBs record);

    int insertSelective(BrandWithBLOBs record);

    List<BrandWithBLOBs> selectByExampleWithBLOBs(BrandExample example);

    List<Brand> selectByExample(BrandExample example);

    BrandWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExampleWithBLOBs(@Param("record") BrandWithBLOBs record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(BrandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BrandWithBLOBs record);

    int updateByPrimaryKey(Brand record);
}