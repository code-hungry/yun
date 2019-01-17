package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory;
    static {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        factory=cfg.buildSessionFactory();
        }
        public static Session getCurrentSession(){
        /*获取与本地线程绑定的session*/
        return factory.getCurrentSession();
    }

}
