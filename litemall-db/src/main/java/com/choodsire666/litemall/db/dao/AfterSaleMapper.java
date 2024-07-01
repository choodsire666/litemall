package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.AfterSale;
import com.choodsire666.litemall.db.domain.AfterSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfterSaleMapper {
    long countByExample(AfterSaleExample example);

    int deleteByExample(AfterSaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AfterSale record);

    int insertSelective(AfterSale record);

    AfterSale selectOneByExample(AfterSaleExample example);

    AfterSale selectOneByExampleSelective(@Param("example") AfterSaleExample example, @Param("selective") AfterSale.Column ... selective);

    List<AfterSale> selectByExampleSelective(@Param("example") AfterSaleExample example, @Param("selective") AfterSale.Column ... selective);

    List<AfterSale> selectByExample(AfterSaleExample example);

    AfterSale selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") AfterSale.Column ... selective);

    AfterSale selectByPrimaryKey(Integer id);

    AfterSale selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") AfterSale record, @Param("example") AfterSaleExample example);

    int updateByExample(@Param("record") AfterSale record, @Param("example") AfterSaleExample example);

    int updateByPrimaryKeySelective(AfterSale record);

    int updateByPrimaryKey(AfterSale record);

    int logicalDeleteByExample(@Param("example") AfterSaleExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}