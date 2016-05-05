/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderLogic.java Create on @2015年11月24日 @下午2:19:21 
 */    
package com.ustc.data.logic;

import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public abstract class OrderLogic {
   /**
    * 
    * 方法描述：工单算法逻辑
    */
	public abstract Workorder algorithm(Workorder order);
}
