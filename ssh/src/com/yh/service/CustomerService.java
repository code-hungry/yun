package com.yh.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.yh.pojo.Customer;
import com.yh.pojo.PageBean;

public interface CustomerService {

    void addCustomer(Customer customer);

    Long listCustomer(DetachedCriteria dc, Integer currentPage, Integer pageSize);

    public List<Customer> getAll();


}
