/**
 * 
 */
package xlr.chapter04.task;

import java.util.Arrays;
import java.util.Random;

/**
*@Author:小龙人
*@File Name:Task1.java
*@Created Time:下午8:08:49
*@Introduce Function:随机生成10个不超过100的成熟，按照从小到大的顺序排序后输出
*/
public class Task1 {
	private final static int CAPACITY = 10;
	public static void main(String[] args) {
		int[] array = new int[CAPACITY];
		for (int i = 0; i < CAPACITY; i++) {
			array[i] = new Random().nextInt(100);
		}
		
		// 排序数组
		Arrays.sort(array);
		
		for (int temp : array) {
			System.out.print(temp + " ");
		}
	}
}
