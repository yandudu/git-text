/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @PrimeGernt.java Create on @2016年1月7日 @下午12:01:21 
 */    
package com.ustc.data.runnable;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class PrimeGernt extends Thread{
	   private int number;
	    
		public PrimeGernt(int number) {

		this.number = number;
	}

		public void run() {
		 for (int i = 0; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"--"+number+"--"+i);
//			System.out.println(Thread.currentThread()+"--"+number+"--"+i);
			
		}
	}
}
