/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Task.java Create on @2016年2月17日 @下午12:00:05 
 */    
package com.ustc.data.runnable;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.TimeUnit;



/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Task implements Runnable {
   
	

	public void run() {
		
//		int a =Integer.valueOf("TTT");
//		Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
	
		try {
		TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
   
	public static void main(String[] args) {
//		Task task =new Task();
//		Thread t = new Thread(task);
//		t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
//			
//			public void uncaughtException(Thread t, Throwable e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		ExceptionHandler a =new ExceptionHandler();
//		t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
//			
//			public void uncaughtException(Thread t, Throwable e) {
//				System.out.println(1);
//				
//			}
//		});
//		t.start();
		MyThreadFactory myFactory =new MyThreadFactory("myfactory");
		Task task =new Task();
		Thread t ;
		System.out.println("Thread.....");
		for (int i = 0; i <10; i++) {
			t=myFactory.newThread(task);
			t.start();
//			System.out.println(myFactory.getStats());
		}
		System.out.printf("Factory stats:\n"); System.out.printf("%s\n",myFactory.getStats());
	}
}
