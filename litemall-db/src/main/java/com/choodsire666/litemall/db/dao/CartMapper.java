package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Cart;
import com.choodsire666.litemall.db.domain.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectOneByExample(CartExample example);

    Cart selectOneByExampleSelective(@Param("example") CartExample example, @Param("selective") Cart.Column ... selective);

    List<Cart> selectByExampleSelective(@Param("example") CartExample example, @Param("selective") Cart.Column ... selective);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Cart.Column ... selective);

    Cart selectByPrimaryKey(Integer id);

    Cart selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    int logicalDeleteByExample(@Param("example") CartExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}