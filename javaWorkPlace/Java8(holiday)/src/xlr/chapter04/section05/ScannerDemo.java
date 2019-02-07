/**
 * 
 */
package xlr.chapter04.section05;

import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:ScannerDemo.java
*@Created Time:下午7:48:13
*@Introduce Function:TODO
*/
public class ScannerDemo {
	private final static int NUM = 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段文字:");
		// 设置分隔符
		sc.useDelimiter("\n");
		String s1 = sc.next();
		System.out.println("刚才输入的文字是：" + s1);
		
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		System.out.println("刚才输入的整数是:" + i);
		
		System.out.println("请输入一个小数：");
		float f = sc.nextFloat();
		System.out.println("刚才输入的整数是:" + f);
		
		int sum = 0;
		for (int j = 0; j < NUM; j++) {
			sum += sc.nextInt();
		}
		System.out.println("sum:" + sum);
		
		sc.close();
	}
	


}
