package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Keyword;
import com.choodsire666.litemall.db.domain.KeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordMapper {
    long countByExample(KeywordExample example);

    int deleteByExample(KeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keyword record);

    int insertSelective(Keyword record);

    Keyword selectOneByExample(KeywordExample example);

    Keyword selectOneByExampleSelective(@Param("example") KeywordExample example, @Param("selective") Keyword.Column ... selective);

    List<Keyword> selectByExampleSelective(@Param("example") KeywordExample example, @Param("selective") Keyword.Column ... selective);

    List<Keyword> selectByExample(KeywordExample example);

    Keyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Keyword.Column ... selective);

    Keyword selectByPrimaryKey(Integer id);

    Keyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Keyword record, @Param("example") KeywordExample example);

    int updateByExample(@Param("record") Keyword record, @Param("example") KeywordExample example);

    int updateByPrimaryKeySelective(Keyword record);

    int updateByPrimaryKey(Keyword record);

    int logicalDeleteByExample(@Param("example") KeywordExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}