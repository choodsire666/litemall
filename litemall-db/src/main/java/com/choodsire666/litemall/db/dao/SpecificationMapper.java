package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Specification;
import com.choodsire666.litemall.db.domain.SpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationMapper {
    long countByExample(SpecificationExample example);

    int deleteByExample(SpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectOneByExample(SpecificationExample example);

    Specification selectOneByExampleSelective(@Param("example") SpecificationExample example, @Param("selective") Specification.Column ... selective);

    List<Specification> selectByExampleSelective(@Param("example") SpecificationExample example, @Param("selective") Specification.Column ... selective);

    List<Specification> selectByExample(SpecificationExample example);

    Specification selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Specification.Column ... selective);

    Specification selectByPrimaryKey(Integer id);

    Specification selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByExample(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);

    int logicalDeleteByExample(@Param("example") SpecificationExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}