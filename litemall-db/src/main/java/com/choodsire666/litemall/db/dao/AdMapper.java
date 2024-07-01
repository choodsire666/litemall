package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Ad;
import com.choodsire666.litemall.db.domain.AdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdMapper {
    long countByExample(AdExample example);

    int deleteByExample(AdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selectOneByExample(AdExample example);

    Ad selectOneByExampleSelective(@Param("example") AdExample example, @Param("selective") Ad.Column ... selective);

    List<Ad> selectByExampleSelective(@Param("example") AdExample example, @Param("selective") Ad.Column ... selective);

    List<Ad> selectByExample(AdExample example);

    Ad selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Ad.Column ... selective);

    Ad selectByPrimaryKey(Integer id);

    Ad selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);

    int logicalDeleteByExample(@Param("example") AdExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}