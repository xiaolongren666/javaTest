/**
 * 
 */
package xlr.chapter04.section03;

/**
*@Author:小龙人
*@File Name:ObjectEqualsDemo.java
*@Created Time:上午11:57:58
*@Introduce Function:TODO
*/
public class ObjectEqualsDemo {
	/**
	 * 程序入口
	 */
	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		System.out.println("a==b:" + (a == b));
//		
//		Integer num1 = new Integer(8);
//		Integer num2 = new Integer(10);
//		Integer num3 = new Integer(8);
//		
//		System.out.println("num1比num1:" + (num1 == num1));
//		System.out.println("num1比num1:" + (num1.equals(num1)));
//		
//		System.out.println("num1比num2:" + (num1 == num2));
//		System.out.println("num1.equals(num2):" + (num1.equals(num2)));
//		
//		System.out.println("num1比num3:" + (num1 == num3));
//		System.out.println("num1.equals(num3):" + (num1.equals(num3)));
		
		Person p1 = new Person("小明", 18);
		Person p2 = new Person("小明", 18);
		System.out.println("p1.equals(p2):" + p1.equals(p2));
	}
}
