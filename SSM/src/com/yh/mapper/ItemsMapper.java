package com.yh.mapper;

import com.yh.pojo.Items;
import com.yh.pojo.ItemsExample;
import com.yh.pojo.ItemsQueryVo;

import java.util.List;

public interface ItemsMapper {
    //根据条件获取商品列表信息
    public List<Items> getItemsByItem(ItemsQueryVo vo);
    public Items findItemById(Long id);
    /*修改商品信息*/
    public void updateItems(Items items);
    //批量删除
   public void deleteExample(ItemsExample itemsExample);
}
