/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Logic_01.java Create on @2015年11月24日 @下午2:52:24 
 */    
package com.ustc.data.logic.impl;

import com.ustc.data.logic.OrderLogic;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */

public class Logic_01 extends OrderLogic {
	/**
	 * 逻辑算法Logic_01
	 */
	  public Workorder algorithm(Workorder order) {
			System.out.println("工单业务类型: "+order.getServCode()+" 进入Logic_01算法，处理中...");
			return order;

		}

}
