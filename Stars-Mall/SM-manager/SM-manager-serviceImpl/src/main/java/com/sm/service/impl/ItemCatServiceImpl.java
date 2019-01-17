package com.sm.service.impl;

import com.sm.common.pojo.EasyuiTreeNode;
import com.sm.mapper.TbItemCatMapper;
import com.sm.pojo.TbItemCat;
import com.sm.pojo.TbItemCatExample;
import com.sm.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper tbItemCatMapper;
    @Override
    public List<EasyuiTreeNode> findItemCatByPid(Long pid) {
        //封装条件
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(pid);
        //执行查询
        List<TbItemCat> list= tbItemCatMapper.selectByExample(tbItemCatExample);
        List<EasyuiTreeNode> ref=new ArrayList<EasyuiTreeNode>();
        for (TbItemCat tbItemCats:list) {
            EasyuiTreeNode easyuiTreeNode=new EasyuiTreeNode();
            easyuiTreeNode.setId(tbItemCats.getId());
            easyuiTreeNode.setText(tbItemCats.getName());
            easyuiTreeNode.setState(tbItemCats.getIsParent()?"closed":"open");
            ref.add(easyuiTreeNode);
        }
        return ref;
    }
}
