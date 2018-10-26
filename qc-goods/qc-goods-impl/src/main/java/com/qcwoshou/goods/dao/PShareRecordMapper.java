package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PShareRecord;
import com.qcwoshou.goods.model.PShareRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PShareRecordMapper {
    int countByExample(PShareRecordExample example);

    int deleteByExample(PShareRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PShareRecord record);

    int insertSelective(PShareRecord record);

    List<PShareRecord> selectByExample(PShareRecordExample example);

    PShareRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PShareRecord record, @Param("example") PShareRecordExample example);

    int updateByExample(@Param("record") PShareRecord record, @Param("example") PShareRecordExample example);

    int updateByPrimaryKeySelective(PShareRecord record);

    int updateByPrimaryKey(PShareRecord record);
}