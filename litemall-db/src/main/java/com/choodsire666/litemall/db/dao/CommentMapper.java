package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Comment;
import com.choodsire666.litemall.db.domain.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectOneByExample(CommentExample example);

    Comment selectOneByExampleSelective(@Param("example") CommentExample example, @Param("selective") Comment.Column ... selective);

    List<Comment> selectByExampleSelective(@Param("example") CommentExample example, @Param("selective") Comment.Column ... selective);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Comment.Column ... selective);

    Comment selectByPrimaryKey(Integer id);

    Comment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int logicalDeleteByExample(@Param("example") CommentExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}