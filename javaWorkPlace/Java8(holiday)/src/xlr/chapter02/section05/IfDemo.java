/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:IfDemo.java
*@Created Time:下午9:20:57
*@Introduce Function:if
*/
public class IfDemo {
	public static void main(String[] args) {
		
		int grade = 67;
		
		if (grade < 0) {
			System.out.println("负数");
		} else {
			System.out.println("正数");
		}
		
		if (grade >= 90) {
			System.out.println("优秀");
		}
		
		if (grade >= 80) {
			System.out.println("良好");
		}
		
		if (grade >= 70) {
			System.out.println("中等");
		}
		
		if (grade >= 60) {
			System.out.println("及格");
		}
		
		if (grade <60) {
		System.out.println("不及格");
		}
	}
}
