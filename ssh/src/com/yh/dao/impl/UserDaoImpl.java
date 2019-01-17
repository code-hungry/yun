package com.yh.dao.impl;

import com.yh.dao.UserDao;
import com.yh.pojo.User;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    /*使用hibernate模板*/
   /*private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }*/

    @Override
    public User findUserByAccount(String code) {
      /*  return hibernateTemplate.execute(new HibernateCallback<User>() {
           @Override
            public User doInHibernate(Session session) throws HibernateException {
                //多种查询方法
                //hql语句查询
                String hql="from User where account=?";
                //创建查询对象
                Query query = session.createQuery(hql);
                //设置参数
                query.setParameter(0,code);
                User user= (User) query.uniqueResult();
                //qbc查询
                Criteria criteria=session.createCriteria(User.class);
                criteria.add(Restrictions.eq("account",code));
                User user1= (User) criteria.uniqueResult();

                return user;
            }


        });
        return null;*/

    //第三种离线查询
    DetachedCriteria dc= DetachedCriteria.forClass(User.class);
        dc.add(Restrictions.eq("account",code));
    List<User> list= (List<User>) getHibernateTemplate().findByCriteria(dc);
        if(list!=null&&list.size()>0){

        return list.get(0);
    }else{
        return null;
    }


    }

}
