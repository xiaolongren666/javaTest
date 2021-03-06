/**
 * 
 */
package xlr.chapter07.task.task1;

import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:ExceptionDemo.java
*@Created Time:2019年2月17日下午2:34:47
*@Introduce Function:从键盘接收两个数，计算两个数的加、减、乘、除四种算术运算，要求
*					使用异常处理语句，处理可能出现的异常情况
*/
public class ExceptionDemo {
	/**
	 * 加、减、乘、除
	 */
	/**
	 * @throws Exception
	 */
	public static void calculate() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a = scanner.nextInt();
		System.out.println("请输入运算符");
		String operator = scanner.next();
		System.out.println("请输入第二个数:");
		int b = scanner.nextInt();
		int sum = 0;
		
		switch (operator) {
			case "+":
				sum = a + b;
				break;
			case "-":
				sum = a - b;
				break;
			case "*":
				sum = a * b;
				break;
			case "/":
				sum = a / b;
				break;
			default:
				System.out.println("输入错误！");
		}
		System.out.println(a + operator + b + "=" + sum);
		scanner.close();
	}
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			calculate();
		} catch (Exception e) {
			System.out.println("输入错误！");
		}
	}
}
