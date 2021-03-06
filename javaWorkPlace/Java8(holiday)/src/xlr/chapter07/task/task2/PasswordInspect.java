/**
 * 
 */
package xlr.chapter07.task.task2;

import java.util.Scanner;

/**
*@Author:小龙人
*@File Name:PasswordInspect.java
*@Created Time:2019年2月17日下午3:03:04
*@Introduce Function:用户输入的密码长度不再6~10之间就抛出自定义的PasswordException异常对象
*/
public class PasswordInspect {
	private final static int MIN = 6;
	private final static int MAX = 10;
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("请输入密码:");
			String password = scanner.nextLine();
			if (password.length() < MIN || password.length() > MAX) {
				throw new PasswordException("密码长度不在6-10之间！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序运行完毕！");
		
		
	}
}
