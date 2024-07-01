package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.SearchHistory;
import com.choodsire666.litemall.db.domain.SearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchHistoryMapper {
    long countByExample(SearchHistoryExample example);

    int deleteByExample(SearchHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchHistory record);

    int insertSelective(SearchHistory record);

    SearchHistory selectOneByExample(SearchHistoryExample example);

    SearchHistory selectOneByExampleSelective(@Param("example") SearchHistoryExample example, @Param("selective") SearchHistory.Column ... selective);

    List<SearchHistory> selectByExampleSelective(@Param("example") SearchHistoryExample example, @Param("selective") SearchHistory.Column ... selective);

    List<SearchHistory> selectByExample(SearchHistoryExample example);

    SearchHistory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SearchHistory.Column ... selective);

    SearchHistory selectByPrimaryKey(Integer id);

    SearchHistory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByExample(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByPrimaryKeySelective(SearchHistory record);

    int updateByPrimaryKey(SearchHistory record);

    int logicalDeleteByExample(@Param("example") SearchHistoryExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}