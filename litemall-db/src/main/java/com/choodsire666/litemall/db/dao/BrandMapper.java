package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Brand;
import com.choodsire666.litemall.db.domain.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    long countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectOneByExample(BrandExample example);

    Brand selectOneByExampleSelective(@Param("example") BrandExample example, @Param("selective") Brand.Column ... selective);

    List<Brand> selectByExampleSelective(@Param("example") BrandExample example, @Param("selective") Brand.Column ... selective);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Brand.Column ... selective);

    Brand selectByPrimaryKey(Integer id);

    Brand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    int logicalDeleteByExample(@Param("example") BrandExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}