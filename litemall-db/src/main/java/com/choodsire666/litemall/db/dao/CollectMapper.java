package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Collect;
import com.choodsire666.litemall.db.domain.CollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {
    long countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectOneByExample(CollectExample example);

    Collect selectOneByExampleSelective(@Param("example") CollectExample example, @Param("selective") Collect.Column ... selective);

    List<Collect> selectByExampleSelective(@Param("example") CollectExample example, @Param("selective") Collect.Column ... selective);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Collect.Column ... selective);

    Collect selectByPrimaryKey(Integer id);

    Collect selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    int logicalDeleteByExample(@Param("example") CollectExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}