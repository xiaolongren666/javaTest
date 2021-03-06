/**
 * 
 */
package xlr.chapter04.task;

import java.util.Random;

/**
*@Author:小龙人
*@File Name:task2.java
*@Created Time:下午8:19:29
*@Introduce Function: 模仿彩票23选5，随机生成5个不同的1-23的整数
*/
public class Task2 {
	private final static int CAPACITY = 5;
	public static void main(String[] args) {
		int[] array = new int[CAPACITY];
		int temp;
		for (int i = 0; i < CAPACITY; i++) {
			boolean unFinish = true;
			// 重复再生成
			while(unFinish) {
				temp = new Random().nextInt(23);
				unFinish = false;
				for (int j = 0; j < i; j++) {
					if(array[j] == temp) {
						unFinish = true;
						break;
					}
				}
				array[i] = temp;
			}
			
		}
		
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
