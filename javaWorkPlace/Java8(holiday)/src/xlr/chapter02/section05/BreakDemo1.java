/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:BreakDemo1.java
*@Created Time:下午9:12:05
*@Introduce Function:break使用
*/
public class BreakDemo1 {
	public static void main(String[] args) {
		for (int i = 0;i < 10;i++) {
			if (i == 5) {
				System.out.println("找到目标，退出循环！");
				return;
			}
			System.out.println(i);
		}
		System.out.println("程序终止。。。。");
	}
}
