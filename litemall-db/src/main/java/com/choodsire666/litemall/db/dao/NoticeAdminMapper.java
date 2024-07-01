package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.NoticeAdmin;
import com.choodsire666.litemall.db.domain.NoticeAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeAdminMapper {
    long countByExample(NoticeAdminExample example);

    int deleteByExample(NoticeAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeAdmin record);

    int insertSelective(NoticeAdmin record);

    NoticeAdmin selectOneByExample(NoticeAdminExample example);

    NoticeAdmin selectOneByExampleSelective(@Param("example") NoticeAdminExample example, @Param("selective") NoticeAdmin.Column ... selective);

    List<NoticeAdmin> selectByExampleSelective(@Param("example") NoticeAdminExample example, @Param("selective") NoticeAdmin.Column ... selective);

    List<NoticeAdmin> selectByExample(NoticeAdminExample example);

    NoticeAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") NoticeAdmin.Column ... selective);

    NoticeAdmin selectByPrimaryKey(Integer id);

    NoticeAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") NoticeAdmin record, @Param("example") NoticeAdminExample example);

    int updateByExample(@Param("record") NoticeAdmin record, @Param("example") NoticeAdminExample example);

    int updateByPrimaryKeySelective(NoticeAdmin record);

    int updateByPrimaryKey(NoticeAdmin record);

    int logicalDeleteByExample(@Param("example") NoticeAdminExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}