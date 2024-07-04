package com.choodsire666.litemall.admin.util;

import com.choodsire666.litemall.admin.annotation.RequiresPermissionsDesc;
import org.apache.shiro.authz.annotation.RequiresPermissions;

/**
 * @author 谢金成
 * @date 2024/7/4 11:01
 */
public class Permission {

    private RequiresPermissions requiresPermissions;

    private RequiresPermissionsDesc requiresPermissionsDesc;

    private String api;

    public RequiresPermissions getRequiresPermissions() {
        return requiresPermissions;
    }

    public void setRequiresPermissions(RequiresPermissions requiresPermissions) {
        this.requiresPermissions = requiresPermissions;
    }

    public RequiresPermissionsDesc getRequiresPermissionsDesc() {
        return requiresPermissionsDesc;
    }

    public void setRequiresPermissionsDesc(RequiresPermissionsDesc requiresPermissionsDesc) {
        this.requiresPermissionsDesc = requiresPermissionsDesc;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
