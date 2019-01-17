package com.yh.dao;

import com.yh.pojo.Customer;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;


public interface CustomerDao {


	//获取所有信息列表
	public List<Customer> getAll();

   public void addCustomer(Customer customer);

	Long getTotal(DetachedCriteria dc);
}

