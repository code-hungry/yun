package com.yh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yh.pojo.User;
import com.yh.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user=new User();
    private UserService us;


    public UserService getUs() {
        return us;
    }

    public void setUs(UserService us) {
        this.us = us;
    }

    public String login(User user){
        //调用service执行登录逻辑
        User userdb = us.findUserByName(user);
        //将客户信息放入Session中
        ActionContext.getContext().getSession().put("user",userdb);
        //重定向或转发
        //重定向到首页

        return "toHome";
    }

    @Override
    public User getModel() {
        return user;
    }
}
