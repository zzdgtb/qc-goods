package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PVideo;
import com.qcwoshou.goods.model.PVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PVideoMapper {
    int countByExample(PVideoExample example);

    int deleteByExample(PVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PVideo record);

    int insertSelective(PVideo record);

    List<PVideo> selectByExampleWithBLOBs(PVideoExample example);

    List<PVideo> selectByExample(PVideoExample example);

    PVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PVideo record, @Param("example") PVideoExample example);

    int updateByExampleWithBLOBs(@Param("record") PVideo record, @Param("example") PVideoExample example);

    int updateByExample(@Param("record") PVideo record, @Param("example") PVideoExample example);

    int updateByPrimaryKeySelective(PVideo record);

    int updateByPrimaryKeyWithBLOBs(PVideo record);

    int updateByPrimaryKey(PVideo record);
}