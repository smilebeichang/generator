package com.xiaoPang.mainframe.model;

import java.io.Serializable;
/** 
 * <p>Description: [机器人回答数据表model]</p>
 * Created on 2020年03月20日
 * @author  <a href="mailto: qianyongfei@lxmall.com">钱永飞</a>
 * @version 1.0 
 * Copyright (c) 2016 乐享商城  
 */
public class RbAnswerInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键CODE
     */
	private String code;
	/**
     * 问题主键
     */
	private String patternCode;
	/**
     * 内容
     */
	private String content;
	/**
     * 创建日期
     */
	private java.util.Date createDate;
	/**
     * 创建人工号
     */
	private String createrCode;
	/**
     * 状态
     */
	private String status;
	/**
     * 后续执行方法名
     */
	private String method;
	
	// setter and getter
	/**
	* <p>Discription:[主键CODE]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getCode(){
		return code;
	}
	/**
	* <p>Discription:[主键CODE]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setCode(String code){
		this.code = code;
	}
	/**
	* <p>Discription:[问题主键]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getPatternCode(){
		return patternCode;
	}
	/**
	* <p>Discription:[问题主键]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setPatternCode(String patternCode){
		this.patternCode = patternCode;
	}
	/**
	* <p>Discription:[内容]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getContent(){
		return content;
	}
	/**
	* <p>Discription:[内容]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setContent(String content){
		this.content = content;
	}
	/**
	* <p>Discription:[创建日期]</p>
	* Created on 2020年03月20日
	* @return java.util.Date
    * @author:钱永飞
    */
	public java.util.Date getCreateDate(){
		return createDate;
	}
	/**
	* <p>Discription:[创建日期]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	* <p>Discription:[创建人工号]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getCreaterCode(){
		return createrCode;
	}
	/**
	* <p>Discription:[创建人工号]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setCreaterCode(String createrCode){
		this.createrCode = createrCode;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getStatus(){
		return status;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setStatus(String status){
		this.status = status;
	}
	/**
	* <p>Discription:[后续执行方法名]</p>
	* Created on 2020年03月20日
	* @return String
    * @author:钱永飞
    */
	public String getMethod(){
		return method;
	}
	/**
	* <p>Discription:[后续执行方法名]</p>
	* Created on 2020年03月20日
	* @author:钱永飞
	*/
	public void setMethod(String method){
		this.method = method;
	}
}
