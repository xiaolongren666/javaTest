/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:WhileDemo.java
*@Created Time:下午10:00:50
*@Introduce Function:while
*/
public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1-100的和是:" + sum);
	}
}
