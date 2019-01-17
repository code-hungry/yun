package com.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String toIndexPage(){
        return "index";
    }

    /*提取,多个执行，只用一个代码方法实现*/
    @RequestMapping("/{page}")
    public String toItemPage(@PathVariable String page){
        return page;
    }
}
