package com.lj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String toIndexPage(){
		return "index";
	}
	@RequestMapping("/{page}")
	public String toItemAddPage(@PathVariable String page){
		return page;
	}
	/*@RequestMapping("item-list")
	public String toItemListPage(){
		return "item-list";
	}
	@RequestMapping("item-param-list")
	public String toItemParamListPage(){
		return "item-param-list";
	}*/
}
