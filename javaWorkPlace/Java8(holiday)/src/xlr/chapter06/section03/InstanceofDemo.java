/**
 * 
 */
package xlr.chapter06.section03;

/**
*@Author:小龙人
*@File Name:InstanceofDemo.java
*@Created Time:2019年2月9日下午6:41:11
*@Introduce Function:Instanceof测试用例
*/
public class InstanceofDemo {
	public static void main(String[] args) {
		String str = "Hello";
		Object obj = "Hello";
		
		System.out.println("是否:" + (obj instanceof Object));
		System.out.println("是否:" + (str instanceof Object));
	}
}
