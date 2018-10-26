package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsPic;
import com.qcwoshou.goods.model.PGoodsPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PGoodsPicMapper {
    int countByExample(PGoodsPicExample example);

    int deleteByExample(PGoodsPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PGoodsPic record);

    int insertSelective(PGoodsPic record);

    List<PGoodsPic> selectByExampleWithBLOBs(PGoodsPicExample example);

    List<PGoodsPic> selectByExample(PGoodsPicExample example);

    PGoodsPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PGoodsPic record, @Param("example") PGoodsPicExample example);

    int updateByExampleWithBLOBs(@Param("record") PGoodsPic record, @Param("example") PGoodsPicExample example);

    int updateByExample(@Param("record") PGoodsPic record, @Param("example") PGoodsPicExample example);

    int updateByPrimaryKeySelective(PGoodsPic record);

    int updateByPrimaryKeyWithBLOBs(PGoodsPic record);

    int updateByPrimaryKey(PGoodsPic record);
}