package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Footprint;
import com.choodsire666.litemall.db.domain.FootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FootprintMapper {
    long countByExample(FootprintExample example);

    int deleteByExample(FootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Footprint record);

    int insertSelective(Footprint record);

    Footprint selectOneByExample(FootprintExample example);

    Footprint selectOneByExampleSelective(@Param("example") FootprintExample example, @Param("selective") Footprint.Column ... selective);

    List<Footprint> selectByExampleSelective(@Param("example") FootprintExample example, @Param("selective") Footprint.Column ... selective);

    List<Footprint> selectByExample(FootprintExample example);

    Footprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Footprint.Column ... selective);

    Footprint selectByPrimaryKey(Integer id);

    Footprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Footprint record, @Param("example") FootprintExample example);

    int updateByExample(@Param("record") Footprint record, @Param("example") FootprintExample example);

    int updateByPrimaryKeySelective(Footprint record);

    int updateByPrimaryKey(Footprint record);

    int logicalDeleteByExample(@Param("example") FootprintExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}