package com.yh.service.impl;

import com.yh.dao.CustomerDao;
import com.yh.pojo.Customer;
import com.yh.pojo.PageBean;
import com.yh.service.CustomerService;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);

    }

    @Override
    public Long listCustomer(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
        //获取总条数
      Long total=   customerDao.getTotal(dc);
      //查询列表信息
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
