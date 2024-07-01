package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Region;
import com.choodsire666.litemall.db.domain.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectOneByExample(RegionExample example);

    Region selectOneByExampleSelective(@Param("example") RegionExample example, @Param("selective") Region.Column ... selective);

    List<Region> selectByExampleSelective(@Param("example") RegionExample example, @Param("selective") Region.Column ... selective);

    List<Region> selectByExample(RegionExample example);

    Region selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Region.Column ... selective);

    Region selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}