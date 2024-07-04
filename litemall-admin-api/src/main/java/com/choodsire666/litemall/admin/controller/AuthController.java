package com.choodsire666.litemall.admin.controller;

import com.choodsire666.litemall.admin.service.LogHelper;
import com.choodsire666.litemall.core.util.IpUtil;
import com.choodsire666.litemall.core.util.JacksonUtil;
import com.choodsire666.litemall.core.util.ResponseUtil;
import com.choodsire666.litemall.db.domain.Admin;
import com.choodsire666.litemall.db.service.AdminService;
import com.choodsire666.litemall.db.service.PermissionService;
import com.choodsire666.litemall.db.service.RoleService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.choodsire666.litemall.admin.util.AdminResponseCode.*;

/**
 * @author 谢金成
 * @date 2024/7/2 0:09
 */
@Api(tags = "授权")
@RestController
@RequestMapping("/admin/auth")
public class AuthController {

    @Autowired
    private LogHelper logHelper;

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 登录
     *
     * @param body { username : value, password : value }
     * @param request
     * @return
     */
    @PostMapping("/login")
    @ApiOperation("登录")
    @ApiOperationSupport(order = 10)
    @ApiImplicitParams({@ApiImplicitParam(name = "body", value = "请求体", required = true, dataType = "string", paramType = "string")})
    public Object login(@RequestBody String body, HttpServletRequest request) {
        String username = JacksonUtil.parseString(body, "username");
        String password = JacksonUtil.parseString(body, "password");
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResponseUtil.badArgument();
        }

        /**
         * 获取当前登录的用户
         */
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(new UsernamePasswordToken(username, password));
        } catch (UnknownAccountException uae) {
            logHelper.logAuthFail("登录", "用户账号或密码不正确");
            return ResponseUtil.fail(ADMIN_INVALID_ACCOUNT, "用户账号或密码不正确");
        } catch (LockedAccountException lae) {
            logHelper.logAuthFail("登录", "用户账号已锁定不可用");
            return ResponseUtil.fail(ADMIN_INVALID_ACCOUNT, "用户账号已锁定不可用");
        } catch (AuthenticationException ae) {
            logHelper.logAuthFail("登录", "认证失败");
            return ResponseUtil.fail(ADMIN_INVALID_ACCOUNT, "认证失败");
        }

        currentUser = SecurityUtils.getSubject();
        // 更新数据库
        Admin admin = (Admin) currentUser.getPrincipal();
        admin.setLastLoginIp(IpUtil.getIpAddr(request));
        admin.setLastLoginTime(LocalDateTime.now());
        adminService.updateById(admin);

        logHelper.logAuthSucceed("登录");

        // 构造返回数据， 包含adminInfo和token
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> adminInfo = new HashMap<>();
        adminInfo.put("nickName", admin.getUsername());
        adminInfo.put("avatar", admin.getAvatar());

        map.put("adminInfo", adminInfo);
        map.put("token", currentUser.getSession().getId());

        return ResponseUtil.ok(map);
    }

    @ApiOperation("未登录")
    @ApiOperationSupport(order = 20)
    @GetMapping("/401")
    public Object page401() {
        return ResponseUtil.unlogin();
    }

    @ApiOperation("未授权")
    @ApiOperationSupport(order = 30)
    @GetMapping("/403")
    public Object page403() {
        return ResponseUtil.unathz();
    }

    @ApiOperation("登录成功")
    @ApiOperationSupport(order = 40)
    @GetMapping("/index")
    public Object index() {
        return ResponseUtil.ok();
    }

    @RequiresAuthentication
    @ApiOperation("获取用户信息")
    @ApiOperationSupport(order = 50)
    @GetMapping("/info")
    public Object info () {
        // 获取当前登录用户
        Subject currentUser = SecurityUtils.getSubject();
        Admin admin = (Admin) currentUser.getPrincipal();

        // 封装数据
        Map<String, Object> data = new HashMap<>();
        data.put("name", admin.getUsername());
        data.put("avatar", admin.getAvatar());

        // 拿到权限和角色
        Integer[] roleIds = admin.getRoleIds();
        Set<String> roles = roleService.queryByIds(roleIds);
        Set<String> permissions = permissionService.queryByRoleIds(roleIds);
        data.put("roles", roles);
        data.put("perms", toApi(permissions));

        return ResponseUtil.ok(data);
    }

    /**
     * 转换权限， 加上Api格式
     * @param permissions
     * @return
     */
    private Collection<String> toApi(Set<String> permissions) {
        // TODO: 完成权限转换
        return null;
    }
}
