/**        
 * Copyright (c) 2014 by 苏州科大国创信息技术有限公司.    
 *
 * @{#} @TictkeOffer.java Create on @2016年2月22日 @下午3:15:40 
 */    
package com.ustc.data.runnable;

/**    
 *    
 * @author <a href="mailto:dong.liubin@ustcinfo.com">dong.liubin</a>
 *  
 */
public class TictkeOffer implements Runnable{
	private Cinema cinema;

	public TictkeOffer(Cinema cinema) {
		super();
		this.cinema = cinema;
	}

	public void run() {
	
		cinema.sellVache1(2);
		cinema.sellVache1(2);
		cinema.sellVache1(5);
		cinema.sellVache1(3);
		cinema.meVache2(2);

	}

}
