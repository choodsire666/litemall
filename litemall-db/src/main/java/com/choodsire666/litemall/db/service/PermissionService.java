package com.choodsire666.litemall.db.service;

import com.choodsire666.litemall.db.dao.PermissionMapper;
import com.choodsire666.litemall.db.domain.Permission;
import com.choodsire666.litemall.db.domain.PermissionExample;
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
public class PermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    public Set<String> queryByRoleIds(Integer[] roleIds) {
        Set<String> permissions = new HashSet<>();

        if (roleIds.length == 0) {
            return permissions;
        }

        PermissionExample permissionExample = new PermissionExample();
        permissionExample.or().andRoleIdIn(Arrays.asList(roleIds)).andDeletedEqualTo(false);

        List<Permission> permissionList = permissionMapper.selectByExample(permissionExample);

        permissionList.forEach(permission -> {
            permissions.add(permission.getPermission());
        });

        return permissions;
    }
}
