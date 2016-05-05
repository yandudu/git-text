/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Calorter.java Create on @2016年1月6日 @下午6:22:59 
 */    
package com.ustc.data.runnable;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;


/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Calorter implements Runnable{
   private int number;
    
	public Calorter(int number) {

	this.number = number;
}

	public void run() {
	 for (int i = 0; i <=10; i++) {
			if(Thread.currentThread().isInterrupted()){
				System.out.println(Thread.currentThread().getName()+"--"+number+"--"+i+" 线程停止！");
			    return; //跳出，提前结束线程
			}
		System.out.println(Thread.currentThread().getName()+"--"+number+"--"+i);

		 try {
				throw new InterruptedException();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	}
	 


	}

	
public static void main(String[] args) {
	for (int i = 0; i <=10; i++) {
		Calorter c =new Calorter(i);
		Thread thread = new Thread(c);
//		thread.setName(String.valueOf(i));		
		thread.start();
		thread.interrupt();
	}
	
}
}
