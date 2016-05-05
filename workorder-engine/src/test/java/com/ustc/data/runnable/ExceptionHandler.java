/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @ExceptionHandler.java Create on @2016年2月17日 @上午11:57:31 
 */    
package com.ustc.data.runnable;

import java.lang.Thread.UncaughtExceptionHandler;



/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public  class ExceptionHandler implements UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("thread: "+t.getId());
		e.printStackTrace(System.out);
	}

}
