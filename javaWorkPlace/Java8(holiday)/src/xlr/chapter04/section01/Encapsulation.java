/**
 * 
 */
package xlr.chapter04.section01;

/**
*@Author:小龙人
*@File Name:Encapsulation.java
*@Created Time:上午11:42:45
*@Introduce Function:封装演示
*/
public class Encapsulation {
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		
		Integer b = new Integer(10);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		// int 转换为String
		String c = a + "";
		String d = String.valueOf(a);
		
		// String转换为int
		String e = "123";
		int f = Integer.parseInt(e);
		
		
	}	
}
