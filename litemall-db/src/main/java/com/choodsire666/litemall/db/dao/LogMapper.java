package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Log;
import com.choodsire666.litemall.db.domain.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectOneByExample(LogExample example);

    Log selectOneByExampleSelective(@Param("example") LogExample example, @Param("selective") Log.Column ... selective);

    List<Log> selectByExampleSelective(@Param("example") LogExample example, @Param("selective") Log.Column ... selective);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Log.Column ... selective);

    Log selectByPrimaryKey(Integer id);

    Log selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

    int logicalDeleteByExample(@Param("example") LogExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}