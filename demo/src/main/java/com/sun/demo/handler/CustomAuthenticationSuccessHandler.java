package com.sun.demo.handler;

import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证成功处理器
 *
 * @author sun
 * @date 2019/2/18 18:28
 */
public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        if (httpServletRequest.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE)
                || httpServletRequest.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {
            //JSON请求处理返回JSON
            httpServletResponse.setContentType("application/json;charset=utf-8");
            httpServletResponse.getWriter().println("success");
        } else {
            //非JSON请求采用默认处理-跳转页面
            super.onAuthenticationSuccess(httpServletRequest, httpServletResponse, authentication);
        }
    }
}
