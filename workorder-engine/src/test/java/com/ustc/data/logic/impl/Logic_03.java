/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Logic_02.java Create on @2015年11月24日 @下午2:52:46 
 */    
package com.ustc.data.logic.impl;

import com.ustc.data.logic.OrderLogic;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Logic_03 extends OrderLogic {


  public Workorder algorithm(Workorder order) {
	System.out.println("工单业务类型: "+order.getServCode()+" 进入Logic_03算法，处理中...");
	return order;
	}

}
