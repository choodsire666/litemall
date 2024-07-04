package com.choodsire666.litemall.db.service;

import com.choodsire666.litemall.db.dao.RoleMapper;
import com.choodsire666.litemall.db.domain.Role;
import com.choodsire666.litemall.db.domain.RoleExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 谢金成
 * @date 2024/7/3 16:02
 */
@Service
@Transactional
public class RoleService {

    @Resource
    private RoleMapper roleMapper;

    public Set<String> queryByIds(Integer[] roleIds) {
        Set<String> roles = new HashSet<>();

        if (roleIds.length == 0) {
            return roles;
        }

        RoleExample roleExample = new RoleExample();
        roleExample.or().andIdIn(Arrays.asList(roleIds)).andEnabledEqualTo(true).andDeletedEqualTo(false);

        List<Role> roleList = roleMapper.selectByExample(roleExample);

        roleList.forEach(role -> {
            roles.add(role.getName());
        });

        return roles;
    }

    public List<Role> queryAll() {
        RoleExample roleExample = new RoleExample();
        roleExample.or().andDeletedEqualTo(false);
        return roleMapper.selectByExample(roleExample);
    }
}
