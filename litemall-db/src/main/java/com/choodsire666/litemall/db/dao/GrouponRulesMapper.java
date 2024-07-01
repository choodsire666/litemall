package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.GrouponRules;
import com.choodsire666.litemall.db.domain.GrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrouponRulesMapper {
    long countByExample(GrouponRulesExample example);

    int deleteByExample(GrouponRulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrouponRules record);

    int insertSelective(GrouponRules record);

    GrouponRules selectOneByExample(GrouponRulesExample example);

    GrouponRules selectOneByExampleSelective(@Param("example") GrouponRulesExample example, @Param("selective") GrouponRules.Column ... selective);

    List<GrouponRules> selectByExampleSelective(@Param("example") GrouponRulesExample example, @Param("selective") GrouponRules.Column ... selective);

    List<GrouponRules> selectByExample(GrouponRulesExample example);

    GrouponRules selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GrouponRules.Column ... selective);

    GrouponRules selectByPrimaryKey(Integer id);

    GrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") GrouponRules record, @Param("example") GrouponRulesExample example);

    int updateByExample(@Param("record") GrouponRules record, @Param("example") GrouponRulesExample example);

    int updateByPrimaryKeySelective(GrouponRules record);

    int updateByPrimaryKey(GrouponRules record);

    int logicalDeleteByExample(@Param("example") GrouponRulesExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}