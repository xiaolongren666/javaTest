/**
 * 
 */
package xlr.chapter03.section03;

/*
*@Author:小龙人
*@File Name:OverloadTest.java
*@Created Time:下午8:33:39
*@Introduce Function:方法重载测试
*/
public class OverloadTest {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 两个整形参数的和
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 两个float参数的和
	 */
	public float add(float a, float b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 两个double参数的和
	 */
	public double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		OverloadTest overloadTest = new OverloadTest();
		overloadTest.add(1, 2);
		overloadTest.add(3.1f, 2.3f);
		overloadTest.add(3.1, 2.3);
	}
}
