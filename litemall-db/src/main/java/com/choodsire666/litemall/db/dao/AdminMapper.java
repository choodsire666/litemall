package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Admin;
import com.choodsire666.litemall.db.domain.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectOneByExample(AdminExample example);

    Admin selectOneByExampleSelective(@Param("example") AdminExample example, @Param("selective") Admin.Column ... selective);

    List<Admin> selectByExampleSelective(@Param("example") AdminExample example, @Param("selective") Admin.Column ... selective);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Admin.Column ... selective);

    Admin selectByPrimaryKey(Integer id);

    Admin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    int logicalDeleteByExample(@Param("example") AdminExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}