package com.choodsire666.litemall.admin.controller;

import com.choodsire666.litemall.core.util.ResponseUtil;
import com.choodsire666.litemall.db.domain.Role;
import com.choodsire666.litemall.db.service.RoleService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 谢金成
 * @date 2024/7/4 16:16
 */
@Api(tags = {"角色管理"})
@RestController
@RequestMapping("/admin/role")
public class RoleController {

    private final Log logger = LogFactory.getLog(RoleController.class);

    @Autowired
    private RoleService roleService;

    @ApiOperation("/获取所有角色")
    @ApiOperationSupport(order = 10)
    @GetMapping("/options")
    public Object options() {
        List<Role> roleList = roleService.queryAll();

        List<Map<String, Object>> options = roleList.stream().map(role -> {
            Map<String, Object> map = new HashMap<>();
            map.put("value", role.getId());
            map.put("label", role.getName());
            return map;
        }).collect(Collectors.toList());

        return ResponseUtil.okList(options);
    }
}
