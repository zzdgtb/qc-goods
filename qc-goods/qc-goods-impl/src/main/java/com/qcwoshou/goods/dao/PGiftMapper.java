package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGift;
import com.qcwoshou.goods.model.PGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PGiftMapper {
    int countByExample(PGiftExample example);

    int deleteByExample(PGiftExample example);

    int insert(PGift record);

    int insertSelective(PGift record);

    List<PGift> selectByExample(PGiftExample example);

    int updateByExampleSelective(@Param("record") PGift record, @Param("example") PGiftExample example);

    int updateByExample(@Param("record") PGift record, @Param("example") PGiftExample example);
}