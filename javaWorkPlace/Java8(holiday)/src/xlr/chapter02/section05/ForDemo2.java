/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:ForDemo2.java
*@Created Time:下午9:54:28
*@Introduce Function:for
*/
public class ForDemo2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1-100的和是:" + sum);
	}
}
