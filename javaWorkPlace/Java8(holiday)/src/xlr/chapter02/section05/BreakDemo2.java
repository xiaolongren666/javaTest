/**
 * 
 */
package xlr.chapter02.section05;

/*
*@Author:小龙人
*@File Name:BreakDemo2.java
*@Created Time:下午9:14:59
*@Introduce Function:break标签的使用
*/
public class BreakDemo2 {
	public static void main(String[] args) {
		outer:for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + ",j:" + j);
				if (j == 1) {
					break outer;
				}
			}
			System.out.println("---------");
		}
	}
}
