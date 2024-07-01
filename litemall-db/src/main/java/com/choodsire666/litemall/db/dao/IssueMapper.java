package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Issue;
import com.choodsire666.litemall.db.domain.IssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssueMapper {
    long countByExample(IssueExample example);

    int deleteByExample(IssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Issue record);

    int insertSelective(Issue record);

    Issue selectOneByExample(IssueExample example);

    Issue selectOneByExampleSelective(@Param("example") IssueExample example, @Param("selective") Issue.Column ... selective);

    List<Issue> selectByExampleSelective(@Param("example") IssueExample example, @Param("selective") Issue.Column ... selective);

    List<Issue> selectByExample(IssueExample example);

    Issue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Issue.Column ... selective);

    Issue selectByPrimaryKey(Integer id);

    Issue selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Issue record, @Param("example") IssueExample example);

    int updateByExample(@Param("record") Issue record, @Param("example") IssueExample example);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);

    int logicalDeleteByExample(@Param("example") IssueExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}