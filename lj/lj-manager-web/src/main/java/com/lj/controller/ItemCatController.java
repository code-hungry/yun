package com.lj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.common.pojo.EasyuiTreeNode;
import com.lj.service.ItemCatService;


@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	@RequestMapping("/item/cat/list")
	@ResponseBody
	//第一次的ID是空值，可以向默认给个零 ，之后有值传过来就会覆盖默认值
	public List<EasyuiTreeNode> getItemCatTree(@RequestParam(defaultValue="0") Long id){
		List<EasyuiTreeNode> list = itemCatService.findItemCatsByPid(id);
		return list;
	}
}
