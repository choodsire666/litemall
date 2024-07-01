package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.OrderGoods;
import com.choodsire666.litemall.db.domain.OrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsMapper {
    long countByExample(OrderGoodsExample example);

    int deleteByExample(OrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    OrderGoods selectOneByExample(OrderGoodsExample example);

    OrderGoods selectOneByExampleSelective(@Param("example") OrderGoodsExample example, @Param("selective") OrderGoods.Column ... selective);

    List<OrderGoods> selectByExampleSelective(@Param("example") OrderGoodsExample example, @Param("selective") OrderGoods.Column ... selective);

    List<OrderGoods> selectByExample(OrderGoodsExample example);

    OrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") OrderGoods.Column ... selective);

    OrderGoods selectByPrimaryKey(Integer id);

    OrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);

    int logicalDeleteByExample(@Param("example") OrderGoodsExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}