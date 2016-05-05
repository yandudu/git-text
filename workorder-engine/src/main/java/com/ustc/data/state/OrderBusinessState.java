/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @OrderBusiness.java Create on @2015年11月24日 @下午5:18:10 
 */    
package com.ustc.data.state;

import com.ustc.data.business.OrderHandle;
import com.ustc.data.business.impl.OrderArchive;
import com.ustc.data.business.impl.ShortMessage;
import com.ustc.data.downstreamsystem.DownstreamSystem;
import com.ustc.data.factory.HandleFactory;
import com.ustc.data.factory.impl.OrderHandleFactory;
import com.ustc.data.factory.impl.ShortMessageHandle;
import com.ustc.data.logic.OrderLogic;
import com.ustc.data.model.Workorder;
import com.ustc.data.state.impl.FailState;
import com.ustc.data.state.impl.NewState;
import com.ustc.data.state.impl.SuccState;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class OrderBusinessState {

    
    private OrderState newState;
    private OrderState succState;
    private OrderState failState;
    
    private OrderState state ;
    
	public OrderBusinessState(Workorder order,OrderLogic logic,DownstreamSystem system) {
		newState= new NewState(order,this,logic,system);
		failState =new FailState(order,this);
		succState = new SuccState(order,this);
		state =newState;

	}
	

	
	/**
	 * 
	 * 方法描述：工单发送到下游系统
	 *  根据不同类型发送到对应下游系统
	 * @param system
	 */
	public void newState(){
    
		state.handle();
		
	}
	
	
	/**
	 * 
	 * 方法描述：不同状态工单处理具体实现
	 * @param orderHandle
	 */
	public void handleState(){
		state.handle();	
	}

	
	
	public void setState(OrderState state) {
		this.state = state;
	}

	public OrderState getNewState() {
		return newState;
	}

	public OrderState getSuccState() {
		return succState;
	}

	public OrderState getFailState() {
		return failState;
	}
	
}
