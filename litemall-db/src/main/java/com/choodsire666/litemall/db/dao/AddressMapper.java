package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Address;
import com.choodsire666.litemall.db.domain.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectOneByExample(AddressExample example);

    Address selectOneByExampleSelective(@Param("example") AddressExample example, @Param("selective") Address.Column ... selective);

    List<Address> selectByExampleSelective(@Param("example") AddressExample example, @Param("selective") Address.Column ... selective);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Address.Column ... selective);

    Address selectByPrimaryKey(Integer id);

    Address selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    int logicalDeleteByExample(@Param("example") AddressExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}