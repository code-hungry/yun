package com.yh.service;

import com.yh.pojo.Items;
import com.yh.pojo.ItemsQueryVo;

import java.util.List;

public interface ItemsService{
    //根据条件获取商品列表
    public List<Items> getItemsByQuery(ItemsQueryVo vo);

    public Items findItemsById(Long id);
    public void updateItems(Items items);

    public void batchDelete(Integer[] itemId);
}

