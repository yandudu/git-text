/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderHandle.java Create on @2015年11月24日 @下午5:42:22 
 */    
package com.ustc.data.business;

import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public abstract class OrderHandle {
     
	public abstract void handle(Workorder order);
}
