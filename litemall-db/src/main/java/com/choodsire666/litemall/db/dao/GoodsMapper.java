package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Goods;
import com.choodsire666.litemall.db.domain.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectOneByExample(GoodsExample example);

    Goods selectOneByExampleSelective(@Param("example") GoodsExample example, @Param("selective") Goods.Column ... selective);

    Goods selectOneByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExampleSelective(@Param("example") GoodsExample example, @Param("selective") Goods.Column ... selective);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Goods.Column ... selective);

    Goods selectByPrimaryKey(Integer id);

    Goods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);

    int logicalDeleteByExample(@Param("example") GoodsExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}