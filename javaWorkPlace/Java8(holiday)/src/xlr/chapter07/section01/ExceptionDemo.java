/**
 * 
 */
package xlr.chapter07.section01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:ExceptionDemo.java
*@Created Time:2019年2月17日下午1:45:15
*@Introduce Function:try..catch演示
*/
public class ExceptionDemo {
	
	/**
	 * 除法
	 */
	public static void division() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("请输入第一个数:");
			int a = scanner.nextInt();
			System.out.println("请输入第二个数:");
			int b = scanner.nextInt();
			System.out.println("两个数的除法运算结果为:" + (a / b));
		} catch (InputMismatchException e) {
			System.out.println("输入格式错误！");
		} catch (ArithmeticException e) {
			System.out.println("除数为0，出现错误！");
		} catch (Exception e) {
			System.out.println("未知错误！");
		} finally {
			scanner.close();
			System.out.println("程序运行完毕！");
		}
	}
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		division();
	}
}
