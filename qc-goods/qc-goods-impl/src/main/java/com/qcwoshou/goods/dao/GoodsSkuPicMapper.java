package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.GoodsSkuPic;
import com.qcwoshou.goods.model.GoodsSkuPicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuPicMapper {
    int countByExample(GoodsSkuPicExample example);

    int deleteByExample(GoodsSkuPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSkuPic record);

    int insertSelective(GoodsSkuPic record);

    List<GoodsSkuPic> selectByExampleWithBLOBs(GoodsSkuPicExample example);

    List<GoodsSkuPic> selectByExample(GoodsSkuPicExample example);

    GoodsSkuPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSkuPic record, @Param("example") GoodsSkuPicExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsSkuPic record, @Param("example") GoodsSkuPicExample example);

    int updateByExample(@Param("record") GoodsSkuPic record, @Param("example") GoodsSkuPicExample example);

    int updateByPrimaryKeySelective(GoodsSkuPic record);

    int updateByPrimaryKeyWithBLOBs(GoodsSkuPic record);

    int updateByPrimaryKey(GoodsSkuPic record);
}