package com.lj.common.pojo;

import java.io.Serializable;

public class EasyuiTreeNode implements Serializable{

	private Long id ;
	private String text ;
	private String state ;//status节点状态,“open”或“closed”,默认是“open”。当设置为“closed”,节点有子节点,并将负载从远程站点 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
