package com.choodsire666.litemall.db.service;

import com.choodsire666.litemall.db.dao.AdminMapper;
import com.choodsire666.litemall.db.domain.Admin;
import com.choodsire666.litemall.db.domain.AdminExample;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 谢金成
 * @date 2024/7/3 16:00
 */
@Service
@Transactional
public class AdminService {

    private final Admin.Column[] result = new Admin.Column[]{Admin.Column.id, Admin.Column.username, Admin.Column.avatar, Admin.Column.roleIds};

    @Resource
    private AdminMapper adminMapper;

    public List<Admin> findAdmin(String username) {
        AdminExample adminExample = new AdminExample();
        adminExample.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return adminMapper.selectByExample(adminExample);
    }

    public int updateById(Admin admin) {
        admin.setUpdateTime(LocalDateTime.now());
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    public List<Admin> querySelective(String username, Integer page, Integer limit, String sort, String order) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            adminExample.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return adminMapper.selectByExampleSelective(adminExample, result);
    }
}
