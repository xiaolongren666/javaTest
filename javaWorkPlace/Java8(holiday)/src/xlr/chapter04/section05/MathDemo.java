/**
 * 
 */
package xlr.chapter04.section05;

import java.util.Date;

/**
*@Author:小龙人
*@File Name:MathDemo.java
*@Created Time:下午8:00:06
*@Introduce Function:TODO
*/
public class MathDemo {
	public static void main(String[] args) {
		Date dateNow = new Date();
		System.out.println(dateNow);
		
		Date date = new Date(8000);
		System.out.println(date);
		
		System.out.println(dateNow.after(date));
		
	}
}
