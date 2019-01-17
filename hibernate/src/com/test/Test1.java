package com.test;

import com.entity.User;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


public class Test1 {
    @Test
    public void deleteTest(){
        Session session= HibernateUtil.getCurrentSession();
        Session session1=HibernateUtil.getCurrentSession();
        System.out.println(session==session1);
        Transaction tx=session.beginTransaction();
        //执行查询
        User user=(User) session.get(User.class,"2c9081e467b9f0720167b9f073fc0000");
        System.out.println(user);
        //提交事务
        tx.commit();
        session.close();
    }
    @Test
    public void addTest(){
        Session session=HibernateUtil.getCurrentSession();
        Transaction tx=session.beginTransaction();
        //执行增加
        User u=new User();
        u.setName("jack");
        u.setAge(16);
        u.setSex("0");
        u.setAddress("河南");

        //调用save
        session.save(u);
        tx.commit();
        session.close();
    }


}
