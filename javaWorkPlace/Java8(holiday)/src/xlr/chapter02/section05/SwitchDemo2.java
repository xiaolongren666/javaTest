/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:SwitchDemo2.java
*@Created Time:下午9:29:44
*@Introduce Function:TODO
*/
public class SwitchDemo2 {
	public static void main(String[] args) {
		String season = "秋天";
		
		switch (season) {
			case "春天":
				System.out.println("春暖花开");
				break;
			case "夏天":
				System.out.println("夏日炎炎");
				break;
			case "秋天":
				System.out.println("秋高气爽");
				break;
			case "冬天":
				System.out.println("冬雪皑皑");
				break;
			default:
				System.out.println("季节输入错误！");
		}
	}
}
