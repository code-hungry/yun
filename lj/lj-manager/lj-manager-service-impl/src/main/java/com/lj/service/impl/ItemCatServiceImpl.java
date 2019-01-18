package com.lj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lj.common.pojo.EasyuiTreeNode;
import com.lj.mapper.TbItemCatMapper;
import com.lj.pojo.TbItemCat;
import com.lj.pojo.TbItemCatExample;
import com.lj.pojo.TbItemCatExample.Criteria;
import com.lj.service.ItemCatService;


@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	@Override
	public List<EasyuiTreeNode> findItemCatsByPid(Long pid) {
		// 封装条件
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(pid);
		//执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		
		List<EasyuiTreeNode> res = new ArrayList<EasyuiTreeNode>();
		for (TbItemCat cat : list) {
			EasyuiTreeNode node = new EasyuiTreeNode();
			node.setId(cat.getId());
			node.setText(cat.getName());
			node.setState(cat.getIsParent()?"closed":"open");
			res.add(node);
		}
		return res;
	}

}
