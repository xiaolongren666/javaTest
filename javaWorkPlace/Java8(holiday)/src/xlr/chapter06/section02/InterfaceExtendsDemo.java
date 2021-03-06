/**
 * 
 */
package xlr.chapter06.section02;

/**
*@Author:小龙人
*@File Name:InterfaceExtendsDemo.java
*@Created Time:2019年2月9日下午4:58:22
*@Introduce Function:TODO
*/
interface InterfaceA {
	int V_A = 10;
	/**
	 * 测试方法
	 */
	void testA();
}

interface InterfaceB {
	int V_B = 20;
	
	/**
	 * 测试方法
	 */
	void testB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
	int V_C = 30;
	/**
	 * 测试方法
	 */
	void testC();
}

/**
 * 
*@Author:小龙人
*@File Name:InterfaceExtendsDemo.java
*@Created Time:2019年2月9日下午5:07:27
*@Introduce Function:接口实现类
 */

public class InterfaceExtendsDemo implements InterfaceC {
	public static void main(String[] args) {
		// 使用第三个接口可以直接访问V_A,V_B,V_C常量
		System.out.println(InterfaceC.V_C);
		System.out.println(InterfaceC.V_A);
		System.out.println(InterfaceC.V_B);
		
		InterfaceC ic = new InterfaceExtendsDemo();
		// 调用接口中的方法
		ic.testA();
		ic.testB();
		ic.testC();
	}

	/**
	 * 测试方法
	 */
	@Override
	public void testA() {
		System.out.println("testA()方法");
	}

	/**
	 * 测试方法
	 */
	@Override
	public void testB() {
		System.out.println("testB()方法");
		
	}

	/**
	 * 测试方法
	 */
	@Override
	public void testC() {
		System.out.println("testC()方法");
		
	}
}
