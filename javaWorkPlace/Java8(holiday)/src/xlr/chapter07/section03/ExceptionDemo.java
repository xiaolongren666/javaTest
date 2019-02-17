/**
 * 
 */
package xlr.chapter07.section03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author:小龙人
 * @File Name:ExceptionDemo.java
 * @Created Time:2019年2月17日下午2:13:57
 * @Introduce Function:throws和throw的用法
 */
public class ExceptionDemo {
	/**
	 * 除法
	 * 
	 * @throws InputMismatchException
	 * @throws ArithmeticException
	 */
	public static void division() throws InputMismatchException, ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数:");
		int b = scanner.nextInt();
		System.out.println("两个数的除法运算结果为:" + (a / b));
		System.out.println("程序运行完毕");
		scanner.close();
	}

	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		division();
	}
}
