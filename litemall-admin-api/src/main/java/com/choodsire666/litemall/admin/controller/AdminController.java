package com.choodsire666.litemall.admin.controller;

import com.choodsire666.litemall.admin.annotation.RequiresPermissionsDesc;
import com.choodsire666.litemall.core.util.ResponseUtil;
import com.choodsire666.litemall.db.domain.Admin;
import com.choodsire666.litemall.db.service.AdminService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 谢金成
 * @date 2024/7/4 15:42
 */
@Api(tags = "管理员管理")
@RestController
@RequestMapping("/admin/admin")
public class AdminController {

    private final Log logger = LogFactory.getLog(AdminController.class);

    @Autowired
    private AdminService adminService;

    @ApiOperation("查询")
    @ApiOperationSupport(order = 10)
    @RequiresPermissions("admin:admin:list")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "查询")
    @GetMapping("/list")
    public Object list(String username,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @RequestParam(defaultValue = "add_time") String sort,
                       @RequestParam(defaultValue = "desc") String order) {
        // 分页查询
        List<Admin> adminList = adminService.querySelective(username, page, limit, sort, order);
        return ResponseUtil.okList(adminList);
    }
}
