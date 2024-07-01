package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Attribute;
import com.choodsire666.litemall.db.domain.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
    long countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectOneByExample(AttributeExample example);

    Attribute selectOneByExampleSelective(@Param("example") AttributeExample example, @Param("selective") Attribute.Column ... selective);

    List<Attribute> selectByExampleSelective(@Param("example") AttributeExample example, @Param("selective") Attribute.Column ... selective);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Attribute.Column ... selective);

    Attribute selectByPrimaryKey(Integer id);

    Attribute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);

    int logicalDeleteByExample(@Param("example") AttributeExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}