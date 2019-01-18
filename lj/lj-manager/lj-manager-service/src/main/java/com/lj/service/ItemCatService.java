package com.lj.service;

import java.util.List;

import com.lj.common.pojo.EasyuiTreeNode;



/**
 * 商品类目管理模块
 * @author Administrator
 *
 */
public interface ItemCatService {

	//根据分类父id获取商品分类信息
	public List<EasyuiTreeNode> findItemCatsByPid(Long pid);
}
