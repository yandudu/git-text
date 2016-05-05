/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Thread.java Create on @2016年1月8日 @上午10:38:51 
 */    
package com.ustc.data.runnable;

import java.util.Date;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Thread1 extends Thread{
	  private Thread parent;  
	    public Thread1(Thread parent){  
	        this.parent = parent;  
	    }  
	      
//	    public void run() {  
//	        while (true) {  
//	            System.out.println(Thread.currentThread().getName()+"sub thread is running...");  
//	            long now = System.currentTimeMillis();  
//	            while (System.currentTimeMillis() - now < 2000) {  
//	                // 为了避免Thread.sleep()而需要捕获InterruptedException而带来的理解上的困惑,  
//	                // 此处用这种方法空转2秒  
//	            }  
//	            System.out.println(parent.getName());  
//	            parent.interrupt();  
//	        }  
//	    }  
	    public void run() {  
	      for (int i = 0; i < 10; i++) {
			System.out.println(new Date());
		     if(Thread1.currentThread().isInterrupted()){
					System.out.println("线程停止！");
				   
				}else {
					System.out.println("线程++");
				}
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
			     if(Thread1.currentThread().isInterrupted()){
						System.out.println("----线程停止！");
					   
					}else {
						System.out.println("---线程++");
					}
				System.out.println("sleep stop !!!");

			}
		}
	    }  
	    public static void main(String[] args){  
//	        Thread1 t = new Thread1(Thread.currentThread());  
//	        t.start();  
//	        try {  
//	            t.join(); 
//	           
//	        } catch (InterruptedException e) {  
//	            System.out.println(Thread.currentThread().getName()+" Parent thread will die...");  
//	        }  
//	        System.out.println("go......");
	    	
	    	
	    	Thread1 t = new Thread1(Thread.currentThread());  
	        t.start();
	   
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				System.out.println("sleep error !!!");
//				e.printStackTrace();
			}
			t.interrupt();
	    	
//	    	
//	    	Thread1 t = new Thread1(Thread.currentThread());  
//	        t.start();
//	        
//	        Calorter c =new Calorter(1);
//			Thread thread = new Thread(c);
//			thread.start();
//			try {
//			t.join();
//			thread.join();
//		} catch (InterruptedException e) {
//			System.out.println("sleep error !!!");
//
//		}
//			System.out.println("go............ !!!");
	    }  
}
