package com.lj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.common.pojo.EasyuiDatagrid;
import com.lj.common.pojo.YHResult;
import com.lj.service.ItemParamService;

@Controller
public class ItemParamController {
	@Autowired
	private ItemParamService itemParamService;
	@RequestMapping("/item/param/query/itemcatid/{cid}")
	@ResponseBody
	public YHResult validateItemparamByCid(@PathVariable Long cid){
		System.out.println("+++++++++cid"+cid);
		return itemParamService.findItemParamByCid(cid);
	}
	
	@RequestMapping("/item/param/save/{cid}")
	@ResponseBody
	public YHResult addItemParam(@PathVariable Long cid,String paramData){
		return itemParamService.addItemParam(cid,paramData);
	}
	@RequestMapping("/item/param/list")
	@ResponseBody
	public EasyuiDatagrid lsitItemParam(Integer page,Integer rows){
		
		return null;
		
	}
}
