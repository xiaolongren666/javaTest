/**
 * 
 */
package xlr.chapter02.section06;

/*
*@Author:小龙人
*@File Name:ArrayDemo.java
*@Created Time:下午10:04:39
*@Introduce Function:数组
*/
public class ArrayDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 10;
		
		int[] c = {1, 2, 3, 4, 5};
		
		int[] d = new int[]{1, 2, 3};
		
		int[] b = new int[10];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		
		System.out.println("b.length:" + b.length);
		for (int i = 0; i < b.length; i++) {
			b[i] = i+1;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// foreach循环
		for (int i : b) {
			System.out.println(i);
		}
	}
}
