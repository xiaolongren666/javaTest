/**
 * 
 */
package xlr.chapter08.section03;

import java.util.Stack;

/**
*@Author:小龙人
*@File Name:StackDemo.java
*@Created Time:2019年2月18日下午8:13:55
*@Introduce Function:Stack模仿栈的输出
*/
public class StackDemo {
	final static int MAX = 5;
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < MAX; i++) {
			s.add(i);
		}
		
		System.out.println(s);
		
		// 模仿栈的输出
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
