package com.yh.pojo;

import java.util.List;

public class PageBean {

	private List<?> list; 
	
	private Integer currentPage;
	
	private Long totalItems;
	
	private Integer totalPages;
	
	private Integer pageSize;
	
	public PageBean(Integer currentPage, Integer pageSize, Long totalItems){
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		//如果没有指定当前页码，设置默认值
		if(this.currentPage == null){
			this.currentPage = 1;
		}
		//如果没有指定每页显示多少条，设置默认值
		if(this.pageSize == null){
			this.pageSize = 2;
		}
		//计算总页数
//		this.totalPages = (int) ((totalItems+this.pageSize-1)/this.pageSize);
		int tmpPages = (int) (totalItems/this.pageSize);
		this.totalPages = totalItems%this.pageSize==0?tmpPages:tmpPages+1;
		
		//处理下溢出
		if(this.currentPage < 1 ){
			this.currentPage = 1;
		}
		//处理上溢出
		if(this.currentPage > this.totalPages ){
			this.currentPage = this.totalPages;
		}
	}
	public Integer getStart(){
		return (this.currentPage-1)*this.pageSize;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Long getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
}
