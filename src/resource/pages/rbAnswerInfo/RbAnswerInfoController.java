package com.xiaoPang.mainframe.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoPang.mainframe.dto.RbAnswerInfoDTO;
import com.xiaoPang.mainframe.service.RbAnswerInfoService;
import com.camelot.openplatform.common.Pager;
import com.camelot.openplatform.common.DataGrid;
import com.camelot.openplatform.common.ExecuteResult;

/** 
 * Description: [描述该类概要功能介绍]
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2020年 乐享商城
 */
@Controller
@RequestMapping("/sellcenter/rbAnswerInfo")
public class RbAnswerInfoController {
	private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private RbAnswerInfoService rbAnswerInfoService;
	
	
	/**
	 * <p>Discription:[分页查询XXXX集合数据]</p>
	 * Created on 2020年03月20日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/findrbAnswerInfosByPage")
	public String findrbAnswerInfosByPage(RbAnswerInfoDTO rbAnswerInfoDTO,Pager pager,Model model){
		ExecuteResult<DataGrid<RbAnswerInfoDTO>> er = this.rbAnswerInfoService.queryPage(rbAnswerInfoDTO,pager);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(er.isSuccess()){
			DataGrid<RbAnswerInfoDTO> dg = er.getResult();
			if(dg != null){
				//将查询出的列表、总数量封装到分页实体中供页面使用
				pager.setRecords(dg.getRows());
				pager.setTotalCount(dg.getTotal().intValue());
			}
		}else{
			message = er.getErrorMessages().get(0);
		}
		model.addAttribute("pager", pager);
		model.addAttribute("message", message);
		model.addAttribute("rbAnswerInfoDTO", rbAnswerInfoDTO);
		return "/rbAnswerInfo/rbAnswerInfoList";
	}
	
	
	/**
	 * <p>Discription:[跳转到XXX新增页面]</p>
	 * Created on 2020年03月20日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/toSave")
	public String toSave(Model model){
		return "";
	}
	
	
	
	/**
	 * <p>Discription:[新增XXXX]</p>
	 * Created on 2020年03月20日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/save")
	public String save(Model model,RbAnswerInfoDTO rbAnswerInfoDTO){
		ExecuteResult<Boolean> result = this.rbAnswerInfoService.save(rbAnswerInfoDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(!result.isSuccess()){
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("message", message);
		return "";
	}
	
	/**
	 * <p>Discription:[跳转到XXX编辑页面]</p>
	 * Created on 2020年03月20日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/toEdit")
	public String toEdit(RbAnswerInfoDTO rbAnswerInfoDTO,Model model){
		ExecuteResult<RbAnswerInfoDTO> result = this.rbAnswerInfoService.queryRbAnswerInfoDTOByCondition(rbAnswerInfoDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(result.isSuccess()){
			rbAnswerInfoDTO = result.getResult();
		}else{
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("rbAnswerInfoDTO", rbAnswerInfoDTO);
		model.addAttribute("message", message);
		return "";
	}
	
	/**
	 * <p>Discription:[新增XXXX]</p>
	 * Created on 2020年03月20日
	 * @param 
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/edit")
	public String edit(RbAnswerInfoDTO rbAnswerInfoDTO,Model model){
		ExecuteResult<Boolean> result = this.rbAnswerInfoService.edit(rbAnswerInfoDTO);
		//执行结果
		String message = "";
		//判断是否发生异常
		if(!result.isSuccess()){
			message = result.getErrorMessages().get(0);
		}
		model.addAttribute("message", message);
		return "";
	}
	
	
	/**
	 * <p>Discription:[删除XXXX]</p>
	 * Created on 2020年03月20日
	 * @param ids需要删除的数据id集合
	 * @return
	 * @author:中文名字
	 */
	@RequestMapping("/delRbAnswerInfo")
	@ResponseBody
	public Map<String,String> delRbAnswerInfo(String[] ids,Model model){
		Map<String,String> mapResult = new HashMap<String,String>();
		//存放执行结果
		String message = "";
		if(ids != null && ids.length > 0){
			//将需要删除的XXXX实体id存放到对应的dto中
			RbAnswerInfoDTO rbAnswerInfoDTO;
			List<RbAnswerInfoDTO> rbAnswerInfoDTOList = new ArrayList<RbAnswerInfoDTO>();
			for(String id : ids){
				rbAnswerInfoDTO = new RbAnswerInfoDTO();
				rbAnswerInfoDTO.setId(new Long(id));
				rbAnswerInfoDTOList.add(rbAnswerInfoDTO);
			}
			//删除XXXX
			ExecuteResult<Boolean> result = this.rbAnswerInfoService.delete(rbAnswerInfoDTOList);
			if(!result.isSuccess()){
				message = result.getErrorMessages().get(0);
			}
		}else{
			message = "没有要删除的项!";
		}
		mapResult.put("message",message);
		return mapResult;
	}
	
}
