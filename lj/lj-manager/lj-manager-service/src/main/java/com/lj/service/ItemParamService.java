package com.lj.service;

import com.lj.common.pojo.YHResult;

public interface ItemParamService {
	//根据商品分类ID获取商品规格参数信息模板
	YHResult findItemParamByCid(Long cid);
	//添加规格参数模板
	YHResult addItemParam(Long cid,String paramData);
	
}
	
