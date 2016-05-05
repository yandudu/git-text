/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderFiledFactory.java Create on @2015年11月25日 @上午11:55:45 
 */    
package com.ustc.data.factory.impl;

import com.ustc.data.business.OrderHandle;
import com.ustc.data.business.impl.OrderArchive;
import com.ustc.data.business.impl.ShortMessage;
import com.ustc.data.factory.HandleFactory;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class OrderHandleFactory extends HandleFactory {
    /**
     * 工厂方法
     */
	
	@Override
	public OrderHandle createOrderHandle(String state) {
		
		 return new OrderArchive();
	}






}
