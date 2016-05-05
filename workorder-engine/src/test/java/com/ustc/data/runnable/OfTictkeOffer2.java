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
public class OfTictkeOffer2 implements Runnable{
	private Cinema cinema;

	public OfTictkeOffer2(Cinema cinema) {
		super();
		this.cinema = cinema;
	}

	public void run() {
		cinema.meVache1(5); 
		cinema.sellVache2(2);
		cinema.sellVache2(2);
		cinema.sellVache2(5);
		cinema.sellVache2(3);
		cinema.meVache1(5);

	}
   
	
	public static void main(String[] args) {
		Cinema cinema =new Cinema();
		Cinema cinema1 =new Cinema();
		TictkeOffer tick1 =new TictkeOffer(cinema);
		Thread t1 =new Thread(tick1,"tick1");
		OfTictkeOffer2 tick2 =new OfTictkeOffer2(cinema1);
		Thread t2 =new Thread(tick2,"tick2");
		t1.start();
		t2.start();
	}
}
