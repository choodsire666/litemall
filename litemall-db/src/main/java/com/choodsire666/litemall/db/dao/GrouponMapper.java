package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Groupon;
import com.choodsire666.litemall.db.domain.GrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrouponMapper {
    long countByExample(GrouponExample example);

    int deleteByExample(GrouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Groupon record);

    int insertSelective(Groupon record);

    Groupon selectOneByExample(GrouponExample example);

    Groupon selectOneByExampleSelective(@Param("example") GrouponExample example, @Param("selective") Groupon.Column ... selective);

    List<Groupon> selectByExampleSelective(@Param("example") GrouponExample example, @Param("selective") Groupon.Column ... selective);

    List<Groupon> selectByExample(GrouponExample example);

    Groupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Groupon.Column ... selective);

    Groupon selectByPrimaryKey(Integer id);

    Groupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Groupon record, @Param("example") GrouponExample example);

    int updateByExample(@Param("record") Groupon record, @Param("example") GrouponExample example);

    int updateByPrimaryKeySelective(Groupon record);

    int updateByPrimaryKey(Groupon record);

    int logicalDeleteByExample(@Param("example") GrouponExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}