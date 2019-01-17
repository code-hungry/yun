package com.sm.service;

import com.sm.common.pojo.EasyuiTreeNode;

import java.util.List;

public interface ItemCatService {
    /*根据分类父类id获取商品分类信息*/
    public List<EasyuiTreeNode> findItemCatByPid(Long pid);
}
