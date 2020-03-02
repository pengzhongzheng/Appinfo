package com.peng.interceptor;

import com.peng.entity.DevUser;
import com.peng.exception.NotLoginException;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @PackgeName: com.peng.interceptor
 * @ClassName: SysInterceptor
 * @Author: 20573
 * Date: 2020/1/8 12:55
 * project name: SSM_task
 * @Version:
 * @Description:
 */
public class SysInterceptor extends HandlerInterceptorAdapter {
    private Logger logger = Logger.getLogger(SysInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        logger.debug("SysInterceptor preHandle ==========================");
        HttpSession session = request.getSession();

        DevUser user = (DevUser)session.getAttribute("user");
        if(null == user){
            throw new NotLoginException();
        }
        return true;
    }
}
