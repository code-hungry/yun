package com.lj.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lj.common.pojo.YHResult;
import com.lj.mapper.TbItemParamMapper;
import com.lj.pojo.TbItemParam;
import com.lj.pojo.TbItemParamExample;
import com.lj.pojo.TbItemParamExample.Criteria;
import com.lj.service.ItemParamService;
@Service
public class ItemParamServiceImpl implements ItemParamService {
	@Autowired
   private TbItemParamMapper tbItemParamMapper;
	@Override
	public YHResult findItemParamByCid(Long cid) {
		TbItemParamExample example=new TbItemParamExample();
		Criteria createa = example.createCriteria(); 
		//添加查询条件
		createa.andIdEqualTo(cid);
		//执行查询
		List<TbItemParam> list=tbItemParamMapper.selectByExampleWithBLOBs(example);
		if(list!=null&&list.size()>0){
			//说明该分类参数模板存在
			TbItemParam itemParam=list.get(0);
			return YHResult.ok(200,itemParam);
			
		}else{
			return	YHResult.ok(200,null);
		}
		/*return YHResult.build(500, null);*/
	}
	/* (non-Javadoc)
	 * @see com.lj.service.ItemParamService#addItemParam(java.lang.Long, java.lang.String)
	 */
	@Override
	public YHResult addItemParam(Long cid, String paramData) {
		try{
		TbItemParam tbItemp=new TbItemParam();
		//补全属性
		tbItemp.setCreated(new Date());
		tbItemp.setId(cid);
		tbItemp.setParamData(paramData);
		tbItemp.setUpdated(new Date());
		//执行添加
		tbItemParamMapper.insert(tbItemp);
		return YHResult.ok();
		}catch(Exception e){
			return YHResult.build(500, "添加失败");
		}
	}

}
