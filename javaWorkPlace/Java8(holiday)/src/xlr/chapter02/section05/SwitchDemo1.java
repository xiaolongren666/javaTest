/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:SwitchDemo1.java
*@Created Time:下午9:26:02
*@Introduce Function:switch
*/
public class SwitchDemo1 {
	public static void main(String[] args) {
		int grade = 67;
		switch (grade / 10) {
			case 10:
			case 9:
				System.out.println("优秀");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 7:
				System.out.println("中等");
				break;
			case 6:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格");
		}
	}
}
