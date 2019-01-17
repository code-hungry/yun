package com.yh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yh.pojo.Customer;
import com.yh.pojo.PageBean;
import com.yh.pojo.User;
import com.yh.service.CustomerService;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

//使用模型驱动
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
private Customer customer=new Customer();
private Integer pageSize;
//当前页
    private Integer currenPage;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrenPage() {
        return currenPage;
    }

    public void setCurrenPage(Integer currenPage) {
        this.currenPage = currenPage;
    }

    @Override
    public Customer getModel() {
        return null;
    }
    private CustomerService customerService;

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String addCustomer(){
        //从session中获取用户信息
      User u=(User) ActionContext.getContext().getSession().get("user");
      customer.setUserId(u.getUid());
      customer.setCreateId(u.getUid());
        //调用service处理请求
        customerService.addCustomer(customer);
        return "toList";
    }
    public String ListCustomer(){
        //创建离线的criteria对象   与session无关
        DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
        //判断查询条件 是否为空
        if(StringUtils.isNotBlank(customer.getName())){
            dc.add(Restrictions.ilike("name","%"+customer.getName()+"%"));
        }
       // PageBean pageBean = new PageBean();
        //调用service
        customerService.listCustomer(dc,pageSize,currenPage);
        return "tolistPage";
    }
}
