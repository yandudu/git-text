/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @Cinema.java Create on @2016年2月22日 @下午3:02:34 
 */    
package com.ustc.data.runnable;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class Cinema {
   private long vache1;
   private long vache2;
   private final Object cont1 ,cont2;
public Cinema() {
	
	this.vache1 = 20;
	this.vache2 = 20;
	this.cont1 = new Object();
	this.cont2 = new Object();
}
   public boolean  sellVache1(int number){
//	   synchronized (cont1) {
	   synchronized (this) {
		   try
		    {
			System.out.println(Thread.currentThread().getName()+ " sellVache1 this is "+ vache1);
		     Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		     e.getMessage();
		    }
		if(number <vache1){
			vache1 -=number;
			return true;
		}else{
			return false;
		}
	}
	   
   }
   public boolean  sellVache2(int number){
//	   synchronized (cont2) {
	   synchronized (this) {
		    try
		    {
			System.out.println(Thread.currentThread().getName()+ " sellVache2 this is "+ vache2);
		     Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		     e.getMessage();
		    }

		if(number <vache2){
			vache2 -=number;
			return true;
		}else{
			return false;
		}
	}
	   
   }
   
   public boolean  meVache1(int number){
//	  synchronized (cont1) {
	
	   synchronized (this) {
		    try
		    {
		   System.out.println(Thread.currentThread().getName()+ " meVache1 this is "+ vache1);
		     Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		     e.getMessage();
		    }
		   
		if(number <vache1){
			vache1 +=number;
			return true;
		}else{
			return false;
		}
	}
	   
   }
   public boolean  meVache2(int number){
//	   synchronized (cont2) {
	   synchronized (this) {
		   try
		    {
			System.out.println(Thread.currentThread().getName()+ " meVache2 this is "+ vache2);
		     Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		     e.getMessage();
		    }
		if(number <vache2){
			vache2 +=number;
			return true;
		}else{
			return false;
		}
		
		
	}
	   
   }
public long getVache1() {
	return vache1;
}
public long getVache2() {
	return vache2;
}
}
