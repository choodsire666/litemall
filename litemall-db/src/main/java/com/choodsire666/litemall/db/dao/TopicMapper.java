package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Topic;
import com.choodsire666.litemall.db.domain.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    long countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectOneByExample(TopicExample example);

    Topic selectOneByExampleSelective(@Param("example") TopicExample example, @Param("selective") Topic.Column ... selective);

    Topic selectOneByExampleWithBLOBs(TopicExample example);

    List<Topic> selectByExampleSelective(@Param("example") TopicExample example, @Param("selective") Topic.Column ... selective);

    List<Topic> selectByExampleWithBLOBs(TopicExample example);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Topic.Column ... selective);

    Topic selectByPrimaryKey(Integer id);

    Topic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExampleWithBLOBs(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKeyWithBLOBs(Topic record);

    int updateByPrimaryKey(Topic record);

    int logicalDeleteByExample(@Param("example") TopicExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}