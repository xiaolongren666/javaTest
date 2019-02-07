/**
 * 
 */
package xlr.chapter04.task;

import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:Task4.java
*@Created Time:下午8:56:00
*@Introduce Function:循环从键盘接受5个字符串，并连接成一个字符串
*/
public class Task4 {
	private final static int CAPACITY = 5;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < CAPACITY; i++) {
			System.out.println("输入第" + (i + 1) + "个字符串:");
			sb.append(in.nextLine());
		}
		
		System.out.println("字符串为：" + sb.toString());
		in.close();
		
	}

}
