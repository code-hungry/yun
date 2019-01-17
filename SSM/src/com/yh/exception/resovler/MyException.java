package com.yh.exception.resovler;

import com.yh.exception.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyException implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        //判断异常是否是自定义异常
        CustomException ce=null;
        if (e instanceof CustomException){
            ce=(CustomException) e;
        }else {
            ce=new CustomException("系统异常，请联系管理员老魏……");
        }
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("errTip",ce.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
