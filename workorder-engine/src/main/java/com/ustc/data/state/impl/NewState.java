/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Succ.java Create on @2015年12月6日 @下午4:27:48 
 */    
package com.ustc.data.state.impl;

import com.ustc.data.business.impl.OrderArchive;
import com.ustc.data.business.impl.ShortMessage;
import com.ustc.data.downstreamsystem.DownstreamSystem;
import com.ustc.data.logic.OrderLogic;
import com.ustc.data.model.Workorder;
import com.ustc.data.state.NewStateModel;
import com.ustc.data.state.OrderBusinessState;
import com.ustc.data.state.OrderState;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class NewState extends OrderState {
	private OrderLogic logic;
	private	DownstreamSystem system;
	private NewStateModel model;
	/**
	 * @param order
	 */
	public NewState(Workorder order,OrderBusinessState state,OrderLogic logic,DownstreamSystem system) {
		//super(order);
		this.order=order;
		this.state =state;
		this.logic=logic;
		this.system=system;
	}

   
	
    /**
     * 状态：新建
     * 包含工单的逻辑算法处理和下发到下游系统
     */
	@Override
	public Workorder handle() {
		model =new NewStateModel(order);
		order=model.logicSystem(logic, system);

		if("fail".equals(order.getState())){
			
			state.setState(state.getFailState());
			
		    }
		else if("succ".equals(order.getState())){
			
			state.setState(state.getSuccState());
			
			}	
		return order;
	}

}
