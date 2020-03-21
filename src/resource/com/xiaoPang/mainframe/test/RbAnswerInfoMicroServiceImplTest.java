package com.xiaoPang.mainframe.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import com.xiaoPang.mainframe.model.RbAnswerInfoModel;
import com.xiaoPang.mainframe.test.common.BaseTestCase;
import com.xiaoPang.mainframe.service.RbAnswerInfoMicroService;
import com.camelot.openplatform.common.bean.Pager;

/** 
 * <p>Description: [机器人回答数据表 单元测试类]</p>
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public class RbAnswerInfoMicroServiceImplTest extends BaseTestCase{
	@Resource
	private RbAnswerInfoMicroService rbAnswerInfoMicroService;

	/**
	 * <p>Discription:[机器人回答数据表分页查询数据]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void queryPage(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		RbAnswerInfoModel rbAnswerInfoModel = new RbAnswerInfoModel();
		List<RbAnswerInfoModel> list = rbAnswerInfoMicroService.queryPage(rbAnswerInfoModel, new Pager(), null, queryFields);
		for(RbAnswerInfoModel model: list){
			System.out.println(model.getId());
		}
	}
	
	/**
	 * <p>Discription:[机器人回答数据表查询数据(不分页)]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void queryList(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		RbAnswerInfoModel rbAnswerInfoModel = new RbAnswerInfoModel();
		List<RbAnswerInfoModel> list = rbAnswerInfoMicroService.queryList(rbAnswerInfoModel, null, queryFields);
		for(RbAnswerInfoModel model: list){
			System.out.println(model.getId());
		}
	}
	
	/**
	 * <p>Discription:[机器人回答数据表查询总条数]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void queryCount(){
		RbAnswerInfoModel rbAnswerInfoModel = new RbAnswerInfoModel();
		Long count = rbAnswerInfoMicroService.queryCount(rbAnswerInfoModel, null);
		System.out.println(count);
	}
	
	/**
	 * <p>Discription:[根据id查询机器人回答数据表]</p>
	 * Created on 2017年02月20日
	 * @author:钱永飞
	 */
	@Test
	public void queryById(){
		List<String> queryFields = new ArrayList<String>();
		queryFields.add("id");
		RbAnswerInfoModel model = rbAnswerInfoMicroService.queryById(1l, queryFields);
		System.out.println(model);
	}
	
	/**
	 * <p>Discription:[机器人回答数据表新增]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void save(){
		RbAnswerInfoModel rbAnswerInfoModel = new RbAnswerInfoModel();
//		rbAnswerInfoModel.set
		rbAnswerInfoMicroService.save(rbAnswerInfoModel);
	}
	
	/**
	 * <p>Discription:[机器人回答数据表编辑]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void edit(){
		RbAnswerInfoModel rbAnswerInfoModel = new RbAnswerInfoModel();
//		rbAnswerInfoModel.set
		rbAnswerInfoMicroService.edit(rbAnswerInfoModel);
	}
	
	/**
	 * <p>Discription:[机器人回答数据表单个删除]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void deleteById(){
		System.out.println(rbAnswerInfoMicroService.deleteById(1l));
	}
	
	/**
	 * <p>Discription:[机器人回答数据表批量删除]</p>
	 * Created on 2020年03月20日
	 * @author:钱永飞
	 */
	@Test
	public void deleteByIds(){
		List<Long> ids = new ArrayList<Long>();
		ids.add(1l);
		ids.add(2l);
		System.out.println(rbAnswerInfoMicroService.deleteByIds(ids));
	}
	
}