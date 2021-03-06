/**
 * 
 */
package xlr.chapter08.task.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:Task1.java
*@Created Time:2019年2月19日下午7:30:47
*@Introduce Function:从键盘接收整数存入泛型集合中并对集合排序输出
*/
public class Task1 {
	final static int MAX = 5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < MAX; i++) {
			System.out.println("输入一个整数:");	
			array.add(scanner.nextInt());
		}
		scanner.close();
		
		Collections.sort(array);
		
		System.out.println("排序后");
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}
	}
}
