/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderFiled.java Create on @2015年11月24日 @下午5:44:15 
 */    
package com.ustc.data.business.impl;

import com.ustc.data.business.OrderHandle;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class OrderArchive extends OrderHandle {
    /**
     * 下游系统执行成功，工单状态更改为:arch归档
     */
	@Override
	public void handle(Workorder order) {

		System.out.println("执行成功，工单入库归档!...！！");
		order.setState("arch");
	}

}
