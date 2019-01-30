/**
 * 
 */
package xlr.chapter03.section05;

/**
*@Author:小龙人
*@File Name:Counter.java
*@Created Time:下午9:39:38
*@Introduce Function:TODO
*/
public class Counter {
	/**
	 * 静态变量，用于统计创建对象的个数
	 */
	public static int count = 0;
	public int a = 0;

	/**
	 * 构造方法
	 */
	public Counter() {
		a++;
		count++;
	}
	
	/**
	 * 静态方法，用于输出count的个数
	 */
	public static void printCount() {
		System.out.println("创建的实例的个数为:" + count);
	}
	
	/**
	 * 用于输出a的个数
	 */
	public  void printA() {
		System.out.println("a:" + a);
	}
	
	/**
	 * 入口程序
	 */
	public static void main(String[] args) {
		Counter obj = new Counter();
		obj = new Counter();
		obj = new Counter();
		
		Counter.printCount();
		obj.printA();
	}
}


