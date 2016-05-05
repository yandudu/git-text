/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderState.java Create on @2015年12月6日 @下午4:19:38 
 */    
package com.ustc.data.state;

import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public abstract class OrderState {
	protected Workorder order;
	protected OrderBusinessState state;

	public abstract Workorder handle();
}
