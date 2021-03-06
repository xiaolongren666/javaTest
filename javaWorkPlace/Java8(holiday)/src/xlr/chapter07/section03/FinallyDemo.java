/**
 * 
 */
package xlr.chapter07.section03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
*@Author:小龙人
*@File Name:FinallyDemo.java
*@Created Time:2019年2月17日下午2:03:42
*@Introduce Function: finally演示和新的释放资源的方法
*/
public class FinallyDemo {
	
	/**
	 * 演示新的释放资源的方法
	 */
	public static void test () {
		try (FileInputStream fis = new FileInputStream("c://txt")) {
			// 其他处理代码
		} catch (FileNotFoundException e) {
			System.out.println("出现错误！");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}
}
