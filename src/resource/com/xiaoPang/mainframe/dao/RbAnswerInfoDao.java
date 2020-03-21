package com.xiaoPang.mainframe.dao;

import com.xiaoPang.mainframe.model.RbAnswerInfoModel;
import com.xiaoPang.mainframe.model.Page;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/** 
 * <p>Description: [机器人回答数据表dao]</p>
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public interface RbAnswerInfoDao{
	
	/**
	* 分页查询固定参数
	*/
	List<RbAnswerInfoModel> queryPageRbAnswerInfo(@Param("page")Page page, @Param("entity")RbAnswerInfoModel entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询固定参数
	*/
	List<RbAnswerInfoModel> queryListRbAnswerInfo(@Param("entity")RbAnswerInfoModel entity, @Param("queryFields")List queryFields);
	
	
	/**
	* 查询总数量
	*/
	Long queryCountRbAnswerInfo(@Param("entity")RbAnswerInfoModel entity);
	
	/**
	* 查询单个实体
	*/
	RbAnswerInfoModel queryRbAnswerInfoById(@Param("id")String id,  @Param("queryFields")List queryFields);
	
	/**
	* <!-- 新增 -->
	*/
	int addRbAnswerInfo(RbAnswerInfoModel entity);
	
	/**
	* <!-- 修改 -->
	*/
	int updateRbAnswerInfo(RbAnswerInfoModel entity);
	
	/**
	* <!-- 批量删除 -->
	*/
	int removeRbAnswerInfoByIds(List code);
	
	/**
	* <!-- 删除 -->
	*/
	int removeRbAnswerInfoById(@Param("id")String id);
	
	
}
