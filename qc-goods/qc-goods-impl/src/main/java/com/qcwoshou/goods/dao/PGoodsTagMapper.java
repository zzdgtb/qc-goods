package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsTag;
import com.qcwoshou.goods.model.PGoodsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PGoodsTagMapper {
    int countByExample(PGoodsTagExample example);

    int deleteByExample(PGoodsTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PGoodsTag record);

    int insertSelective(PGoodsTag record);

    List<PGoodsTag> selectByExample(PGoodsTagExample example);

    PGoodsTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PGoodsTag record, @Param("example") PGoodsTagExample example);

    int updateByExample(@Param("record") PGoodsTag record, @Param("example") PGoodsTagExample example);

    int updateByPrimaryKeySelective(PGoodsTag record);

    int updateByPrimaryKey(PGoodsTag record);
}