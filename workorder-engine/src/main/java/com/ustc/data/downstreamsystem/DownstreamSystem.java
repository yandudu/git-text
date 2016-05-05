/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @DownstreamSystem.java Create on @2015年11月24日 @下午2:44:14 
 */    
package com.ustc.data.downstreamsystem;

import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public abstract class DownstreamSystem {

	 public abstract Workorder doSystem(Workorder order);
}
