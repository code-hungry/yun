package com.yh.dao.impl;

import com.yh.dao.CustomerDao;
import com.yh.pojo.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        this.getHibernateTemplate().save(customer);
    }

    @Override
    public Long getTotal(DetachedCriteria dc) {
       List<?> list= this.getHibernateTemplate().findByCriteria(dc);
       if (list!=null){
           //return list.get(0);
       }
        return null;
    }
}
