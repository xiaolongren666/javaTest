/**
 * 
 */
package xlr.chapter03.section03;

/*
*@Author:小龙人
*@File Name:ChangeParamDemo.java
*@Created Time:下午8:56:09
*@Introduce Function:可变参数
*/
public class ChangeParamDemo {
	/** 可变参数 */
	public int add(int a, int...b) {
		int sum = a;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ChangeParamDemo obj = new ChangeParamDemo();
		obj.add(1, 2);
		obj.add(1, 2, 3);
		
		int[] b = {1, 2, 3};
		obj.add(1, b);
	}
}
