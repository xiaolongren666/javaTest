/**
 * 
 */
package xlr.chapter05.section01;

/**
*@Author:小龙人
*@File Name:SubClass.java
*@Created Time:下午9:49:48
*@Introduce Function:TODO
*/
public class SubClass extends SuperClass { 
	int b;
	
	public SubClass() {
		System.out.println("调用子类构造方法...");
		b = 20;
	}
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		System.out.println("a=" + obj.a + ",b=" + obj.b);
	}
}
