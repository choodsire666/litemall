package com.choodsire666.litemall.db.dao;

import com.choodsire666.litemall.db.domain.Storage;
import com.choodsire666.litemall.db.domain.StorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
    long countByExample(StorageExample example);

    int deleteByExample(StorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectOneByExample(StorageExample example);

    Storage selectOneByExampleSelective(@Param("example") StorageExample example, @Param("selective") Storage.Column ... selective);

    List<Storage> selectByExampleSelective(@Param("example") StorageExample example, @Param("selective") Storage.Column ... selective);

    List<Storage> selectByExample(StorageExample example);

    Storage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Storage.Column ... selective);

    Storage selectByPrimaryKey(Integer id);

    Storage selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByExample(@Param("record") Storage record, @Param("example") StorageExample example);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);

    int logicalDeleteByExample(@Param("example") StorageExample example);

    int logicalDeleteByPrimaryKey(Integer id);
}