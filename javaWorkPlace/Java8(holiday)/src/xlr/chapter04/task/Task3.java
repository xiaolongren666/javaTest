/**
 * 
 */
package xlr.chapter04.task;

import java.util.Arrays;
import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:Task3.java
*@Created Time:下午8:50:16
*@Introduce Function:一次从键盘接受10个整数，并排序
*/
public class Task3 {
	private final static int CAPACITY = 10;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[CAPACITY];
		System.out.println("输入10个整数:");
		
		for (int i = 0; i < CAPACITY; i++) {
			System.out.println("输入第" + (i+1) + "个整数.");
			array[i] = in.nextInt();
		}
		
		Arrays.sort(array);
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}

}
