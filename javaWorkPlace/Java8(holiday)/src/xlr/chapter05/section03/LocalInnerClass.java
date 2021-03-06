/**
 * 
 */
package xlr.chapter05.section03;

/**
*@Author:小龙人
*@File Name:LocalInnerClass.java
*@Created Time:2019年2月8日下午8:31:08
*@Introduce Function:局部内部类
*/
public class LocalInnerClass {
	public static void main(String[] args) {
		/**
		 *  定义局部内部类
		*@Author:小龙人
		*@File Name:LocalInnerClass.java
		*@Created Time:2019年2月8日下午8:37:36
		*@Introduce Function:TODO
		 */
		class InnerBase {
			int a;
		}
		
		/**
		 *  定义局部内部类的子类
		*@Author:小龙人
		*@File Name:LocalInnerClass.java
		*@Created Time:2019年2月8日下午8:37:42
		*@Introduce Function:TODO
		 */
		class InnerSub extends InnerBase {
			int b;
		}
		
		//创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub对象的a和b实例变量是:" + is.a + "," + is.b);
	}
	
	public void test() {
		// 局部内部类在方法外部不能访问的
		// InnerBase is = new InnerBase();
	}
}
