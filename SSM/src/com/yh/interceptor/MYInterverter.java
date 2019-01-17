package com.yh.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MYInterverter implements HandlerInterceptor {
    //进入handler方法之前执行  登录
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("preHandle^^^^^^");
        //获取请求的url
        String uri=httpServletRequest.getRequestURI();
        if (uri.indexOf("login")>=0){
            //如果是登录 放行
            return true;
        }
        HttpSession session=httpServletRequest.getSession();
        Object username=session.getAttribute("username");
        if (username!=null){
            return true;
        }
        //如果没有  就转发到登录界面
        httpServletRequest.getRequestDispatcher("/jsp/login.jsp").forward(httpServletRequest,httpServletResponse);
        return true;
    }
    //进入handler方法之后，返回ModelAndView之前
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler^^^^");
    }
    //执行完成handler方法 之后执行
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("after****");
    }
}
