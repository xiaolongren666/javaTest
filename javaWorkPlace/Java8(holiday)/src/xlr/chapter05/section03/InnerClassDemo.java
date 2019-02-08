/**
 * 
 */
package xlr.chapter05.section03;

/**
*@Author:小龙人
*@File Name:InnerClassDemo.java
*@Created Time:2019年2月8日下午8:43:52
*@Introduce Function:匿名内部类
*/
public class InnerClassDemo {
	public static void main(String[] args) {
		System.out.println(new Object() {
			@Override
			public String toString() {
				return "匿名内部类";
			}
		});
	}
}
