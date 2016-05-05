/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Workorder.java Create on @2015年11月24日 @下午2:26:41 
 */    
package com.ustc.data.model;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Workorder {
	
	//工单ID
	private String sheetId;
	
    //业务类型编码
	private String servCode;
	
	//工单状态
	private String state="new";
	
	
	public Workorder(String sheetId,  String servCode, String state) {
		super();
		this.state = state;
		this.sheetId = sheetId;
		this.servCode = servCode;
	}
	public Workorder() {
		super();
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSheetId() {
		return sheetId;
	}

	public void setSheetId(String sheetId) {
		this.sheetId = sheetId;
	}

	public String getServCode() {
		return servCode;
	}

	public void setServCode(String servCode) {
		this.servCode = servCode;
	}
   
}
