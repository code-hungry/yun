package com.lj.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyuiDatagrid<T> implements Serializable{

	private Long total;
	
	private List<T> rows;

	/**
	 * @return the total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * @return the rows
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
