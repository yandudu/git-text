/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @System_01.java Create on @2015年11月24日 @下午2:44:50 
 */    
package com.ustc.data.downstreamsystem.impl;

import com.ustc.data.downstreamsystem.DownstreamSystem;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class System_01 extends DownstreamSystem {

	public Workorder doSystem(Workorder order) {
		System.out.println("工单发送至下游系统System_01....");
		order.setState("succ");
		System.out.println("下游系统返回工单状态: "+order.getState());
		return order;
	}

}
