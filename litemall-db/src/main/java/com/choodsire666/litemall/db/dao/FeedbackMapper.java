package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Feedback;
import com.choodsire666.litemall.db.domain.FeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {
    long countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectOneByExample(FeedbackExample example);

    Feedback selectOneByExampleSelective(@Param("example") FeedbackExample example, @Param("selective") Feedback.Column ... selective);

    List<Feedback> selectByExampleSelective(@Param("example") FeedbackExample example, @Param("selective") Feedback.Column ... selective);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Feedback.Column ... selective);

    Feedback selectByPrimaryKey(Integer id);

    Feedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

    int logicalDeleteByExample(@Param("example") FeedbackExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}