package com.choodsire666.litemall.db.service;

import com.choodsire666.litemall.db.dao.LogMapper;
import com.choodsire666.litemall.db.domain.Log;
import com.choodsire666.litemall.db.domain.LogExample;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 谢金成
 * @date 2024/7/2 17:30
 */
@Service
public class LogService {

    @Resource
    private LogMapper logMapper;

    public void deleteById(Integer id) {
        logMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(Log log) {
        log.setAddTime(LocalDateTime.now());
        log.setUpdateTime(LocalDateTime.now());
        logMapper.insertSelective(log);
    }

    public List<Log> querySelective(String name, Integer page, Integer size, String sort, String order) {
        LogExample example = new LogExample();
        LogExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andAdminLike("%" + name + "%");
        }

        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        // 在数据库查询之前设置分页参数
        PageHelper.startPage(page, size);
        return logMapper.selectByExample(example);
    }
}
