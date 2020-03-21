package com.xiaoPang.mainframe.service;

import java.util.List;

import com.xiaoPang.mainframe.model.Page;
import com.xiaoPang.mainframe.model.RbAnswerInfoModel;

/**
 * Description: [机器人回答数据表服务]
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城  
 */
public interface RbAnswerInfoService {
	
	
	/**
	 * <p>Discription:[机器人回答数据表数据分页查询]</p>
	 * Created on 2020年03月20日
	 * @param pager 机器人回答数据表数据分页条件
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @param queryFields 机器人回答数据表数据查询字段集合
	 * @return List<RbAnswerInfoModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	 public	List<RbAnswerInfoModel> queryPageRbAnswerInfo(Page page, RbAnswerInfoModel rbAnswerInfoModel, String queryFields);
	 
	 /**
	 * <p>Discription:[机器人回答数据表数据不分页查询]</p>
	 * Created on 2020年03月20日
	 * @param pager 机器人回答数据表数据分页条件
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @param queryFields 机器人回答数据表数据查询字段集合
	 * @return List<RbAnswerInfoModel>分页数据
	 *													       	 
	 * @author:钱永飞
	 */
	 public	List<RbAnswerInfoModel> queryListRbAnswerInfo(RbAnswerInfoModel rbAnswerInfoModel, String queryFields);
	
	/**
	 * <p>Discription:[机器人回答数据表数据查询总条数]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据查询条件
	 * @return 查询条数	 
	 * @author:钱永飞
	 */
	public Long queryCountRbAnswerInfo(RbAnswerInfoModel rbAnswerInfoModel);
	
	/**
	 * <p>Discription:[根据id查询机器人回答数据表数据]</p>
	 * Created on 2020年03月20日
	 * @param id 机器人回答数据表数据id
	 * @return RbAnswerInfoModel 单条数据	 
	 * @author:钱永飞
	 */
	public RbAnswerInfoModel queryRbAnswerInfoById(String id);
	
	
	
	
	/**
	 * <p>Discription:[机器人回答数据表数据新增]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据
	 * @return String 添加成功的id
	 * @author:钱永飞
	 */
	public int save(RbAnswerInfoModel rbAnswerInfoModel);
	
	/**
	 * <p>Discription:[机器人回答数据表数据编辑]</p>
	 * Created on 2020年03月20日
	 * @param rbAnswerInfoModel 机器人回答数据表数据
	 * @return 成功条数 
	 * @author:钱永飞
	 */
	public int edit(RbAnswerInfoModel rbAnswerInfoModel);
	
	/**
	 * <p>Discription:[机器人回答数据表数据删除]</p>
	 * Created on 2020年03月20日
	 * @param id 机器人回答数据表数据id
	 * @return 成功条数 	
	 * @author:钱永飞
	 */
	public int removeRbAnswerInfoById(String id);
	
	/**
	 * <p>Discription:[机器人回答数据表数据批量删除]</p>
	 * Created on 2020年03月20日
	 * @param ids 机器人回答数据表数据id的集合
	 * @return 成功条数 
	 * @author:钱永飞
	 */
	public int removeRbAnswerInfoByIds(String ids);
	
}
