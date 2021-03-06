/**
 * 
 */
package xlr.chapter05.section03;

/**
*@Author:小龙人
*@File Name:StaticInnerClass.java
*@Created Time:2019年2月8日下午8:38:18
*@Introduce Function:静态内部类
*/
public class StaticInnerClassDemo {
	@SuppressWarnings("unused")
	private int prop1 = 5;
	private static int prop2 = 9;
	
	static class StaticInnerClass {
		/**
		 *  静态内部类里可以包含静态成员
		 */
		@SuppressWarnings("unused")
		private static int age;
		
		public void accessOuterProp() {
			// 不可以访问非静态变量
			// System.out.println(prop1);
			// 可以访问静态变量
			System.out.println(prop2);
		}
	}
}
