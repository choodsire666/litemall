package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Product;
import com.choodsire666.litemall.db.domain.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectOneByExample(ProductExample example);

    Product selectOneByExampleSelective(@Param("example") ProductExample example, @Param("selective") Product.Column ... selective);

    List<Product> selectByExampleSelective(@Param("example") ProductExample example, @Param("selective") Product.Column ... selective);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Product.Column ... selective);

    Product selectByPrimaryKey(Integer id);

    Product selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int logicalDeleteByExample(@Param("example") ProductExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}