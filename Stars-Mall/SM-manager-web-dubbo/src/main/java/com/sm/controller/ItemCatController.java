package com.sm.controller;

import com.sm.common.pojo.EasyuiTreeNode;
import com.sm.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    @Autowired//使用注释不用写setget方法
    private ItemCatService itemCatService;
    @RequestMapping("/item/cat/list")
    @ResponseBody
    //第一次请求的ID是null 所以要初始赋值ID
    public List<EasyuiTreeNode> getItemCatTree(@RequestParam(defaultValue = "0") Long id){
        //返回一个树数据
        List<EasyuiTreeNode> list = itemCatService.findItemCatByPid(id);
        return list;
    }
}
