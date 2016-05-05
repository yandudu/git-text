/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @StatusFactory.java Create on @2015年11月25日 @上午11:53:12 
 */    
package com.ustc.data.factory;

import com.ustc.data.business.OrderHandle;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public abstract class HandleFactory {
	/**
	 * 
	 * 方法描述：工单执行工厂
	 * @return
	 */
   public abstract OrderHandle createOrderHandle(String state);



}
