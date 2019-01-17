package com.yh.service.impl;

import com.yh.mapper.ItemsMapper;
import com.yh.pojo.Items;
import com.yh.pojo.ItemsExample;
import com.yh.pojo.ItemsQueryVo;
import com.yh.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> getItemsByQuery(ItemsQueryVo vo) {
        /*调用mapper接口的方法*/

        return itemsMapper.getItemsByItem(vo);
    }

    @Override
    public Items findItemsById(Long id) {

        return itemsMapper.findItemById(id);
    }

    @Override
    public void updateItems(Items items) {
       // int a=1/2;
        itemsMapper.updateItems(items);
    }

    @Override
    public void batchDelete(Integer[] itemId) {
        //用逆向工程的类进行批量删除
        ItemsExample ie=new ItemsExample();
        ItemsExample.Criteria criteria= ie.createCriteria();
        criteria.andIdIn(Arrays.asList(itemId));
        itemsMapper.deleteExample(ie);
    }
}
