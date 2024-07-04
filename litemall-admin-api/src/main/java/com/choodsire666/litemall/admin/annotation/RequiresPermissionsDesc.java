package com.choodsire666.litemall.admin.annotation;

import java.lang.annotation.*;

/**
 * @author 谢金成
 * @date 2024/7/4 11:02
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequiresPermissionsDesc {

    String[] menu();

    String button();
}
