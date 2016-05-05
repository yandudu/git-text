/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @WorkOrderMain.java Create on @2015年11月24日 @下午5:23:18 
 */    
package com.ustc.data;


import com.ustc.data.downstreamsystem.impl.System_01;
import com.ustc.data.downstreamsystem.impl.System_02;
import com.ustc.data.downstreamsystem.impl.System_03;
import com.ustc.data.logic.impl.Logic_01;
import com.ustc.data.logic.impl.Logic_02;
import com.ustc.data.logic.impl.Logic_03;
import com.ustc.data.model.Workorder;
import com.ustc.data.state.OrderBusinessState;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class WorkOrderMain {
	
	public static void main(String[] args) {
	
		System.out.println("--------serv_01->system_01、logic_01-------------");  

		Workorder order =new Workorder();
		order.setServCode("serv_01");		
		OrderBusinessState business =new OrderBusinessState(order,new Logic_01(),new System_01());		
		//工单发送下游系统
		business.newState();
		//根据工单状态处理
		business.handleState();
		
		System.out.println("---------serv_02->system_02、logic_02-------------");  
		Workorder order_1 =new Workorder();
		order_1.setServCode("serv_02");
		OrderBusinessState business_1 =new OrderBusinessState(order_1,new Logic_02(),new System_02());
		//工单发送下游系统
		business_1.newState();
		//根据工单状态处理
		business_1.handleState();
		
		System.out.println("---------变更serv_01->system_02、logic_02-------------");  
		Workorder order_2 =new Workorder();
		order_2.setServCode("serv_01");
		OrderBusinessState business_2 =new OrderBusinessState(order_2,new Logic_02(),new System_02());
//		//工单逻辑算法、发送下游系统
		business_2.newState();
//		//根据工单状态处理
		business_2.handleState();

		
		System.out.println("------------变更serv_02->system_01、logic_01-------------");  		
		Workorder order_3 =new Workorder("4","serv_02","new");
		order_3.setServCode("serv_02");
		OrderBusinessState business_3 =new OrderBusinessState(order_3,new Logic_01(),new System_01());
		//工单逻辑算法、发送下游系统
		business_3.newState();
		//根据工单状态处理
		business_3.handleState();
	
		System.out.println("-------------新增serv_03->system_03、logic_03-------------");
		//新增 工单业务类型serv_03 、算法逻辑system_03、下游系统logic_03
		Workorder order_4 =new Workorder();
		order_4.setServCode("serv_03");
		OrderBusinessState business_4 =new OrderBusinessState(order_4,new Logic_03(),new System_03());
		//工单逻辑算法、发送下游系统
		business_4.newState();
		//根据工单状态处理
		business_4.handleState();
	}
  

}
