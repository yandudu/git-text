/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Tdes.java Create on @2016年2月26日 @下午4:49:08 
 */    
package com.ustc.data.factory;

import java.util.concurrent.CyclicBarrier;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Tdes {

		
			 
	
			    static CyclicBarrier c = new CyclicBarrier(2, new A());
	
			 
	
			    public static void main(String[] args) {
	
			        new Thread(new Runnable() {		
			            public void run() {
		
			                try {
		
			                    c.await();
	
			                } catch (Exception e) {
	
			 
		
			                }
		
			                System.out.println(1);
		
			            }
		
			        }).start();
		
			 
		
			        try {
		
			            c.await();
		
			        } catch (Exception e) {
		
			 
		
			        }
	
			        System.out.println(2);
		
			    }
		
			 
		
			    static class A implements Runnable {
		
			 
	
			        public void run() {
	
			            System.out.println(3);
		
			        }
		
			 
	
			    }
	
			 
		
		
}
