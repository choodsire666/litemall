package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.CouponUser;
import com.choodsire666.litemall.db.domain.CouponUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponUserMapper {
    long countByExample(CouponUserExample example);

    int deleteByExample(CouponUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponUser record);

    int insertSelective(CouponUser record);

    CouponUser selectOneByExample(CouponUserExample example);

    CouponUser selectOneByExampleSelective(@Param("example") CouponUserExample example, @Param("selective") CouponUser.Column ... selective);

    List<CouponUser> selectByExampleSelective(@Param("example") CouponUserExample example, @Param("selective") CouponUser.Column ... selective);

    List<CouponUser> selectByExample(CouponUserExample example);

    CouponUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CouponUser.Column ... selective);

    CouponUser selectByPrimaryKey(Integer id);

    CouponUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") CouponUser record, @Param("example") CouponUserExample example);

    int updateByExample(@Param("record") CouponUser record, @Param("example") CouponUserExample example);

    int updateByPrimaryKeySelective(CouponUser record);

    int updateByPrimaryKey(CouponUser record);

    int logicalDeleteByExample(@Param("example") CouponUserExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}