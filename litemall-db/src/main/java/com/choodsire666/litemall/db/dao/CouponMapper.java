package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Coupon;
import com.choodsire666.litemall.db.domain.CouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponMapper {
    long countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectOneByExample(CouponExample example);

    Coupon selectOneByExampleSelective(@Param("example") CouponExample example, @Param("selective") Coupon.Column ... selective);

    List<Coupon> selectByExampleSelective(@Param("example") CouponExample example, @Param("selective") Coupon.Column ... selective);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Coupon.Column ... selective);

    Coupon selectByPrimaryKey(Integer id);

    Coupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    int logicalDeleteByExample(@Param("example") CouponExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}