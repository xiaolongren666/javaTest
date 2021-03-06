/**
 * 
 */
package xlr.chapter08.section03;

import java.util.LinkedList;

/**
*@Author:小龙人
*@File Name:LinkedListDemo.java
*@Created Time:2019年2月19日下午5:36:00
*@Introduce Function:LinkedList案例
*/
public class LinkedListDemo {
	final static int MAX = 5;
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < MAX; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.offer(5);
		System.out.println(list);
		list.offerFirst(-1);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.peekFirst());
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		
	}
}
