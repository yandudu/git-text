/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @MyThreadFactory.java Create on @2016年2月18日 @上午10:49:51 
 */    
package com.ustc.data.runnable;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class MyThreadFactory implements ThreadFactory {

	private  int  counter;
	private String name;
	private List<String> stats;
	
	public MyThreadFactory(String name) {
		counter =0;
		this.name = name;
		stats= new ArrayList<String>();
	}

	public Thread newThread(Runnable r) {
		Thread t =new Thread(r,name+"-Thread_"+counter);
		counter++;
		stats.add(String.format("%d----%s-----%s\n", t.getId(),t.getName(),new Date()));
		return t;
	}
    
	public String getStats(){
		StringBuffer sb =new StringBuffer();
		Iterator<String> it =stats.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			sb.append("\n");
	
		}
		return sb.toString();
		
	}
}
