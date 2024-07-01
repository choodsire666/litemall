package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Notice;
import com.choodsire666.litemall.db.domain.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    long countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectOneByExample(NoticeExample example);

    Notice selectOneByExampleSelective(@Param("example") NoticeExample example, @Param("selective") Notice.Column ... selective);

    List<Notice> selectByExampleSelective(@Param("example") NoticeExample example, @Param("selective") Notice.Column ... selective);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Notice.Column ... selective);

    Notice selectByPrimaryKey(Integer id);

    Notice selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    int logicalDeleteByExample(@Param("example") NoticeExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}