/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Succ.java Create on @2015年12月6日 @下午4:27:48 
 */    
package com.ustc.data.state.impl;

import com.ustc.data.business.OrderHandle;
import com.ustc.data.factory.HandleFactory;
import com.ustc.data.factory.impl.ShortMessageHandle;
import com.ustc.data.model.Workorder;
import com.ustc.data.state.OrderBusinessState;
import com.ustc.data.state.OrderState;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class FailState extends OrderState {

	

	/**
	 * @param order
	 */
	public FailState(Workorder order,OrderBusinessState state) {
		this.order =order;
		this.state =state;
	}

     /**
      * 状态:失败
      * 调用工厂生成对应处理方式
      */
	@Override
	public Workorder handle() {
		HandleFactory	handleFactory= new ShortMessageHandle();
		OrderHandle	orderHandle = handleFactory.createOrderHandle(order.getState());
		orderHandle.handle(order);	
		return null;
	}

}
