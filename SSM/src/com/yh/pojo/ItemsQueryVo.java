package com.yh.pojo;

import java.util.List;

public class ItemsQueryVo {
    private Items items;

    private List<Integer> itemIds;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }
}
