package com.yh.service.impl;

import com.opensymphony.xwork2.ActionSupport;
import com.yh.dao.UserDao;
import com.yh.pojo.User;
import com.yh.service.UserService;

public class UserServiceImpl extends ActionSupport implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserByName(User user) {
        //根据账号获取用户信息
        User userdb = userDao.findUserByAccount(user.getAccount());
        //然后判断账号信息是否为空 如果为空则 账号不存在
        if(userdb==null){
            throw new RuntimeException("账号不存在");

        }
        //如果账号不为空，比较密码 如果密码不一样 则密码错误 如果密码正确  则跳转到成功界面
        if(!userdb.getPassword().equals(user.getPassword())){
            //正常应该加密加严
            throw new RuntimeException("密码错误");
        }else{
            //为保护信息 将密码制空
            userdb.setPassword(null);
            return userdb;
        }
    }
}
