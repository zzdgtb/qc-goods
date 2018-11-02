package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PTransmit;
import com.qcwoshou.goods.model.PTransmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PTransmitMapper {
    int countByExample(PTransmitExample example);

    int deleteByExample(PTransmitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PTransmit record);

    int insertSelective(PTransmit record);

    List<PTransmit> selectByExample(PTransmitExample example);

    PTransmit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PTransmit record, @Param("example") PTransmitExample example);

    int updateByExample(@Param("record") PTransmit record, @Param("example") PTransmitExample example);

    int updateByPrimaryKeySelective(PTransmit record);

    int updateByPrimaryKey(PTransmit record);
}