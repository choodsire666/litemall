package com.choodsire666.litemall.admin.shiro;

import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;

/**
 * @author 谢金成
 * @date 2024/7/3 17:41
 */
public class AdminWebSessionManager extends DefaultWebSessionManager {

    /**
     * Token名称
     */
    public static final String LOGIN_TOKEN_KEY = "X-Litemall-Admin-Token";
    /**
     * 会话的来源
     */
    public static final String REFERENCED_SESSION_ID_SOURCE = "stateless request";

    public AdminWebSessionManager() {
        super();
        setGlobalSessionTimeout(MILLIS_PER_HOUR * 6);
        setSessionIdUrlRewritingEnabled(false);
    }

    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        String id = WebUtils.toHttp(request).getHeader(LOGIN_TOKEN_KEY);
        if (!StringUtils.isEmpty(id)) {
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, REFERENCED_SESSION_ID_SOURCE);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, id);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
            request.setAttribute(ShiroHttpServletRequest.SESSION_ID_URL_REWRITING_ENABLED, isSessionIdCookieEnabled());
            return id;
        } else {
            return super.getSessionId(request, response);
        }
    }
}
