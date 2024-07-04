package com.choodsire666.litemall.admin.util;

import com.choodsire666.litemall.admin.annotation.RequiresPermissionsDesc;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 谢金成
 * @date 2024/7/4 10:59
 */
public class PermissionUtil {

    public static List<Permission> listPermission(ApplicationContext context, String basePackage) {
        // 获取所有控制器
        Map<String, Object> map = context.getBeansWithAnnotation(Controller.class);
        List<Permission> permissions = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object bean = entry.getValue();
            // bean 就是其中一个 controller
            // 过滤出在指定包名下的bean
            if (!StringUtils.contains(ClassUtils.getPackageName(bean.getClass()), basePackage)) {
                continue;
            }

            Class<?> clz = bean.getClass();
            Class<?> controllerClz = clz.getSuperclass();
            // 得到RequestMapping注解
            RequestMapping clazzRequestMapping = AnnotationUtils.findAnnotation(controllerClz, RequestMapping.class);
            // 获取需要授权的方法
            List<Method> methods = MethodUtils.getMethodsListWithAnnotation(controllerClz, RequiresPermissions.class);
            for (Method method : methods) {
                RequiresPermissions requiresPermissions = AnnotationUtils.findAnnotation(method, RequiresPermissions.class);
                RequiresPermissionsDesc requiresPermissionsDesc = AnnotationUtils.findAnnotation(method, RequiresPermissionsDesc.class);

                // 如果两个注解不同时存在，则跳过
                if (requiresPermissions == null || requiresPermissionsDesc == null) {
                    continue;
                }

                String api = "";
                if (clazzRequestMapping != null) {
                    // 得到请求地址
                    api = clazzRequestMapping.value()[0];
                }

                PostMapping postMapping = AnnotationUtils.getAnnotation(method, PostMapping.class);
                if (postMapping != null) {
                    // 如果是POST请求，则拼接请求地址为 POST 路径
                    api = "POST " + api + postMapping.value()[0];

                    Permission permission = new Permission();
                    permission.setRequiresPermissions(requiresPermissions);
                    permission.setRequiresPermissionsDesc(requiresPermissionsDesc);
                    permission.setApi(api);
                    permissions.add(permission);
                    continue;
                }

                GetMapping getMapping = AnnotationUtils.getAnnotation(method, GetMapping.class);
                if (getMapping != null) {
                    // 如果是GET请求， 则拼接请求地址为 GET 路径
                    api = "GET " + api + getMapping.value()[0];

                    Permission permission = new Permission();
                    permission.setRequiresPermissionsDesc(requiresPermissionsDesc);
                    permission.setRequiresPermissions(requiresPermissions);
                    permission.setApi(api);
                    permissions.add(permission);
                    continue;
                }

                // TODO: 其他请求方式
                throw new RuntimeException("目前只支持GetMapping和PostMapping");
            }
        }

        return permissions;
    }
}
