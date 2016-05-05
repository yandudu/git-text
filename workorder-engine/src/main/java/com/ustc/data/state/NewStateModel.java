/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @NewStateModel.java Create on @2015年12月7日 @下午4:37:24 
 */    
package com.ustc.data.state;

import com.ustc.data.downstreamsystem.DownstreamSystem;
import com.ustc.data.logic.OrderLogic;
import com.ustc.data.model.Workorder;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class NewStateModel {
    private Workorder order;
    
    
    
    public NewStateModel(Workorder order) {
		super();
		this.order = order;
	}
	public Workorder logicSystem(OrderLogic logic,DownstreamSystem system){
        logic(logic);   	
    	return System(system);
    }
	/**
	 * 
	 * 方法描述：工单发送到对应算法逻辑
	 *   根据不同类型发送到对应算法中
	 * @param system
	 */
	private void logic(OrderLogic logic){
		order= logic.algorithm(order);
	}
	
	/**
	 * 
	 * 方法描述：工单发送到下游系统
	 *  根据不同类型发送到对应下游系统
	 * @param system
	 */
	private Workorder System(DownstreamSystem system){
		return system.doSystem(order);
		
	}
}
