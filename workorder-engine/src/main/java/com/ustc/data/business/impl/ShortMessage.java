/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @ShortMessage.java Create on @2015年11月24日 @下午5:48:16 
 */    
package com.ustc.data.business.impl;

import com.ustc.data.business.OrderHandle;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class ShortMessage extends OrderHandle {
    
	/**
	 * 下游系统执行失败，发送短信提示
	 */
	@Override
	public void handle(Workorder order) {
		System.out.println("执行失败，发送短信通知...");

	}

}
