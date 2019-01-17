package com.yh.pojo;

import java.util.HashSet;
import java.util.Set;

//持久化类需提供无参构造
//成员变量需要有get。set方法
//持久化类的的属性类型，应为包装类型
//需要提供一个与主键对应的属性
//持久化不要用final修饰
public class Customer {

	private Long cid;
	private Long userId;
	private Long createId;
	
	private String name;
	
	private String source;
	
	private String level;
	private String industry;
	private String phone;
	private String mobile;
	
	public Customer(){
	}
	public Customer(String name, String level){
		this.name = name;
		this.level = level;
	}
	
	//使用set集合，表达一对多的关系
	private Set<Linkman> linkmen = new HashSet<Linkman>();

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", source=" + source
				+ ", level=" + level + "]";
	}

	public Set<Linkman> getLinkmen() {
		return linkmen;
	}

	public void setLinkmen(Set<Linkman> linkmen) {
		this.linkmen = linkmen;
	}

	
}
