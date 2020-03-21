package com.xiaoPang.mainframe.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.xiaoPang.mainframe.model.Page;
import com.xiaoPang.mainframe.dao.RbAnswerInfoDao;
import com.xiaoPang.mainframe.model.RbAnswerInfoModel;
import com.xiaoPang.mainframe.service.RbAnswerInfoService;
import com.lxmall.mainframe.utils.ParamValidateUtils;

/** 
 * Description: [机器人回答数据表服务实现]
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城  
 */
@Service("rbAnswerInfoService")
public class RbAnswerInfoServiceImpl implements RbAnswerInfoService {
	
	/**
	 * <p>Discription:[机器人回答数据表dao]</p>
	 */	
	@Resource
	private RbAnswerInfoDao rbAnswerInfoDao;
	
	/**
	 * <p>Discription:[机器人回答数据表数据分页查询]</p>
	 * Created on 2020年03月20日
	 * @param pager 机器人回答数据表数据分页条件
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @param queryFields 机器人回答数据表数据查询字段
	 * @return List<RbAnswerInfoModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	public List<RbAnswerInfoModel> queryPageRbAnswerInfo(Page page,RbAnswerInfoModel rbAnswerInfoModel,
			String queryFields){
			
		List<RbAnswerInfoModel> listRbAnswerInfo = new ArrayList<RbAnswerInfoModel>();
		try{
			//判断参数是否为空
			if(ParamValidateUtils.isEmpty(page)){
				return null;
			}else{
				List<String> lis = new ArrayList<String>();
				if(ParamValidateUtils.isEmpty(queryFields)){
					lis = null;
				}else{
					lis = Arrays.asList(queryFields.split(","));
				}
				listRbAnswerInfo = this.rbAnswerInfoDao.queryPageRbAnswerInfo(page,rbAnswerInfoModel,lis);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return listRbAnswerInfo;
	}
	
	
	/**
	 * <p>Discription:[机器人回答数据表数据不分页查询]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @param queryFields 机器人回答数据表数据查询字段
	 * @return List<RbAnswerInfoModel>数据
	 *													       	 
	 * @author:钱永飞
	 */
	public List<RbAnswerInfoModel> queryListRbAnswerInfo(RbAnswerInfoModel rbAnswerInfoModel,String queryFields){
	
		List<RbAnswerInfoModel> listRbAnswerInfo = new ArrayList<RbAnswerInfoModel>();
		try{
			List<String> lis = new ArrayList<String>();
			if(ParamValidateUtils.isEmpty(queryFields)){
				lis = null;
			}else{
				lis = Arrays.asList(queryFields.split(","));
			}
			listRbAnswerInfo = this.rbAnswerInfoDao.queryListRbAnswerInfo(rbAnswerInfoModel,lis);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return listRbAnswerInfo;
	}
	
	
	/**
	 * <p>Discription:[机器人回答数据表数据查询总条数]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @return 查询条数	 
	 * @author:钱永飞
	 */
	public Long queryCountRbAnswerInfo(RbAnswerInfoModel rbAnswerInfoModel){
		
		Long count = (long)0;
		try{
			count = this.rbAnswerInfoDao.queryCountRbAnswerInfo(rbAnswerInfoModel);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[根据id查询机器人回答数据表数据]</p>
	 * Created on 2020年03月20日
	 * @param id 机器人回答数据表数据id
	 * @return RbAnswerInfoModel 单条数据	 
	 * @author:钱永飞
	 */
	public RbAnswerInfoModel queryRbAnswerInfoById(String id){
		
		RbAnswerInfoModel model = new RbAnswerInfoModel();
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return null;
			}else{
				model = this.rbAnswerInfoDao.queryRbAnswerInfoById(id,null);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return model;
	}
	
	/**
	 * <p>Discription:[机器人回答数据表数据新增]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据
	 * @return String 添加成功的id
	 
	 * @author:钱永飞
	 */
	public int save(RbAnswerInfoModel rbAnswerInfoModel){
	
		int count = 0;
		try{
			if(ParamValidateUtils.isEmpty(rbAnswerInfoModel)){
				return 0;
			}else{
				count = this.rbAnswerInfoDao.addRbAnswerInfo(rbAnswerInfoModel);
			}
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[机器人回答数据表数据编辑]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据
	 * @return 成功条数 	
	 *								    
	 * @author:钱永飞
	 */
	public int edit(RbAnswerInfoModel rbAnswerInfoModel){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(rbAnswerInfoModel) || ParamValidateUtils.isEmpty(rbAnswerInfoModel.getCode())){
				return 0;
			}else{
				count = this.rbAnswerInfoDao.updateRbAnswerInfo(rbAnswerInfoModel);
			}	
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[机器人回答数据表数据删除]</p>
	 * Created on 2020年03月20日
	 * @param id 机器人回答数据表数据id
	 * @return 成功条数 	
	 *								   
	 * @author:钱永飞
	 */
	public int removeRbAnswerInfoById(String id){
	
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(id)){
				return 0;
			}else{
				count = this.rbAnswerInfoDao.removeRbAnswerInfoById(id);
			}		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}
	
	/**
	 * <p>Discription:[机器人回答数据表数据批量删除]</p>
	 * Created on 2020年03月20日
	 * @param ids 机器人回答数据表数据id的集合
	 * @return 成功条数
	 *								  	 
	 * @author:钱永飞
	 */
	public int removeRbAnswerInfoByIds(String ids){
		
		Integer count = 0;
		try{
			if(ParamValidateUtils.isEmpty(ids)){
				return 0;
			}else{
				List<String> lis = Arrays.asList(ids.split(","));
				count = this.rbAnswerInfoDao.removeRbAnswerInfoByIds(lis);
			}
						
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return count;
	}

}