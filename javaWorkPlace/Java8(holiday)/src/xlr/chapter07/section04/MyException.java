/**
 * 
 */
package xlr.chapter07.section04;

import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:MyException.java
*@Created Time:2019年2月17日下午2:24:03
*@Introduce Function:自定义异常演示
*/
public class MyException {
	
	private final static int MIN = 20;
	private final static int MAX = 80;
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("请输入年龄");
			int age = scanner.nextInt();
			if((age < MIN) || (age > MAX)) {
				throw new AgeException("请输入合法的年龄");
			}
			System.out.println("您刚才输入的年龄是:" + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
